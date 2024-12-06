package P07;

import java.util.Scanner;

public class _02_Print_Duplicates {
    public static void printDuplicates(int[] arr,int n)
    {
        boolean checked[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j] && !checked[i] && !checked[j] )
                {
                    System.out.print(arr[i]+" ");
                }

                if(arr[i]==arr[j])
                {
                    checked[i]=true;
                    checked[j]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Repeated elemets are");
        printDuplicates(arr,n);
    }

    
    
}

/*

Enter the size of array : 
10
Enter array elements 
1 2 1 2 3 2 1 5 3 7
Repeated elemets are
1 2 3

 */