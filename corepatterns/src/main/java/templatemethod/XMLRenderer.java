package templatemethod;

public class XMLRenderer extends Data_Renderer{

    @Override
    public String data_Read() {
        return "XML Data";
    }

    @Override
    public String data_Processed(String a) {
        return "Processed "+ a;
    }
}
