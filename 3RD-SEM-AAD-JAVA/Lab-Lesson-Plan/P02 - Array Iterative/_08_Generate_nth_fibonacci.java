import java.util.Scanner;

public class _08_Generate_nth_fibonacci {
    public static int fib(int n){
        if(n==1) return 0;
        if(n==2) return 2;

        int a=0,b=1,c=1;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.print(n+"th fibonacci is "+ fib(n));
    }
}

/*

Enter the value of n : 8
8th fibonacci is 13

--------------------------

Enter the value of n : 9
9th fibonacci is 21

 */