package Arrays.BasicPrograms;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 12, 9, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) { // Compare first element with next elements.
                    int temp = arr[i]; // If the first element is bigger, swap it.
                    arr[i] = arr[j];
                    arr[j] = temp;
                } // Continue comparing with remaining elements in that iteration.
            }     // After one full iteration, the correct smallest element gets placed at the beginning.
        }

        for (int num : arr) {
            System.out.print(num + " , ");
        }
    }
}