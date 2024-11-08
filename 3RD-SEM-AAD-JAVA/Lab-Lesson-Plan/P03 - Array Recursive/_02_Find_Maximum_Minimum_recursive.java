import java.util.Scanner;

public class _02_Find_Maximum_Minimum_recursive {
    static int findMaxSimple(int[] arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        else{
            return Math.max(arr[n-1],findMaxSimple(arr, n-1));
        }
    }
    static int findMinSimple(int[] arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        else{
            return Math.min(arr[n-1],findMinSimple(arr, n-1));
        }
    }
    static int findMax(int[] arr,int start,int end){
        if(start==end)
            return arr[start];
        int mid=(start+end)/2;
        int max1=findMax(arr,start,mid);
        int max2=findMax(arr,mid+1,end);
        return Math.max(max1,max2);
    }
    static int findMin(int[] arr,int start,int end){
        if(start==end)
            return arr[start];
        int mid=(start+end)/2;
        int min1=findMin(arr,start,mid);
        int min2=findMin(arr,mid+1,end);
        return Math.min(min1,min2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array(n) : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" integers");
        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();
        sc.close();
        // int max=findMax(arr,0,n-1);
        // int min=findMin(arr,0,n-1);
        int max=findMaxSimple(arr, n);
        int min=findMinSimple(arr, n);
        System.out.println("Maximum element in the array is : "+max);
        System.out.println("Minimum element in the array is : "+min);
    }
}

/*
Enter the size of array(n) : 5
Enter 5 integers
3 5 8 2 9
Maximum element in the array is : 9
Minimum element in the array is : 2
----------------------------------------------
Enter the size of array(n) : 5
Enter 5 integers
23 65 21 89 56
Maximum element in the array is : 89
Minimum element in the array is : 21
 */
