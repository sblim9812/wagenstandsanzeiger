package lim.jaxbconfig;

import lim.model.TrainData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class JAXBContextProvider {
    public static TrainData parseTrainData() {
        String xmlFilePath =  "/FF_2017-12-01_10-47-17.xml";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TrainData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InputStream inputStream = JAXBContextProvider.class.getResourceAsStream(xmlFilePath);
            return (TrainData) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
