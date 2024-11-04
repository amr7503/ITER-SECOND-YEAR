public class MinMaxAfterSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        if(n%2==0)
        {
            for(int i=0;i<n/2;i++)
            {
                System.out.print(arr[n-1-i]+" "+arr[i]+" ");
            }
        }
        else
        {
            for(int i=0;i<n/2;i++)
            {
                System.out.print(arr[n-1-i]+" "+arr[i]+" ");
            }
            System.out.println(arr[n/2]);
        }
}
}