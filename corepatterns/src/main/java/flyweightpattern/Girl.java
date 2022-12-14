package flyweightpattern;

public class Girl extends Human{
    private String gender;
    public Girl(){
        gender="girl";
    }
    @Override
    void weights(int w) {
        System.out.println(gender +" Weights : "+ w);
    }
}
