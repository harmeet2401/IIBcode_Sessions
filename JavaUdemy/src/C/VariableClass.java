package C;

import com.sun.beans.editors.BooleanEditor;

public class VariableClass {
    //Boolean x = false;
    //int x = 991076801;
    //long x = +919910768018l;  more mem usage then int
    //short x = 900; less mem usage then long
    //double x = 10999999.999199999189918999223232938380132131739821737739d;
    //float x = 9001991991919919991.99918881999198119918811919f;
    char x = 'a';
    //char x = '\u0016';

    public static void main(String[] args) {
        VariableClass c= new VariableClass();
        System.out.println(c.x);

        /*Type casting
         */
        byte x = 10;
        byte y = 90;
        byte z = (byte)(x + y); // this is the explicit casting which is required in case of byte

        System.out.println(z);
    }
}
