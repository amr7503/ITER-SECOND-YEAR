import java.util.Scanner;

public class LargestSumContigious {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int gsum=0,lsum=0;
        for (int i=0;i<n;i++) {
            lsum+=arr[i];
            lsum=Math.max(0,lsum);
            gsum=Math.max(lsum,gsum);

        }
        System.out.println("Max sum = "+gsum);
    }
     
}
