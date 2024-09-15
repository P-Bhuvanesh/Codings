/*
Given an odd length word which should be printed from the middle of the word.
The output should be in the following pattern.

Input: PROGRAM
Output:
                  G
                GR
             GRA
          GRAM
      GRAMP
   GRAMPR
GRAMPRO
*/



import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++,System.out.println())
		{
		    int mid = str.length()/2;
		    for(int sp=0;sp<3*(str.length()-i-1);sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++)
		    {
		        if(mid != str.length())
		        { 
    		        System.out.print(str.charAt(mid++));
		        }
		        else{
		            mid = 0;
    		        System.out.print(str.charAt(mid++));
		        }
		    }
		}
	}
}

