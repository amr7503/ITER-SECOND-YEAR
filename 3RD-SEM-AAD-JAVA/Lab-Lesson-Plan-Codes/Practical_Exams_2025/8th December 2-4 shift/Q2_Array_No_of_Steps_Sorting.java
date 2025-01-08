import java.util.Scanner;

public class Q2_Array_No_of_Steps_Sorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array (n) : ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" array elements");
        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();

        //Sorting using Bubble Sort
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
        }

        int steps=0;
        for(int i=0;i<n;i++)
        {
            steps+=Math.abs(arr[i]-(i+1));
        }

        System.out.println("Minimum number of increments/decrements required is "+steps);

    }
}

/*

Enter the size of array (n) :
5
Enter 5 array elements
8 3 2 1 9
Minimum number of increments/decrements required is 8

 */