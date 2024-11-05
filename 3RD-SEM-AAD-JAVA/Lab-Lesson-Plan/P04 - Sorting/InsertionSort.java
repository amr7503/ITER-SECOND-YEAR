import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        for(int i=1;i<n;i++)
        {
            int x=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>x )
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=x;

        }

        System.out.println("The array after sorting is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
