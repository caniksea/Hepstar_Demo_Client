package com.caniksea.hc.util;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class XMLConverter {

    public static String jaxbObj2XML(Object o, Class aClass){
        String xmlRequest = null;
        Marshaller marshaller = Misc.getMarshaller(aClass);
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(o, stringWriter);
            xmlRequest = stringWriter.toString();
        } catch (PropertyException e) {
            e.printStackTrace();
            System.out.println(XMLConverter.class + " - jaxbObj2XML | PropertyException: "+ e.getMessage());
        } catch (JAXBException e) {
            e.printStackTrace();
            System.out.println(XMLConverter.class + " - jaxbObj2XML | JAXBException: "+ e.getMessage());
        }
        return xmlRequest;
    }

    public static Object jaxbXML2Obj(String xmlstring, Class aClass){
        Object o = null;
        Unmarshaller unmarshaller = new Misc().getUnMarshaller(aClass);
        try {
            o = unmarshaller.unmarshal(new StringReader(xmlstring));
        } catch (JAXBException e) {
            e.printStackTrace();
            System.out.println(XMLConverter.class + " - jaxbXML2Obj | JAXBException: "+ e.getMessage());
        }
        return o;
    }
}
