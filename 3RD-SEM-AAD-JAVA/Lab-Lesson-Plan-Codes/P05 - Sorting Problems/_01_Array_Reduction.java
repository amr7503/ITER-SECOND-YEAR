/*
Array reduction involves repeatedly subtracting the smallest non-zero element
from all other non-zero elements in the array until all elements become zero.
Here's how the process works step by step for the given example:

arr: 3 , 3 , 5 , 8 , 10
-3   0 , 0 , 2 , 5 , 7
-2   0 , 0 , 0 , 3 , 5
-3   0 , 0 , 0 , 0 , 2
-2   0 , 0 , 0 , 0 , 0
 */

import java.util.Scanner;

public class _01_Array_Reduction
{
    public static void reduceArray(int[] arr)
    {
        int count=0;
        while (true)
        {
            // Find the smallest non-zero element
            int min = findSmallestNonZero(arr);
            if (min == 0)
                break; // All elements are zero


            // Subtract the smallest non-zero element from all non-zero elements
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] > 0)
                   arr[i] -= min;
            }

            // Print the array after each reduction
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+ " ");
            System.out.println();
            count++;
        }
        System.out.println("Number of Reduction steps = "+count);
    }

    public static int findSmallestNonZero(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
            if (arr[i] > 0 && arr[i] < min)
                min = arr[i];

        return (min == Integer.MAX_VALUE) ? 0:min;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        reduceArray(arr);
    }
}

/*

    |-----------------------------------|
    |    ::::       OUTPUT      ::::    |
    |-----------------------------------|

Enter the size of array :
5
Enter array elements :
2 4 8 9 15
0 2 6 7 13
0 0 4 5 11 
0 0 0 1 7
0 0 0 0 6
0 0 0 0 0
Number of Reduction steps = 5

 */
