package flyweightpattern;

public class Boy extends Human{
    private String gender;
    public Boy(){
        gender="boy";
    }
    @Override
    void weights(int w) {
        System.out.println(gender +" Weights : "+ w);
    }
}
