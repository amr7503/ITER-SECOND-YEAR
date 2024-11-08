import java.util.Scanner;

public class _04_nth_fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21 ......
    public static int fibo(int n)
    {
        if (n==1 || n==2)
            return n-1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println(n+"th Fibonacci is "+fibo(n));

    }
}

/*
1th Fibonacci is 0
2th Fibonacci is 1
3th Fibonacci is 1
4th Fibonacci is 2
5th Fibonacci is 3
6th Fibonacci is 5
7th Fibonacci is 8
8th Fibonacci is 13
9th Fibonacci is 21
10th Fibonacci is 34
 */
