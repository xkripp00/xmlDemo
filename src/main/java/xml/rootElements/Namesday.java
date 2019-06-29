package xml.rootElements;

import xml.elements.Day;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(namespace = "calendar")
@XmlAccessorType(XmlAccessType.FIELD)
public class Namesday {

    @XmlElementWrapper(name = "namesday")
    @XmlElement(name = "day")
    private ArrayList<Day> listOfdays;

    public ArrayList<Day> getListOfDays() {
        return listOfdays;
    }

    public Namesday setListOfdays(ArrayList<Day> listOfdays) {
        this.listOfdays = listOfdays;
        return this;
    }
}
