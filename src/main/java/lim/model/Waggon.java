package lim.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Waggon {
    @Getter
    @Setter
    private Sections sections;

    @XmlElement(nillable = true, name = "number")
    @Getter
    @Setter
    private int waggonNumber;
}
