import java.util.Scanner;

public class _01_sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
       
       System.out.println("Enter "+n+" numbers");
       int s=0;
       for(int i=1;i<=n;i++)
        s+=sc.nextInt();
       System.out.println("Sum of entered numbers is "+s);
    }
}
