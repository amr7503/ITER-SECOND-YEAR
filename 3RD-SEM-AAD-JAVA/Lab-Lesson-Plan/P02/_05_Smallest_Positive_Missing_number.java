import java.util.Scanner;

public class _05_Smallest_Positive_Missing_number {

    public int firstMissingPositive(int[] arr) {
            int i,n;
            n=arr.length;
            int[] hash =new int[n+1];
            for(i=1;i<=n;i++)
                hash[i]=-1;

            for(i=0;i<n;i++)
            {
                if(arr[i]>=1 && arr[i]<=n)
                    hash[arr[i]]=1;
            }

            int ans=n+1; //There are two cases either the first missing number is between n or  n+1
                  //for example in an array of size 5 .. either one of {1,2,3,4,5} is missing or completely fills array to make 6 as first missing
                 //thus we can ignore input numbers greater than n or non-positive
            for(i=1;i<=n;i++)
            {
                if(hash[i]==-1)
                {
                    ans=i;
                    break;
                }
            }
            return ans;
        }

    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array(n) : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" integers");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }



    }
}
