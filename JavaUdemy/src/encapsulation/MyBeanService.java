package encapsulation;

public class MyBeanService extends Mybean {
    public static void main(String[] args) {
        MyBeanService my = new MyBeanService();
        my.setField1("Field-1");
        my.setField2("Field-2");
        my.setField3("Field-3");
        my.setField4("Field-4");
        my.setField5("Field-5");
        System.out.println(my.getField1());
    }

}
