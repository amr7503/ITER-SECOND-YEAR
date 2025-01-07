import java.util.Scanner;

public class _04_SumContigious {
    public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Maximum sum of contiguous subarray is: " + maxSubarraySum(arr,n));
        
//        int maxSoFar = arr[0], maxEndingHere = arr[0];
//
//        for (int i = 1; i < n; i++) {
//            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
//            maxSoFar = Math.max(maxSoFar, maxEndingHere);
//        }
//
//        System.out.println("Maximum sum of contiguous subarray is: " + maxSoFar);
    }


}

/*
    |-----------------------------------|
    |    ::::       OUTPUT      ::::    |
    |-----------------------------------|

Enter the number of elements in the array:
5
Enter the elements of the array:
-2 5 -1 3 -7
Maximum sum of contiguous subarray is: 7
 */