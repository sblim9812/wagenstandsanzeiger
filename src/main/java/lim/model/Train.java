package lim.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Train {
    @Getter
    @Setter
    private TrainNumbers trainNumbers;

    @Getter
    @Setter
    private Waggons waggons;
}
