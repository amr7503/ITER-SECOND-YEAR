import java.util.Scanner;

public class _02_Linear_Search_Using_Recursion
{
    public static int linearSearchRecursive(int[] arr,int key,int i)
    {
        if(i==arr.length)
            return -1;

        if(arr[i]==key)
            return i;
        else
            return linearSearchRecursive(arr,key,i+1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key to search : ");
        int key=sc.nextInt();

        int index=linearSearchRecursive(arr,key,0);


        if(index==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at index "+index);

    }

}

/*    :::  OUTPUT  :::

Enter the number of elements in the array: 10
Enter the elements of the array:
23 30 48 65 68 32 21 754 221 67
Enter the key to search : 221
221 found at index 8

 */
