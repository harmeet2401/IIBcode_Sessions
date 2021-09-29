//Question 35- How many words

class WordCal{
    public int findWords(String arr){
        int ans=0;
        String[] temp=arr.split("\\s");
        for (String x:temp) {
            //using regular expression to find out which words contain digits or illegal special characters (add more special chars if needed).
            if(x.matches("([a-zA-Z]+[.,?!\\-]*)+")){
                ans++;
            }
        }
        return ans;
    }
}


public class Words {
    public static void main(String[] args) {
        WordCal wc=new WordCal();

        /*String str="He is a good programmer, he won 865 competitions, but sometimes he doesn't. What do you think? " +
                "All test-cases should pass. Done-done?";*/

        String str="jds dsagf lkdf kdsa fkajsd, asdf lkda ads? asd agda ds jf[1. asd asd as 898 sda WE DE 7873 dsaf ds RAMU 748 dj.";

        System.out.println(wc.findWords(str));
    }
}



















