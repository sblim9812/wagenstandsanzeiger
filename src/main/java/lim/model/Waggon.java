package lim.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Waggon {
    @Getter
    @Setter
    @XmlElementWrapper(name = "sections")
    @XmlElement(name = "identifier")
    private List<String> sections;

    @XmlElement(nillable = true)
    @Getter
    @Setter
    private Integer number;
}
