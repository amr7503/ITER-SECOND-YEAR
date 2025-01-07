import java.util.Arrays;

public class _03_Check_if_reversing_subarray_makes_array_Sorted {

    // Function to check if the array becomes sorted by reversing a subarray
    public static boolean canSortByReversingSubarray(int[] arr) {
        int n = arr.length;

        // Step 1: Find the first position where the order is violated
        int start = -1, end = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        // If no violation is found, the array is already sorted
        if (start == -1) {
            return true;
        }

        // Step 2: Find the last position where the order is violated
        for (int i = n - 1; i > start; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }

        // Step 3: Reverse the subarray and check if the entire array is sorted
        reverse(arr, start, end);

        // Check if the array is sorted after the reversal
        return isSorted(arr);
    }

    // Function to reverse a subarray from index start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to check if the array is sorted
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 6};

        // Print the result
        if (canSortByReversingSubarray(arr)) {
            System.out.println("Yes, the array can be sorted by reversing a subarray.");
            System.out.println("The Sorted array is : ");
            for (int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        } else {
            System.out.println("No, the array cannot be sorted by reversing a subarray.");
        }
    }
}

/*

Yes, the array can be sorted by reversing a subarray.
The Sorted array is :
1 2 3 4 5 6


Explanation:
-----------------
Initial check for order violations:
 -The program first searches for the first position where the order is violated
  (i.e., where a number is larger than the next one).
Finding the subarray:
 -Once an order violation is found, it searches for the last violation
  to determine the bounds of the subarray that should be reversed.
Reversing the subarray:
  -The program then reverses the identified subarray.
Checking if sorted:
  -Finally, it checks if the entire array is sorted after the reversal.

 */
