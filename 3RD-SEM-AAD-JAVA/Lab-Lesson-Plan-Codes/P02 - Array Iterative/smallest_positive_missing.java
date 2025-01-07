import java.util.Arrays;

public class smallest_positive_missing {

    public static void main(String[] args) {
        int a[]= {0,1,2,3,4,6,7};
        Arrays.sort(a);
        int i;
        for( i=0;i<a.length;i++) {
            if(a[i]!=i) {
                break;
            }
        }
        System.out.println("Smallest positive missing number is "+i);
    }

}
