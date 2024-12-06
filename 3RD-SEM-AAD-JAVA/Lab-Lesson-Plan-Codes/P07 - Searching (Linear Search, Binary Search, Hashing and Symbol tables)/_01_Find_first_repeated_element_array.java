package P07;

import java.util.Scanner;

public class _01_Find_first_repeated_element_array {

    public static int findRepeated(int[] arr,int n)
   {
    for(int i=0;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int ans=findRepeated(arr,n);
        

        if(ans==-1)
        System.out.println("No repeated element found ");
        else
        System.out.println("First repeated element is "+ans);
    }
    
}


/*

Enter the size of array : 
5
Enter array elements 
12 23 15 23 12    
First repeated element is 23

 */