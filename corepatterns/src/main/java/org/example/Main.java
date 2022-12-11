package org.example;

import singletonclasses.DateUtil;

import java.io.*;
import java.util.Date;

public class Main {
    public static ObjectInputStream ois;
    public static ObjectOutputStream oos;
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try {
            System.out.println(" ---- Main Class ----");
            DateUtil dateUtil1 = DateUtil.getInstance();
            DateUtil dateUtil2 = DateUtil.getInstance();
            System.out.println(dateUtil1.hashCode());
            System.out.println(dateUtil2.hashCode());
            System.out.println(dateUtil1 == dateUtil2);
            //DateUtil d = new DateUtil(); will not be able to do that because constructor is
            // private and made the class singleton

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
}