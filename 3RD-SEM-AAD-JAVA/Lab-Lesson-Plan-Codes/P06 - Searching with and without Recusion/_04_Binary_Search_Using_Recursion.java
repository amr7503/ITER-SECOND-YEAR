import java.util.Scanner;

public class _04_Binary_Search_Using_Recursion
{
    public static int binarySearchRecursive(int[] arr,int key,int left,int right)
    {
        if(left>right)
            return -1;

        int mid=(left+right)/2;
        if(key==arr[mid])
            return mid;
        else if(key<arr[mid])
            return binarySearchRecursive(arr,key,left,mid-1);
        else   //key>arr[mid]
            return binarySearchRecursive(arr,key,mid+1,right);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array in ascending order : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key to search : ");
        int key=sc.nextInt();

        int index=binarySearchRecursive(arr,key,0, arr.length-1);

        if(index==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at index "+index);

    }
}

/*  :::  OUTPUT  :::

Enter the number of elements in the array: 5
Enter the elements of the array in ascending order :
12 23 34 45 56
Enter the key to search : 23
23 found at index 1

 */