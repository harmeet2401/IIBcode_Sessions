package variableModifiers;
public class VariableModifiers {
    //static int i = 000000000000000000000000000001 ; //single copy of the variable , value can be changed
    //final int i = 000000000000000000000000000001 ; immutable value or can not be changed.

    /**
     * its used for variables not be included as part if the
     * serialized string or value used for transmitting data to other system
     */
    //transient int i = 0000000000000000000000000000000000000000000000007;
    volatile  int i = 199; // used in making the process thread safe
    public static void main(String[] args) {
        VariableModifiers v = new VariableModifiers();
        System.out.println(v.i);
        v.i = 100;
        System.out.println(v.i);
    }
}
