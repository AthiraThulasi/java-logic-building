// Reverse First half of array

package Arrays;
import java.util.Arrays;

    public class ReverseFirstHalfOfArray {
        public static void main( String [] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int left = 0;
            int mid = arr.length / 2;
            int right = mid - 1;
            int temp;

            while (left < right) { // or right > left
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            System.out.print("First Half reversal: ");
            for (int number : arr) { // display the final reversed array
                System.out.print(number + " ");
            }
        }
    }

