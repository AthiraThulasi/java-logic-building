
// Move all zeros to the end

package stringprograms;

public class MoveAllZerosToEnd {
     public static void main(String[] args) {
         int[] a = {1, 0, 2, 0, 3,0};
// The two-pointer technique is a method where we use two pointers to scan through an array or list, often from opposite ends or at different paces.
// By moving these pointers toward each other or in a coordinated way, we can rearrange elements efficiently,
// like grouping certain values, partitioning arrays, or finding pairs that meet a condition

         int current = 0; // pointer for index// for traversing
         int nonzerovalue = 0; // pointer for nonzerovalue
         int temp = 0;

         for (current = 0; current <= a.length - 1; current++) { // current traverse through the array
             if (a[current] != 0) { // swap
                 temp = a[nonzerovalue];
            a[nonzerovalue] = a[current];
                 a[current] = temp;
                 nonzerovalue++;
             }
         }

         for (int output : a) {
             System.out.print(output + " ");
         }


     }
     }

