package serialization;
import java.io.*;
public class SerializedClass {
    public static void main(String[] args) {
        Vehicle polo = new Vehicle("Volksvagen",2021,"Pologt");
        FileOutputStream fileOutputStream= null;
        ObjectOutputStream objectOutputStream=null;
        try {
             fileOutputStream = new FileOutputStream("polo.ser");
             objectOutputStream = new ObjectOutputStream(fileOutputStream);
             objectOutputStream.writeObject(polo);
            System.out.println("Serialized data is stored in polo.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
