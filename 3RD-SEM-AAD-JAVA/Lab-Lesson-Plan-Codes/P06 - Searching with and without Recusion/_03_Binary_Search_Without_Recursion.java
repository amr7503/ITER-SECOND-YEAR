import java.util.Scanner;

public class _03_Binary_Search_Without_Recursion
{
    public static int binarySearch(int[] arr,int key)
    {
        int mid,left=0,right=arr.length-1;
        while(left<=right)
        {
            mid=(left+right)/2;

            if(key==arr[mid])
                return mid;
            else if(key<arr[mid])
                right=mid-1;
            else   //key>arr[mid]
                left=mid+1;
        }

        return -1; //if not found
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array in ascending order : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key to search : ");
        int key=sc.nextInt();

        int index=binarySearch(arr,key);

        if(index==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at index "+index);

    }
}

/*   :::  OUTPUT  :::

Enter the number of elements in the array: 7
Enter the elements of the array in ascending order :
15 20 35 40 57 59 72
Enter the key to search : 57
57 found at index 4

 */