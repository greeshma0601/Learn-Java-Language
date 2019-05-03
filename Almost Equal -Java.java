/*
Almost Equal -Java Submissions: 2706   Accuracy: 19.73%   Difficulty: Easy   Marks: 2
   
Problems
Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.

Input:
For each testcase, first line of input contains number of testcase T. For each testcase, there will be two lines containing string S1 and S2.

Output:
For each testcase, print the count of characters needed to delete to make S1 and S2 equal.

Constraints:
1 <= T <= 100
1 <= S1, S2 <= 104

Example:
Input:
1
madame
madam

Output:
1

Explanation:
Testcase 1: String S1 = madame, string S2 = madam. character 'e' in first string is need to be deleted to make S1 equal to S2.
*/
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   Geeks obj=new Geeks();
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{

static int coutChars(String s1, String s2)
{ 
int[] arr = new int[26];
int sum = 0;
int len2 = s2.length();
int len1 = s1.length();

for (int i = 0; i < len1; i++){
arr[ s1.charAt(i) - 'a']++;
}

for (int j = 0; j < len2; j++){
arr[ s2.charAt(j) - 'a']--;
}

for (int v = 0; v <26; v++){
sum += Math.abs(arr[v]); 
}

return sum;
//Your code here
}
}
