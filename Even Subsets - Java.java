/*
Even Subsets - Java Submissions: 684   Accuracy: 43.96%   Difficulty: Easy   Marks: 2
    
Problems
As we mentioned earlier, bitwise operations can be used to find number of subsets. Here, we will use that.

Given an array A of N elements. The task is to count all the subsets whose sum is even.

Input Format:
For each testcase, first line of input contains number of testcases T. For each testcase, there will be two lines, first of which containing N and next line contains N space seperated positive integers.

Output Format:
For each testcase, print the count of subsets whose sum of all elements is even.

Constraints:
1 <= T <= 100
1 <= N <= 10
1 <= A[i] <= 10

User Task:
Your task is to complete the function countSumSubsets() which counts all the subsets in which sum of all the elements is even.

Example:
Input:
1
3
1 2 3

Output:
3

Explanation:
Testcase 1: Three subsets are there whose sum of elements is even. Subsets are (3, 2, 1), (1, 3), (2).

 
*/
class Geeks{
    
    static int countSumSubsets(int arr[],int set_size)
    {
        
        //Your code here
        /*set_size of power set of a set 
        with set_size n is (2**n -1)*/
        long pow_set_size =  
            (long)Math.pow(2, set_size); 
        int counter, j; 
      
        /*Run from counter 000..0 to 
        111..1*/int c=0;
        for(counter = 0; counter <  
                pow_set_size; counter++) 
        { 
            int s=0;
            for(j = 0; j < set_size; j++) 
            { 
                /* Check if jth bit in the  
                counter is set If set then  
                print jth element from set */
                if((counter & (1 << j)) > 0) 
                 {s+=arr[j];}
                 
            } 
            if(s%2 == 0)
            c++;
              
           // System.out.println(); 
        } 
        c--;
        return c;
    }
}
