import java.util.Scanner;

public class _07_nthPowerofNumber_recusive {
    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        else
            return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x=sc.nextInt();
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println(n+"th power of "+x+" is "+power(x,n));

    }
}

/*

Enter a number : 2
Enter the value of n : 5
5th power of 2 is 32

 */
