import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Encryptor {
    public static void main (String arg[]){
        System.out.println("testing ");
        Scanner sc = new Scanner(System.in);
        //String word = sc.nextLine();
        //System.out.println(Encrypt.code(word));
        String name = sc.nextLine();
        if(Validate.validate(name)) {
            System.out.println("valid name entered");
            System.out.println(getEncryptedname(name));
        }else{
            throw new IllegalArgumentException("Try again will valid name");
        }
    }
    public static String getEncryptedname(String name){
        char[] arg = name.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder("");
        for (char c : arg) {
            if ('A' <= c & c<='Z') {
                arrayList.add(Character.toLowerCase(c));
            }else{
                arrayList.add(c);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }

}
class Validate{
    public static StringBuilder returnstr;
    public static String code(String word){
        System.out.println(word);
        char[] arg = word.toCharArray();
        String rstr = "";
        ArrayList<Character> ar = new ArrayList<Character>();
        for (int i = 0; i < arg.length; i++) {
            ar.add(arg[i]);
        }
        System.out.println("------------- check before "+ ar);
        Collections.reverse(ar);
        System.out.println("------------- check "+ ar);
        for (Character character : ar) {
            rstr = rstr + character;
        }
        return rstr;
    }
    public static boolean validate(String name){
        char[] ar=name.toCharArray();
        for (char c : ar) {
            boolean b = !( ((c >= 'a' | c >= 'A') & (c <= 'z' | c <= 'Z')) | c==' ');
            if (b)
            {
                return false;
            }
        }
        return true;
    }
}
