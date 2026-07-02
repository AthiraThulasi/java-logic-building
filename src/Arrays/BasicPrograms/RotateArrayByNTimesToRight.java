package Arrays.BasicPrograms;

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
        // - Keeps the rotation count within the array size
        // - Prevents invalid index calculations
        int k = n % a.length;

        // Step 1: Reverse the entire array
        reverse(a, 0, a.length - 1);
        System.out.println(java.util.Arrays.toString(a)); // [7, 6, 5, 4, 3, 2, 1]

        // Step 2: Reverse the first k elements
        reverse(a, 0, k - 1);
        System.out.println(java.util.Arrays.toString(a)); // [5, 6, 7, 4, 3, 2, 1]

        // Step 3: Reverse the remaining elements
        reverse(a, k, a.length - 1);
        System.out.println(java.util.Arrays.toString(a)); // [5, 6, 7, 1, 2, 3, 4]
    }

    // Reverses the elements between the given indices
    public static int[] reverse(int[] arr, int left, int right) {

        while (left < right) {

            // Swap the left and right elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}