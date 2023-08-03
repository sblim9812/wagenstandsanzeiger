package lim.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Track {

        @XmlElementWrapper(name = "trains")
        @XmlElement(name = "train")
        @Getter
        @Setter
        private List<Train> trains;

        @XmlTransient
        @Getter
        @Setter
        private int number; // ignored during XML parsing
}
