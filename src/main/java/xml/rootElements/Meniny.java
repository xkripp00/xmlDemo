package xml.rootElements;

import xml.elements.Zaznam;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(namespace = "meniny")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meniny {

    @XmlElementWrapper(name = "meniny")
    @XmlElement(name = "zaznam")
    private ArrayList<Zaznam> zoznamDni;

    public ArrayList<Zaznam> getZoznamDni() {
        return this.zoznamDni;
    }

    public Meniny setZoznamDni(ArrayList<Zaznam> zoznamDni) {
        this.zoznamDni = zoznamDni;
        return this;
    }
}
