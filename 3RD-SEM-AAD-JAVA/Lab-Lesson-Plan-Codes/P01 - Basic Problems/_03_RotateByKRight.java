import java.util.Scanner;

public class _03_RotateByKRight {
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
        int x=0;
        for (int i = n-k; i < n; i++) {
            arr2[x++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            arr2[x++]=arr[i];
        }

        System.out.println("The rotated array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}

/*

Enter number of elements in array
5
Enter 5 elements
12 34 42 51 27
Enter the value of k 
2
The rotated array is : 
51 27 12 34 42  

 */