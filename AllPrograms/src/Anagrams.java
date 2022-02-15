import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println(funWithAnagrams(size));
    }
    public static ArrayList<String> funWithAnagrams(int size){
        ArrayList<String> arrayList = new ArrayList<>(size);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of array list ");
        for (int i = 0; i < size; i++) {
                arrayList.add(sc.nextLine());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size(); j++) {

                if(checkAnagram(arrayList.get(i),arrayList.get(j))){
                    arrayList.remove(j);
                }

            }
        }
        return arrayList;
    }
    public static boolean checkAnagram(String str1 , String str2){
        ArrayList<Character> str1list = new ArrayList<>(str1.length());
        ArrayList<Character> str2list = new ArrayList<>(str2.length());
        String st1="",st2="";
        for (int i = 0; i < str1.toCharArray().length; i++) {
            str1list.add(str1.toCharArray()[i]);
        }
        Collections.sort(str1list);

        for (int i = 0; i <str1list.size() ; i++) {
             st1 = st1 + str1list.get(i);
        }
        for (int j = 0; j < str2.toCharArray().length; j++) {
            str2list.add(str2.toCharArray()[j]);
        }
        Collections.sort(str2list);

        for (int i = 0; i <str2list.size() ; i++) {
            st2 = st2 + str2list.get(i);
        }


        if(st1.length()==st2.length()){
            if(st1.equalsIgnoreCase(st2)){
                return true;
            }else{
                return false;
            }

        }
        else{
            return false;
        }

    }
}
