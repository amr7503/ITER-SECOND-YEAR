import java.util.Scanner;

public class Q2_Critical_Floor_Ball_Drop
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of floors : ");
        int n = sc.nextInt();
        System.out.print("Enter the critical floor : ");
        int cf = sc.nextInt();
        int l=1,r=n,drops=0;

        //Modifying & using Binary Search for this problem to  find minimum no. of drops
        while(l<=r)
        {
            drops++;
            int mid=(l+r)/2;
            if(mid==cf)
                break;
            else if(mid>cf)
            {
                r=mid-1;
            }
            else{ //mid<cf
                l=mid+1;
            }
        }
        System.out.println("Total drops required "+drops);
    }
}

/*

Enter the number of floors : 100
Enter the critical floor : 30
Total drops required 7

 */
