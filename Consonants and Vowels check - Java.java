/*
Consonants and Vowels check - Java
You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.

If vowel count > consonant count then print - “Yes”(without quotes).
If vowel count < consonant count then print - “No”(without quotes).
If vowel count = consonant count then print - “Same”(without quotes).
Input Format:
The first line of input contains T, denoting the number of testcases. T testcases follow. For each testcase there is only one line of input containing s.

Output Format:
For each testcase, in a new line, print the output.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function checkString(string  s) that take s as input and produces output.

Constraints:
1 <= T <= 100
1 <= |s| <= 100

Examples:
Input:
2
the quick brown fox jumps over the lazy dog
aaaaaa
Output:
No
Yes
*/
'//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  String s=sc.nextLine();
    	  Geeks obj=new Geeks();
    	  obj.checkString(s);
    	   
    	 }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    static void checkString(String str)
    {
        int v=0;
        int c=0;
        
        //Your code here
 str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) {  
            //Checks whether a character is a vowel  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                //Increments the vowel counter  
                v++;  
            }  
            //Checks whether a character is a consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                //Increments the consonant counter  
                c++;  
            }  
        }  
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
//Position this line where user code will be pasted.
