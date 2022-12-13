package templatemethod;

public class JSONRenderer extends Data_Renderer{

    @Override
    public String data_Read() {
        return "JSON Data";
    }

    @Override
    public String data_Processed(String a) {
        return "Processed "+ a;
    }
}
