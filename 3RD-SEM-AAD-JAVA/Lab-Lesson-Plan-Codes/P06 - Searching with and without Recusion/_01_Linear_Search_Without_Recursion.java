import java.util.Scanner;

public class _01_Linear_Search_Without_Recursion {
    public static int linearSearch(int[] arr,int key)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
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

        int index=linearSearch(arr,key); //function call


        if(index==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at index "+index);

    }
}


/*  :::OUTPUT:::

Enter the number of elements in the array: 10
Enter the elements of the array:
23 30 48 65 68 32 21 754 221 67
Enter the key to search : 68
68 found at index 4

 */