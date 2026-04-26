//  Reverse Second Half Of An Array

package Arrays;

import java.util.Arrays;

public class ReverseSecondHalfOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int temp;
        int mid = arr.length / 2;
        int left = mid;
        int right = arr.length - 1;

        while (left < right) { // or right > left
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;


        }
        System.out.print("Second Half reversal: ");
        for (int number : arr) { // display the final reversed array
            System.out.print(number + " ");
        }
    }
}

//int [] num = {12,45,0,12,11,55,33,11}
