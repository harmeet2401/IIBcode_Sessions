package stringclass;

import java.util.Locale;

public class stringClasses {

      public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        stringClasses si = new stringClasses();
        stringClasses si1 = new stringClasses();
        String str1 = "Testing";
        str1 = str1.concat("-again");
          System.out.println(str1 + str1.charAt(0)+ str1.split(",") );
          String str2 = "Testing";
        if(si==si1){
            System.out.println("Same");
        }else{
            System.out.println("not same");
        }
          for (int i = 0; i < str1.toCharArray().length; i++) {
              System.out.println(str1.toCharArray()[i]);
          }
          System.out.println("--------------------------------------------------------------------------------");
          StringBuffer strb = new StringBuffer("Welcome to java ");
          strb.append("((");
          strb.reverse();
          strb.insert(1,"get the old string ");

          System.out.println(strb);

          StringBuilder stringBuilder = new StringBuilder("Welcome to java ");
          stringBuilder.append("@@");
          stringBuilder.reverse();
          stringBuilder.insert(2,"get the new strring ");
          System.out.println(stringBuilder);

          System.out.println(printResult());


    }

    public static String printResult(){
        String finalStr = "       JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy    ";
        finalStr = finalStr.trim().toLowerCase(Locale.ROOT).replaceAll(",","-");
        String strArr[] = finalStr.split(" ");
        return finalStr+ "\nTotal words in this string is "+strArr.length;
    }
}
