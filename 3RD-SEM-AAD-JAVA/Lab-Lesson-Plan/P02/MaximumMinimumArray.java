import java.util.Arrays;
import java.util.Scanner;

public class MaximumMinimumArray {
    
    public static void maxmin(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for (int i = 0; i < n/2; i++)
            System.out.print(arr[n-1-i]+" "+arr[i]+" ");
        if(n%2==1)
            System.out.print(arr[n/2]);

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

        maxmin(arr);
    }
}
