package xmlManipulation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class WriteXml<T>  {

    final Class<T> typeParameterClass;

    public WriteXml(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public void writeXmlFile(String xmlFile, T xmlForWriting)  {

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(typeParameterClass);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(xmlForWriting, new File(xmlFile));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
