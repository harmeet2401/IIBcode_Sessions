package org.example;

import enumsingleton.EnumSingleTon;
import singletonclasses.DateUtil;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {
    public static ObjectInputStream ois;
    public static ObjectOutputStream oos;
    public static void main(String[] args) throws IOException, ClassNotFoundException {

            System.out.println(" ---- Main Class ----");
            DateUtil dateUtil1 = DateUtil.getInstance();
            DateUtil dateUtil2 = DateUtil.getInstance();
            System.out.println(dateUtil1.hashCode());
            System.out.println(dateUtil2.hashCode());
            System.out.println(dateUtil1 == dateUtil2);
            //DateUtil d = new DateUtil(); will not be able to do that because constructor is
            // private and made the class singleton
            //singletonSerializableIssue();
            singletonReflectionIssue();

    }
    public static void singletonSerializableIssue() throws IOException {
        try{
            System.out.println("-----singletonSerializableIssue-----");
            /**
             * Serialization and de-serialization problem when we write the object to the file and read it both the object are different.
             * As shown below.
             */
            DateUtil dateUtil3 = DateUtil.getInstance();
            oos = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/IBMADMIN/oos/dateUtil.ser")));
            oos.writeObject(dateUtil3);
            DateUtil dateUtil4 = null;
            ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/IBMADMIN/oos/dateUtil.ser")));
            dateUtil4 = (DateUtil) ois.readObject();
            System.out.println(dateUtil3 == dateUtil4); // ---- this shows false as due to serialisation the object value changes while reading it.
        }
            catch(Exception e){
            e.getCause();
        }finally {
            oos.close();
            ois.close();
        }
    }
    public static void singletonReflectionIssue() {
        System.out.println("-----singletonReflectionIssue-----");
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = null;
        Constructor[] declaredConstructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor:declaredConstructors) {
            constructor.setAccessible(true);
            try {
                dateUtil2 = (DateUtil) constructor.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            break;
        }
        System.out.println(dateUtil1.hashCode());
        System.out.println(dateUtil2.hashCode());

        // ENUM to be used to resolve singleton issue. Below LOC shows how we create an instance of ENUM to set the name . Jo object krta hai
        // jisko ham constructor ki help se bnate hai usse ham ENUM se binna constructor se krte hai.
        System.out.println("----------- ENUM -----------");

        EnumSingleTon instance = EnumSingleTon.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Harmeet");
        System.out.println(instance.getName());
    }
}