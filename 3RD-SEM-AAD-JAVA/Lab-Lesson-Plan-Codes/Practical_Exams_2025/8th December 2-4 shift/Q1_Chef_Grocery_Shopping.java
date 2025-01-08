import java.util.Scanner;

public class Q1_Chef_Grocery_Shopping
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items (N) : ");
        int n=sc.nextInt();
        System.out.println("Enter the value of X :");
        int x=sc.nextInt();

        int[] a=new int[n];
        int[] b=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the freshness value of item "+(i+1));
            a[i]=sc.nextInt();
            System.out.println("Enter the cost of item "+(i+1));
            b[i]=sc.nextInt();
        }

        int cost=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x)
                cost+=b[i];
        }
        System.out.println("Total cost = "+cost);

    }
}

/*

    :::::: OUTPUT :::::

Enter the number of items (N) :
2
Enter the value of X :
20
Enter the freshness value of item 1
15
Enter the cost of item 1
10
Enter the freshness value of item 2
67
Enter the cost of item 2
90
Total cost = 90

 */