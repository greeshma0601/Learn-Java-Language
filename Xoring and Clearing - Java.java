/*
Xoring and Clearing - Java
Bitwise operations help us in a lot of problems. We can find the non-repeating element in an array, find number of set-bits, do division, find subsets and so on. Indeed, we can see that learning to cleverly use bitwise operations is vital to any programmer.

You are given an array A of size N. You need to do the following:

You need to xor the elements of the arrays with their respective indices(index starting from 0).
After step1, print the array.
Now, set all the elements of A to zero.
Now, print A.
Input Format:
The first line contains T, the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains N, the size of the array. The second line contains the elements of the array.

Output Format:
For each testcase, in a new line, print the output.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided functions.

Constraints:
1 <= T <= 100
1 <= N <= 1000
1 <= Ai <= 1000

Example:
Input:
1
10
1 2 3 4 5 6 7 8 9 10
Output:
1 3 1 7 1 3 1 15 1 3
0 0 0 0 0 0 0 0 0 0

Explanation:
Testcase1:
First we take xor of every element with their indices, like 1xor0, 2xor1, 3xor2, 4xor3 and so on.
Now print the resultant array
Now set all the elements of array to zero
Now print the resultant array
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
    	     int n=sc.nextInt();
    	     int arr[]=new int[n];
    	     for(int i=0;i<n;i++)
    	     arr[i]=sc.nextInt();
    	     
    	     
    	        Geeks obj=new Geeks();
            	obj.xor1ToN(arr,n);
        	    obj.printArr(arr,n);
        	    obj.setToZero(arr,n);
        	    obj.printArr(arr,n);
    	   
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
    
    static void printArr(int a[],int n)
    {
        //Your code for printing arr here
        for(int i=0;i<n;i++)
        
        System.out.print(a[i]+" ");
        System.out.println();
    }
    
   static void setToZero(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        arr[i]=0;
        //use Arrays.fill to set arr to zero
    }
    
   static void xor1ToN(int a[], int n)
    {
        
        for(int i=0;i<n;i++)
        a[i]=a[i]^i;
           //Xor arr[i]^i
        
    }
}
