package Arrays;

public class FindSmallestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 5};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}