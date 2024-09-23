import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of times to rotate the array: ");
        int k=sc.nextInt();
        k=k%n; // for k>n
        int temp[]=new int[k];
        for(int i=0;i<k;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            arr[i]=arr[i+k];
        }
        for(int i=n-k;i<n;i++)
        {
            arr[i]=temp[i-n+k];
        }
        System.out.println("The array after rotating "+k+" times to the left is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

// 1 2 3 4 5 6 7
// 3 4 5 6 7 1 2

// 20 16 55 88 23 45 86 