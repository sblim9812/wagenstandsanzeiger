package lim.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

public class Track {
        @XmlElementWrapper(name = "trains")
        @XmlElement(name = "train")
        private List<Train> trains;

        @XmlTransient
        private int number; // ignored during XML parsing
}
