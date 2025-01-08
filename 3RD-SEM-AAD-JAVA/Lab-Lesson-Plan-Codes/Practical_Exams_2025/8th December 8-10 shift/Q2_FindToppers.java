import java.util.Scanner;

public class Q2_FindToppers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int n = sc.nextInt();
        String name[] = new String[n];
        int mark[] = new int[n];
        System.out.println("Enter the names of "+n+" students");
        for (int i = 0; i < n; i++)
            name[i] = sc.next();
        System.out.println("Enter their respective marks");
        for (int i = 0; i < n; i++)
            mark[i] = sc.nextInt();

        //Sort in descending order using Selection Sort

        for(int i=0;i<n;i++)
        {
            int max=i;
            for(int j=i+1;j<n;j++)
                if(mark[j]>mark[max])
                    max=j;

            //swap
            int t=mark[i];
            mark[i]=mark[max];
            mark[max]=t;

            String temp=name[i];
            name[i]=name[max];
            name[max]=temp;

        }

        //After sorting in descending order

        if( n==1 || (n>1 && mark[0]!=mark[1]) )
            System.out.println("Unique Topper : "+name[0]);
        else {
            System.out.print("Joint Toppers : ");
            for(int i=0;i<n;i++)
                if(mark[i]==mark[0])
                    System.out.print(name[i]+" , ");
        }

    }
}

/*
     OUTPUT TESTCASE-1

Enter the number of Students
6
Enter the names of 6 students
Vineet Shreya Vishal kamath Rabin Sandy
Enter their respective marks
275    312    195    275    235   205
Unique Topper : Shreya


     OUTPUT TESTCASE-2

Enter the number of Students
6
Enter the names of 6 students
Vineet Shreya Vishal kamath Rabin Sandy
Enter their respective marks
275    312     195    287   312   205
Joint Toppers : Shreya , Rabin ,




 */