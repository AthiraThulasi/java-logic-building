package Arrays.BasicPrograms;

public class FindSmallestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 5};

        int min = arr[0]; // Assume the first element is the smallest for now.

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { // Compare remaining elements one by one.
                min = arr[i]; // If a smaller element is found, update min.
            }
        }

        System.out.println(min); // After loop ends, min will contain the smallest element.
    }
}