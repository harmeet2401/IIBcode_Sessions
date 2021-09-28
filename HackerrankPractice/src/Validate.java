public class Validate {
    public static String  Validate(String name){
        String n = "";
          for (char ch : name.toCharArray()) {
            if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')
                    ||(ch==' ') )){
                System.out.println("The name is not valid");
                throw new IllegalArgumentException("Try again with a valid name");
            }
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
                n = n+ch;
            }else {
                n= n+ch;
            }
        }
        System.out.println("The name is valid"+n);
        StringBuilder reversedName  = new StringBuilder();
        reversedName.append(n);
        reversedName.reverse();
        System.out.println("Reversed String name : --- "+ reversedName);

    return reversedName.toString();
    }
}
