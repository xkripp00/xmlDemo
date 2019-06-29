package xml.elements;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "zaznam")
@XmlType(propOrder = { "den", "sk", "cz", "skd", "skSviatky", "czSviatky", "hu", "pl", "at" })
public class Zaznam {

    private String den;
    private String sk;
    private String skd;
    private String skSviatky;
    private String czSviatky;
    private String hu;
    private String pl;
    private String at;
    private String cz;

    @XmlElement(name = "den")
    public String getDen() {
        return den;
    }

    public Zaznam setDen(String den) {
        this.den = den;
        return this;
    }

    @XmlElement(name = "SK")
    public String getSk() {
        return sk;
    }

    public Zaznam setSk(String sk) {
        this.sk = sk;
        return this;
    }

    @XmlElement(name = "SKd")
    public String getSkd() {
        return skd;
    }

    public Zaznam setSkd(String skd) {
        this.skd = skd;
        return this;
    }

    @XmlElement(name = "SKsviatky")
    public String getSkSviatky() {
        return skSviatky;
    }

    public Zaznam setSkSviatky(String skSviatky) {
        this.skSviatky = skSviatky;
        return this;
    }

    @XmlElement(name = "CZsviatky")
    public String getCzSviatky() {
        return czSviatky;
    }

    public Zaznam setCzSviatky(String czSviatky) {
        this.czSviatky = czSviatky;
        return this;
    }

    @XmlElement(name = "HU")
    public String getHu() {
        return hu;
    }

    public Zaznam setHu(String hu) {
        this.hu = hu;
        return this;
    }

    @XmlElement(name = "PL")
    public String getPl() {
        return pl;
    }

    public Zaznam setPl(String pl) {
        this.pl = pl;
        return this;
    }

    @XmlElement(name = "AT")
    public String getAt() {
        return at;
    }

    public Zaznam setAt(String at) {
        this.at = at;
        return this;
    }

    public String getCz() {
        return cz;
    }

    @XmlElement(name = "CZ")
    public Zaznam setCz(String cz) {
        this.cz = cz;
        return this;
    }

    @Override
    public String toString() {
        return "Zaznam{" +
                "den='" + den + '\'' +
                ", sk='" + sk + '\'' +
                ", skd='" + skd + '\'' +
                ", skSviatky='" + skSviatky + '\'' +
                ", czSviatky='" + czSviatky + '\'' +
                ", hu='" + hu + '\'' +
                ", pl='" + pl + '\'' +
                ", at='" + at + '\'' +
                ", cz='" + cz + '\'' +
                '}';
    }
}
