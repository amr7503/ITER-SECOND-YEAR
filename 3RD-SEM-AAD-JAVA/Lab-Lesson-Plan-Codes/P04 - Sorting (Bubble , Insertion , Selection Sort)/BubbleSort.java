import java.util.Scanner;

class BubbleSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" elements : ");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        //int arr[]={23,55,76,12,54,33};

        for(int i=0;i<n;i++)
        {
            boolean sorted=true; //to optimise
            for(int j=0;j<n-1-i;j++)
            {
              if(arr[j]>arr[j+1])
               {
                sorted=false;
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
               }
           }
           if(sorted) break;
        }
        System.out.println("Array after sorting : ");
        for (int i=0;i<n;i++)
        System.err.print(arr[i]+" ");
    }
}