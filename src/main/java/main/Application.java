package main;

import xml.elements.Day;
import xml.elements.Zaznam;
import xml.rootElements.Meniny;
import xml.rootElements.Namesday;
import xmlManipulation.ReadXml;
import xmlManipulation.WriteXml;

import java.util.ArrayList;

public class Application {

    private static final String FILE_NAME_FOR_MENINY_XML = "src/main/resources/meninyWrite.xml";
    private static final String FILE_NAME_FOR_NAMESDAY_XML = "src/main/resources/namesday.xml";
    private static final String FILE_NAME_FOR_NAMESDAY_FINAL_XML = "src/main/resources/namesday_final.xml";

    public static void main(String[] args) {

//        writeXmlFileMeniny();
//        readXmlFileMeniny();

//        createFinalList();

        ReadXml<Namesday> readXml = new ReadXml<>(Namesday.class);
        Namesday namesday = readXml.readXmlFile(FILE_NAME_FOR_NAMESDAY_FINAL_XML);
        Day foundDay = namesday.getListOfDays().stream().filter(day -> day.getDate().equals("0607")).findAny().orElse(null);
        System.out.println(foundDay);
    }


    private static void createFinalList() {
        ArrayList<Day> days = new ArrayList<>();
        ReadXml<Meniny> readXml = new ReadXml<>(Meniny.class);
        Meniny meniny = readXml.readXmlFile(FILE_NAME_FOR_NAMESDAY_XML);
        meniny.getZoznamDni().forEach(zaznam -> {
            days.add(new Day()
                    .setCz(zaznam.getCz())
                    .setCzHoliday(zaznam.getCzSviatky())
                    .setDate(reverseDate(zaznam.getDen()))
                    .setSk(zaznam.getSk())
                    .setSkHoliday(zaznam.getSkSviatky()));
        });
        days.forEach(System.out::println);
        Namesday namesday = new Namesday();
        namesday.setListOfdays(days);
        WriteXml<Namesday> xmlNamesday = new WriteXml<>(Namesday.class);
        xmlNamesday.writeXmlFile(FILE_NAME_FOR_NAMESDAY_FINAL_XML, namesday);
    }

    private static String reverseDate(String date){
        return date.substring(2,4) + date.substring(0,2);
    }

    private static void readXmlFileMeniny() {
        ReadXml<Meniny> readXml = new ReadXml<>(Meniny.class);
        Meniny meniny = readXml.readXmlFile(FILE_NAME_FOR_MENINY_XML);
        meniny.getZoznamDni().forEach(System.out::println);
    }

    private static void writeXmlFileMeniny(){
        ArrayList<Zaznam> xml = new ArrayList<>();

        Zaznam zaznam1 = new Zaznam().setAt("AT").setCzSviatky("CZSV").setDen("DEN").setHu("HU")
                .setPl("PL").setSkd("SKD").setSkSviatky("SKSV").setSk("SK");

        Zaznam zaznam2 = new Zaznam().setAt("AT2").setCzSviatky("CZSV2").setDen("DEN2")
                .setPl("PL").setSk("SK");

        xml.add(zaznam1);
        xml.add(zaznam2);

        Meniny meniny = new Meniny();
        meniny.setZoznamDni(xml);

        WriteXml<Meniny> writeXml = new WriteXml<>(Meniny.class);
        writeXml.writeXmlFile(FILE_NAME_FOR_MENINY_XML, meniny);
    }
}
