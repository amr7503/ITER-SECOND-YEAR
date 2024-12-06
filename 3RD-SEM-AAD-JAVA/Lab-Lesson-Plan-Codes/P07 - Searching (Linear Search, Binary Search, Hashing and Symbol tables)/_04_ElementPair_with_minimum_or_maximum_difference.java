package P07;

import java.util.Scanner;

public class _04_ElementPair_wirh_minimum_or_maximum_difference {
    static void minDifference(int[] arr,int n)
    {
        int min=Math.abs(arr[0]-arr[1]);
        int p1=0,p2=1;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int dif=Math.abs(arr[i]-arr[j]);
                if(dif<min)
                {
                    min=dif;
                    p1=i;
                    p2=j;
                }
            }
        }
        System.out.println("The pair with minimum difference of "+min+" is "+arr[p1]+" and "+arr[p2]);
    }
    static void maxDifference(int[] arr,int n)
    {
        int max=Math.abs(arr[0]-arr[1]);
        int p1=0,p2=1;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int dif=Math.abs(arr[i]-arr[j]);
                if(dif>max)
                {
                    max=dif;
                    p1=i;
                    p2=j;
                }
            }
        }
        System.out.println("The pair with maximum difference of "+max+" is "+arr[p1]+" and "+arr[p2]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array (>2) : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        minDifference(arr,n);
        maxDifference(arr,n);
    }
}

/*

Enter the size of array (>2) : 
5
Enter array elements 
2 7 19 10 21
The pair with minimum difference of 2 is 19 and 21
The pair with maximum difference of 19 is 2 and 21

 */