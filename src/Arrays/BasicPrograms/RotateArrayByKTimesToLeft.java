package Arrays.BasicPrograms;

import java.util.Arrays;

public class RotateArrayByKTimesToLeft {
    //Rotate Left by k	means >> rotate first k elements to the last
   //In left rotation, we push the first k elements to the back
  // → so we reverse parts first, and then fix everything.

        public static void main(String[] args) {

            int a[] = {1, 2, 3, 4, 5}; //O/P > 3,4,5,1,2
            int k = 2;// rotating 2 elements to left
            k = k % a.length;

            int left = 0;
            int right = a.length-1;


            // First reverse the first k elements 0,1 indexes (left elements)
            a = reverse(a,0,k-1);// arrayreference, start index,first 2 elements
            System.out.println(java.util.Arrays.toString(a));

            // reverse the remaining elements of the array
            a = reverse(a, k, a.length - 1);
            System.out.println(java.util.Arrays.toString(a));

            // reverse the whole array
            a = reverse(a,left,right);
            System.out.println(Arrays.toString(a)); // 5,4,3,2,1
        }
        public static int[] reverse(int[] a, int left, int right) {
            while (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            return a;
        }
    }




