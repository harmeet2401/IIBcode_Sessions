//Question 32 - Array Challenge

import java.util.ArrayList;
import java.util.Scanner;

class Difference{
    public int[] findDiff(ArrayList<Integer> arr){
        int[] ans=new int[arr.size()];
        ans[0]=0;  // initialize first index as 0
        int sum= arr.get(0);
        for(int i=1;i< arr.size(); i++){
            //the problem has been reduced as below given array position i=2
            //equation will be 0+(3-2)+(3-1)
            //i.e (3*2)-(2+1);
            //we can ignore the absolute modulus  value as it provides no change in the equation
            ans[i]= arr.get(i) *i-sum;
            sum+= arr.get(i);
        }
        return ans;
    }
}

public class ArrayDifference {
    public static void main(String[] args) {
        Difference d= new Difference();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        System.out.println("Enter the array " );
        for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
        }
        int[] ans=d.findDiff(arr);

        for(int j=0;j<arr.size();j++){
            System.out.println(ans[j]);
           // System.out.println("***************");
        }
    }
}
