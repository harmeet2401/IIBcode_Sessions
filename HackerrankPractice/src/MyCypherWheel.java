import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

class decryptionService{

}
public class MyCypherWheel {
    public static void main(String[] args) {
        System.out.println(new Integer('A'));
        System.out.println(new Integer('Z'));
        System.out.println((char)('V'-2));
        String strout = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (char c: arr) {
            if(c!='A') {
                strout += (char) (c - 2);
            }else{
                strout+='Y';
            }
        }
        System.out.println(strout);

    }
}
