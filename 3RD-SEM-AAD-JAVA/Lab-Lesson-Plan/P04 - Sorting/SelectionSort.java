import java.util.Scanner;

public class SelectionSort {
    public static void selection_sort(int[] arr,int n){
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;i<n;i++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        sc.close();
        selection_sort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
