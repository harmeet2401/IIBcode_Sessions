package stringclass;
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


    }
}
