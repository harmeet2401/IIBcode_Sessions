package templatemethod;

public class TestClass {
    public static void main(String[] args) {
        Data_Renderer data_renderer = new XMLRenderer();
        data_renderer.data_Render();
        Data_Renderer data_renderer1 = new JSONRenderer();
        data_renderer1.data_Render();
    }

}
