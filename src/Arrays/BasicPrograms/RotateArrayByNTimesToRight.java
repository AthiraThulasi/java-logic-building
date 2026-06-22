package Arrays.BasicPrograms;

public class RotateArrayByNTimesToRight {
    //Rotate Right by k	means >> rotate Last k elements to the front.
    // LOGIC : here k = 3;
// (1) Reverse the full array using method  >> public static int[] reverse(int[] arr, int start, int end)
//(2) Reverse from 0 to k-1 [index - 0,1,2]
//(3) Reverse from k to total length of array [index 3 to last]

// In right rotation, we bring the last k elements to the front
// → so we reverse everything first, and then fix the parts.

        public static void main(String[] args) {
            int [] a = {1, 2, 3, 4, 5, 6, 7}; // Rotate the array 3 times
            // o/p = {5.6.7,1,2,3,4}
            int n = 3;// rotate 3 to right
            int k = n % a.length;//a.length gives you the total number of elements in the array >> When rotating, you’re rotating the whole array
            // We use k = n % array.length to ensure that the number of rotations doesn't exceed the array's size.
            //Keeps the rotation within valid index bounds.
            //Prevents ArrayIndexOutOfBoundsException
            // output 5,6,7,1,2,3,4
            int left = 0;
            int right = a.length - 1;
            // Reverse everything from index 0 to the last index.
            //In right rotation, we bring the last k elements to the front → so we reverse everything first, and then fix the parts.
            a = reverse(a, left, right);
            System.out.println(java.util.Arrays.toString(a));
            //a = {7,6,5,4,3,2,1}
            // This calls the method reverse(...) and passes > the array a
            // the starting index left (which is 0)
            //the ending index right (which is a.length - 1)

            //  reverses the first k (elements of the fully reversed array.
            a = reverse(a, 0, k - 1);
            System.out.println(java.util.Arrays.toString(a));

            // Assuming 'reverse' method is defined elsewhere
            a = reverse(a, k, a.length - 1);
            System.out.println(java.util.Arrays.toString(a));
        }

        // You would need to implement the 'reverse' method separately, for example:
        //Main method handles the logic flow (rotate the array).
        public static int[] reverse(int[] arr, int left, int right) { //arr is just a local name for the same array a
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return arr;
        }
    }



