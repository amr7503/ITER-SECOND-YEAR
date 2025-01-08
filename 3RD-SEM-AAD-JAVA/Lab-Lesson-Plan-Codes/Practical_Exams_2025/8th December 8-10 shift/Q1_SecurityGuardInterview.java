import java.util.Scanner;

public class Q1_SecurityGuardInterview {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of candidates");
        int n=sc.nextInt();
        System.out.println("Enter the standard height");
        int h=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter a "+n+" elements array containing deviation in heights");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        //logic-> find the highest frequency deviation

        int maxDev=arr[0];
        int maxCount=0;

        for (int i=0;i<n;i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] == arr[j]) {
                    count++;
                }
            if (count > maxCount) {
                maxCount = count;
                maxDev = arr[0];
            }
        }
        System.out.println("The most common height is "+(h+maxDev));
    }
}

/*   <---   OUTPUT  --->

Enter the number of candidates
15
Enter the standard height
6
Enter a 15 elemennts height containing deviation in heights
1 0 -1 -2 1 2 2 1 1 -1 1 0 -1 -1 1
The most common height is 7
 */
