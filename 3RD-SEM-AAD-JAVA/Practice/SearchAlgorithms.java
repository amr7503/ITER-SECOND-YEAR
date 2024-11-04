import java.util.Scanner;

class SearchAlgorithms{
    public static int linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static int binarySearch(int arr[],int key)
    {
        int left=0,right=arr.length-1;
        int mid=(left+right)/2;
        while(left<=right)
        {
            if(arr[mid]==key) return mid;

            else if(arr[mid]<key) left=mid+1;
            else right=mid-1;
            mid=(left+right)/2;
        }
        return -1;
    }
    public static int recurBinarySearch(int arr[],int key,int left,int right)
    {
        if(left>right) 
            return -1;
        int mid=(left+right)/2;

        if(arr[mid]==key) return mid;

        else if(arr[mid]<key) return recurBinarySearch(arr,key,mid+1,right);
        else return recurBinarySearch(arr,key,left,mid-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in sorted array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search ");
        int key=sc.nextInt();

        //int pos=binarySearch(arr,key);
        int pos=recurBinarySearch(arr, key, 0, arr.length-1);

        if(pos==-1)
        System.out.println(key+" not found");
        else
        System.out.println(key+" found at index "+pos+" of array");
    }
}