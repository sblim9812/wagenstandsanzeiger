package lim.controller;

import lim.jaxbconfig.JAXBContextProvider;
import lim.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static lim.jaxbconfig.JAXBContextProvider.openXmlFile;

@RequiredArgsConstructor
@RestController
public class TrainController {
    @GetMapping("/station/{ril100}/train/{trainNumber}/waggon/{number}")
    public ResponseEntity<Map<String, List<String>>> getSections(@PathVariable String ril100, @PathVariable int trainNumber
            , @PathVariable(required = false) Integer number) {

        TrainData trainData = openXmlFile(ril100);

        if (trainData == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        List<String> sections = trainData.getTracks().stream()
                .filter(track -> ril100.equals(trainData.getRil100()))
                .flatMap(track -> track.getTrains().stream())
                .filter(train -> trainNumber == train.getTrainNumbers().getTrainNumber())
                .flatMap(train -> train.getWaggons().stream())
                .filter(waggon -> number == null || Objects.equals(number, waggon.getNumber()))
                .map(Waggon::getSections)
                .findFirst()
                .orElse(null);

        if (sections != null) {
            Map<String, List<String>> response = new HashMap<>();
            response.put("sections", sections);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
