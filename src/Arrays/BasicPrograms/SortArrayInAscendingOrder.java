package Arrays.BasicPrograms;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 12, 9, 4};

        for (int i = 0; i < arr.length; i++) { // i moves forward one step at a time
            for (int j = i + 1; j < arr.length; j++) { // j always starts from i+1 so we never compare the same pair twice
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

// LOGIC
/*
We need two loops here because we have two jobs to do.
The outer loop i is responsible for position — it says 'I need to find the correct element for position 0, then position 1, then position 2' and so on.
The inner loop j is responsible for searching — it starts from i+1 and scans everything after i, comparing each element with arr[i]. If it finds something smaller it swaps.
So after the first full inner loop run, the smallest element is sitting at position 0. After the second run, the second smallest is at position 1. And so on until the array is fully sorted.
This is Selection Sort — in each iteration we are selecting the smallest element from the unsorted part and placing it in the correct position.




*/
