package Arrays.BasicPrograms;
import java.util.Arrays;

public class RotateArrayByNTimesToRight {

    // Right rotation by k:
    // 1. Reverse the entire array
    // 2. Reverse the first k elements
    // 3. Reverse the remaining elements

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = 3; // Rotate the array 3 times to the right

        // Calculate effective rotations:
        // - Avoids unnecessary rotations when n > array length
        // - Ensures the number of rotations stays within the array length.
        // - Prevents invalid index calculations
        int k = n % a.length;

        // Step 1: Reverse the entire array
        reverse(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a)); // [7, 6, 5, 4, 3, 2, 1]
        // Arrays.toString(a) converts the array into a readable string //

        // Step 2: Reverse the first k elements
        reverse(a, 0, k - 1);
        System.out.println(Arrays.toString(a)); // [5, 6, 7, 4, 3, 2, 1]

        // Step 3: Reverse the remaining elements
        reverse(a, k, a.length - 1);
        System.out.println(Arrays.toString(a)); // [5, 6, 7, 1, 2, 3, 4]
    }

    // Reverses the elements between the given indices
    // reverse() method is the engine that does the work.
    // The three calls in main() simply tell it which part of the array to reverse each time.
    public static int[] reverse(int[] a, int left, int right) {

        while (left < right) {

            // Swap the left and right elements
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        return a;
    }
}