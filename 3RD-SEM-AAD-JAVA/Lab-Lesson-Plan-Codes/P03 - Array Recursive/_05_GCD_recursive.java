import java.util.Scanner;

public class _05_GCD_recursive {
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.println("GCD("+a+","+b+") is "+gcd(a,b));
    }
}

/*
Enter first number : 12
Enter second number : 18
GCD(12,18) is 6
 */
