package serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {
//   transient private String brand; // this variable will not be included which serializing the object value
   private String brand; // this variable will not be included which serializing the object value
   private  int year ;
    private String model;

    public Vehicle(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
