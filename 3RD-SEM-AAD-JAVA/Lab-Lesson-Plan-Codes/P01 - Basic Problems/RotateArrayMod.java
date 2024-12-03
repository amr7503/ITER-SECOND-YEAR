import java.util.Scanner;

public class RotateArrayMod {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of k ");
        int k=sc.nextInt();
        int arr2[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i]=arr[(i+k)%n];
        }

        System.out.println("The rotated array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }
    
}
}
