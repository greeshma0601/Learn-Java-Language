/*
Count the Specials - Java Submissions: 2736   Accuracy: 24.39%   Difficulty: Easy   Marks: 2
    
Problems
Given an arry A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.
Hint: You may use hashing or brute-force.

Input:
First line of input contains number of testcases. For each testcase, there will be two lines, first of which contains N and K and second line contains array elements.

Output:
For each testcase, print the count of elements in the array which occurs exactly floor(N/K) times.

Constrains:
1 <= T <= 100
1 <= N <= 103
1 <= Ai <= 103

User Task:
Your task is to complete the function countSpecials() which should count the elements which occurs exactly floor(N/K) times.

Example:
Input:
1
5 2
1 4 1 2 4

Output:
2

Explanation:
Testcase 1: In the given array, 1 and 4 occurs floor(5/2) = 2 times. So count is 2.

 
*/
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;
//Position this line where user code will be pasted.
// Driver class
class GFG {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks obj = new Geeks();
		    obj.countSpecials(a, sizeof_array, k);
		}
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Class Geeks with countSpecials as its member function
* a : input array
* n : size of array
k : to calculate floor(n/k)
*/
class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        
int c[]=new int[1001];
   for(int i=0;i<n;i++) 
{
    c[a[i]]=c[a[i]]+1;
    } 
    int count=0; for(int i=0;i<1000;i++)
    { if(c[i]==f)
    count=count+1; }
    System.out.println(count);
    }
}
