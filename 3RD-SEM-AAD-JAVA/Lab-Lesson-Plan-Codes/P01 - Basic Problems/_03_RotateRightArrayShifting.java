import java.util.Scanner;

public class _03_RotateRightArrayShifting {
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

        int temp[]=new int[k];
        for(int i=n-k;i<n;i++)
        temp[i-n+k]=arr[i];

        //Right shift
        for(int i=n-1;i>=k;i--)
        arr[i]=arr[i-k];

        for(int i=0;i<k;i++)
        arr[i]=temp[i];

        System.out.println("The rotated array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}
}
