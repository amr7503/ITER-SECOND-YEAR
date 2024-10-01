import java.util.Scanner;

class LinearSearch{
    public static int search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search ");
        int key=sc.nextInt();

        int pos=search(arr,key);

        if(pos==-1)
        System.out.println(key+" not found");
        else
        System.out.println(key+" found at index "+pos+" of array");
    }
}