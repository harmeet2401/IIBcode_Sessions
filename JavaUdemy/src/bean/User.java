package bean;

public class User {
    public String name;
    public String address;
    public int userid;

    /**
     * using below constructor we can ask for the values from the user in services classes
     * @param name
     * @param address
     * @param userid
     */
    public User(String name , String address , int userid){
        this.address = address;
        this.name = name;
        this.userid = userid;
    }

    /**
     * we are setting the default values in below cons
     */
    public User(){
        this("Bobby","Get the address",9889);
    }


}

