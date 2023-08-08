package lim.jaxbconfig;

import lim.model.TrainData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class JAXBContextProvider {
    public static TrainData openXmlFile(String ril100) {
        String folderPath = "data/";
        TrainData trainData = null;

        try {
                ClassLoader classLoader = JAXBContextProvider.class.getClassLoader(); // 변경 필요
                URL resourceURL = classLoader.getResource(folderPath);

                if (resourceURL != null) {
                    File resourceFolder = new File(resourceURL.toURI());
                    File[] files = resourceFolder.listFiles();

                    if (files != null) {
                        for (File file : files) {
                            if (file.isFile() && file.getName().startsWith(ril100) && file.getName().endsWith(".xml")) {
                                trainData = parseXmlFile(file.getAbsolutePath());
                                break;
                            }
                        }
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trainData;
    }

    public static TrainData parseXmlFile(String xmlFilePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TrainData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InputStream inputStream = new FileInputStream(xmlFilePath);;
            return (TrainData) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
