package bean;

import bean.bean.UserParent;

public class User extends UserParent {
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
        // here compiler will automaticallly add the super() call which will call the parent class constructor.
        this.address = address;
        this.name = name;
        this.userid = userid;
    }

    /**
     * we are setting the default values in below cons
     */
    public User(){
        //this("Bobby","Get the address",9889);
        //super(new User("Bobby","Get the address",9889),"adminuser"); // this will call the constructor of parent class that we extends above
    }


}

