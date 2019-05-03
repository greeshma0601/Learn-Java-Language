/*
The Pattern Matcher - Java Submissions: 1733   Accuracy: 24.08%   Difficulty: Easy   Marks: 2
   
Problems
You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

Input Format:
The first line of input contains T, the number of testcase. T testcases follow. Each testcase contains single line of input denoting the string s.

Output Format:
For each testcase, in a new line, print 1 if the string is valid else print 0.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function follPatt(string s) that outputs 1 if string is valid, else it outputs 0.

Constraints:
1 <= T <= 100
1 <= |s| <=100

Examples:
Input:
2
xxyy
xyx
Output:
1
0
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
    	   String s=sc.next();
    	   Geeks obj=new Geeks();
    	   obj.follPatt(s);
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{

static void follPatt(String s)
{
char ch[]=s.toCharArray();
int l=s.length();
int i=0;

boolean flag=true; 
while(i!=l)
{
int xtimes=0,ytimes=0;
while(i!=l&&ch[i]=='x')
{
i++;
xtimes++;

}
while(i!=l&&ch[i]=='y')
{
i++;
ytimes++;
}
if(ytimes!=xtimes)
{
flag=false;
break;
}

}

if(flag)
System.out.print("1");
else System.out.print("0");
System.out.println();
}

}

