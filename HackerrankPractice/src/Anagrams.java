//Question 34- Fun with Anagrams

import java.util.*;
import java.lang.*;
import java.io.*;

class Anagrams
{
	public static void main (String[] args) throws Exception
	{
		System.out.println("enter the array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>(n);
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
		    list.add(sc.next());
		}
		for(int i=0;i<list.size()-1;i++)
		{
		    String st1=list.get(i); // picking up first string
		    for(int j=i+1;j<list.size();j++)
		    {
		        String st2=list.get(j); // picking up the next string each iteration
		        boolean res=check_anagram(st1,st2);
		        if(res)
		        {
		            list.remove(j);
		            j--;
		        }
		    }
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
	}
	public static boolean check_anagram(String st1,String st2)
	{
	    if(st1.length()!=st2.length())
	    return false;
	    int ar[]=new int[26];
	    for(int i=0;i<st1.length();i++)
	    {
	        int c=(int)st1.charAt(i);
	        ar[c-97]++;
	        int c1=(int)st2.charAt(i);
	        ar[c1-97]--;
	    }
	    for(int i=0;i<26;i++)
	    {
	        if(ar[i]!=0)
	        return false;
	    }
	    return true;
	}
}

