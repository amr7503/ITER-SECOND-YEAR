import java.util.Scanner;

public class _03_Factorial_recursive {
    public static int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}

/*
Enter a number : 5
Factorial of 5 is 120
 */