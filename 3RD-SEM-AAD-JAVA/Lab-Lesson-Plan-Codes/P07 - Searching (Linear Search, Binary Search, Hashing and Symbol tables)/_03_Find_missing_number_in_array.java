package P07;

import java.util.Scanner;

public class _03_Find_missing_number_in_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        int sum=0;
        System.out.println("Enter "+(n-1)+" array elements between 1 and "+n+" with one number missing");

        for(int i=0;i<n-1;i++)
        {
        arr[i]=sc.nextInt();
        sum+=arr[i];
        }
        int totalSum=(n*(n+1))/2;
        System.out.println("The missing number is "+(totalSum-sum));
    }
    
}

/*

Enter the range : 
7
Enter 6 array elements between 1 and 7 with one number missing
1 4 5 7 2 3
The missing number is 6

*/