package lim.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Waggons {
    @Getter
    @Setter
    @XmlElementWrapper(name = "waggons")
    @XmlElement(name = "waggon")
    private List<Waggon> waggons;
}
