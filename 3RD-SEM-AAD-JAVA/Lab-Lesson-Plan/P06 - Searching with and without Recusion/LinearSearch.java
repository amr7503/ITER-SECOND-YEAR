import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr,int key)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
       return -1;
    }
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
    public static int linearSearchRecursive(int[] arr,int key,int i)
    {
        if(i==arr.length)
            return -1;

        if(arr[i]==key)
            return i;
        else
            return linearSearchRecursive(arr,key,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key to search : ");
        int key=sc.nextInt();

//        int index=linearSearch(arr,key);
//        int index=binarySearch(arr,key);
          int index=linearSearchRecursive(arr,key,0);

        if(index==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at index "+index);

    }
}

/*
20 16 12 48 92
 */
