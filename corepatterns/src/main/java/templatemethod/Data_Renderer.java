package templatemethod;

public abstract class  Data_Renderer {
    void data_Render(){
        String a = data_Read();
        System.out.println(data_Processed(a));
    }

    public abstract String data_Read();
    public abstract String data_Processed(String a);
}
