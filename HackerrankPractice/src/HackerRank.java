//Question 36 - java simple cyhper


//Ascii value of 'A'=65 'Z'=90
class Cypher{
    public String simpleCypher(String encrypted, int k){
        //since you have to cycle between 26 letters of the English alphabet if k=27 its equivalent to k=1
        while(k>26)
        {
            k%=26;
        }
        String ans="";
        for(int i=0;i<encrypted.length();i++) {
            //find relative offset to the letter 'A'
            int var = encrypted.charAt(i) - 65;
            var = (var - k) % 26;
            //if offset is positive
            if (var >= 0) {
                ans += (char) (65 + var);
            }
            else {
                // 91 because we are performing subtraction we have to consider the last char also 'Z'  (90+1)
                ans+=(char)(91+var);
            }
        }
        return ans;
    }
}


//debug using different inputs
public class HackerRank {
    public static void main(String[] args) {
    Cypher c=new Cypher();
        System.out.println( "Int code print : --"+'A');

        System.out.println(c.simpleCypher("ABCD",27));
        System.out.println("------------------------------------");
        System.out.println(c.simpleCypher("A",5));
        System.out.println("------------------------------------");
        System.out.println(c.simpleCypher("J",34));
    }
}
