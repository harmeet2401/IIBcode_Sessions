package serialization;
import java.io.*;
public class Deserialization {
    public static void main(String[] args) {
        Vehicle polo = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("polo.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            polo = (Vehicle) objectInputStream.readObject();
            System.out.println("readable deserialized objects "+polo.getBrand() +
                    "- "+polo.getModel()+" - "+polo.getYear());
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        finally {

        }
    }

}
