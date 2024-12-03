import java.util.Scanner;

public class _01_Sum_of_n_numbers_recursive {
    public static int sumArrayRecursive(int[] arr,int n)
    {
        if(n==1)
            return arr[0];
        else
            return arr[n-1]+sumArrayRecursive(arr,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array(n) : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" integers");
        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();
        System.out.print("Sum of these "+n+" numbers is "+sumArrayRecursive(arr,n));
    }
}
/*
Enter the size of array(n) : 5
Enter 5 integers
2 4 2 3 1
Sum of these 5 numbers is 12

-----------------------------------

Enter the size of array(n) : 1
Enter 1 integers
55
Sum of these 1 numbers is 55

 */