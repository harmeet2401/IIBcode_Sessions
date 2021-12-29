package inheritance;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

public class SportsPerson extends Human{
    public String playSoftBall;

    public static void lesswalk(Human h){
        System.out.println(h.name + ": walks less");
    }
    public static void main(String[] args) {
        SportsPerson sportsPerson = new SportsPerson();
        sportsPerson.name="Dhoni";
        sportsPerson.age = 34;
        sportsPerson.playSoftBall= "Cricket";
        sportsPerson.gender="Male";
        System.out.println(sportsPerson.name +" of age :"+ sportsPerson.age+
                " and gender : "+ sportsPerson.gender +" play : "+ sportsPerson.playSoftBall);
        sportsPerson.speak();
        lesswalk(sportsPerson);  //---------------------------------------------------------> subclass refenrce means HUman super set hai and sportsperson is subset humans ka
    }
    public  void speak(){
        System.out.println(name + ": can speak a faster way.");
    }
}
