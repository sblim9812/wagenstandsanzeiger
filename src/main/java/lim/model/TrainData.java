package lim.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "station")
@XmlAccessorType(XmlAccessType.FIELD)
public class TrainData {
    @XmlElement(name = "shortcode")
    @Getter
    @Setter
    private String ril100;

    @XmlElementWrapper(name = "tracks")
    @XmlElement(name = "track")
    @Getter
    @Setter
    private List<Track> tracks;
}



