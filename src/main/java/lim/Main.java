package lim;

import lim.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String xmlFilePath =  "/FF_2017-12-01_10-47-17.xml";

        try {
            // JAXBContext and XML Data Parsing
            JAXBContext jaxbContext = JAXBContext.newInstance(TrainData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InputStream inputStream = Main.class.getResourceAsStream(xmlFilePath);
            TrainData trainData = (TrainData) unmarshaller.unmarshal(inputStream);

            System.out.println("Shortcode: " + trainData.getRil100());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}

