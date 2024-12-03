import java.util.Scanner;

public class _02_Merging_Two_Sorted_Arrays
{
    public static void main(String[] args) {
        int n,m;
        Scanner  sc=new Scanner(System.in);

        System.out.print("Enter size of first sorted array : ");
        n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter "+n+" elements of first array ");
        for (int i = 0; i < n; i++)
            arr1[i]=sc.nextInt();

        System.out.print("Enter size of second sorted array : ");
        m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter "+m+" elements of second array ");
        for (int i = 0; i < m; i++)
            arr2[i]=sc.nextInt();

        int[] arr3=new int[m+n];

        //Merging using two pointers
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k++]=arr1[i++];
            }
            else {
                arr3[k++]=arr2[j++];
            }
        }

        //add remaining
        while(i<n)
            arr3[k++]=arr1[i++];

        while(j<m)
            arr3[k++]=arr2[j++];

        System.out.println("Merged sorted array is : ");
        for(i=0;i<n+m;i++)
            System.out.print(arr3[i]+" ");

    }
}

/*   ::: OUTPUT :::

Enter size of first sorted array : 4
Enter 4 elements of first array
12 34 56 78
Enter size of second sorted array : 5
Enter 5 elements of second array
11 45 52 64 88
Merged sorted array is :
11 12 34 45 52 56 64 78 88

 */