/*
While loop- printTable - Java
While loop is another loop like for loop but unlike for loop it only checks for one condition.

Here, we will use while loop and print a number n's table in reverse order.

Input Format:
First line of input conatins number of testcases T. For each testcase, there will be one line of input containing a number n.

Output Format:
For each testcase, print n*10, n*9....n*1.

User Task: 
Your task is to complete the provided function.

Constraints:
1 <= T <= 10
1 <= n<= 1000

Input:
2
1
2

Output:
10 9 8 7 6 5 4 3 2 1
20 18 16 14 12 10 8 6 4 2

** For More Input/Output Examples Use 'Expected Output' 

*/
//Initial Template for Java
//Initial Template for C++
//Initial Template for C++
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n =sc.nextInt();
		    Geeks obj=new Geeks();
		    obj.printTable(n);
		}
	
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                //Your code here
                System.out.print(n*multiplier+" ");
                multiplier--;
            }
       System.out.println();
	 }
}
