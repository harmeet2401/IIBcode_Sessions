package main.bean;

public class Students {
    private String name;
    private String address;
    private String streamname;
    private int id;

    private int books;

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", streamname='" + streamname + '\'' +
                ", id=" + id +
                ", books=" + books +
                '}';
    }

    public Students(String name, String address, String streamname, int id, int books) {
        this.name = name;
        this.address = address;
        this.streamname = streamname;
        this.id = id;
        this.books=books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreamname() {
        return streamname;
    }

    public void setStreamname(String streamname) {
        this.streamname = streamname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
