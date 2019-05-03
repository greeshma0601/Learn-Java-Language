/*
Need Some Change - Java
Now, as you're familiar with operating on arrays, let's do an intricate task. Here, we'll do swapping of array elements.

Given an array A of N positive integers. The task is to swap every ith element of the array with (i+2)th element.

Input Format:
First line of input contains number of testcase T. For each testcase, there will be two lines, first of which contains size of array N and next line contains N space seperated positive integers.

Output Format:
For each testcase, print the modified array.

Constraints:
1 <= T <= 100
3 <= N <= 106
1 <= Ai <= 106

User Task:
Your task is to complete the function swapElements(), which should swap each ith element with (i+2)th element.

Example:
Input:
1
5
1 2 3 4 5

Output:
3 4 5 2 1

Explanation:
Testcase 1: Swapping 1 and 3, makes the array 3 2 1 4 5. Now, swapping 2 and 4, makes the array 3 4 1 2 5. Again, swapping 1 and 5, makes the array 3 4 5 2 1.
*/
//Initial Template for Java
import java.io.*;
import java.util.*;
//Position this line where user code will be pasted.
// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    // Input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks obj = new Geeks();
		    obj.swapElements(a, sizeof_array);
		}
		
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*Geeks class with its member function swapElements
* a : array with input elements
* n : size of array
*/
class Geeks{
    static void swapElements(int a[], int n){
        
        // Your code here
        int t;
        for(int i=0;i<=n-3;i++)
        {
            t=a[i];
            a[i]=a[i+2];
            a[i+2]=t;
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
}
