package Practice;

public class RotateArrayKElementsToRight {
    // rotate 5 elements to right >> n=5

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // 60,70,80,90,100,10,20,30,40,50
        int n = 5;
        int K = n % arr.length;
        int left = 0;
        int right = arr.length - 1;
        reverse(arr, left, arr.length - 1);// 100,90,80,70,60,50,40,30,20,10
        System.out.println("fully reversed array");

        reverse(arr, 0, K - 1);
        System.out.println("fully reversed array");

        reverse(arr, K, arr.length - 1);
        System.out.println("fully reversed array");


    }

    public static int[] reverse(int arr[], int left, int right) {
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