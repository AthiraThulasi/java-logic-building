package Arrays;

public class CommonOccurrenceWithoutHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 3, 5, 3, 2, 1, 8, 8, 1};

        for (int i = 0; i < arr.length; i++) {

            int count = 1;          // Start count as 1 (current element)
            boolean visited = false; // To check if already counted

            // 🔹 Step 1: Check if element already appeared before index i
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            // If already counted, skip this element
            if (visited) {
                continue;
            }

            // 🔹 Step 2: Count occurrences after index i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // 🔹 Step 3: Print result
            System.out.println(arr[i] + " = " + count);
        }
    }
}