package com.caniksea.hc.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

public class Misc {

    public static Marshaller getMarshaller(Class aClass) {
        Marshaller m = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(aClass);
            m = jaxbContext.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
            System.out.println(Misc.class + " - getMarshaller | JAXBException: " + e.getMessage());
        }
        return m;
    }

    public static String getPropertyValue(String propertyName){
        String propValue = "";
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        try {
            InputStream inputStream = classLoader.getResourceAsStream("config.properties");
            properties.load(inputStream);
            propValue = properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(Misc.class + " - getPropertyValue | FileNotFoundException: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(Misc.class + " - getPropertyValue | IOException: "+ e.getMessage());
        }
        return propValue;
    }

    public static String getUniqueSessionID(){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return "HC-" + uuid.substring(uuid.length() - 15);
    }

    public static int getUniqueID() {
        return 1 + new Random().nextInt(999);
    }

    public static String getDateFromInput(String dateString) {
        DateFormat dateFormat = getDateFormat("yyyy-MM-dd");
        Date sDate = null;
        try {
            sDate = dateFormat.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println(Misc.class + " - getDateFromInput | ParseException: "+ e.getMessage());
        }
        return dateFormat.format(sDate);
    }

    private static DateFormat getDateFormat(String s) {
        return new SimpleDateFormat(s);
    }

    public Unmarshaller getUnMarshaller(Class aClass) {
        Unmarshaller unmarshaller = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(aClass);
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
            System.out.println(Misc.class + " - getUnMarshaller | JAXBException: "+ e.getMessage());
        }
        return unmarshaller;
    }
}
