package Arrays.BasicPrograms;

import java.util.Arrays;

public class MergeTwoSortedArrays {
        public static void main(String[] args) {
            int a1[] = {1, 2, 4};
            int a2[] = {1, 3, 5};
            int a3[] = new int[a1.length + a2.length];
// if the arrays are not sorted
            //Arrays.sort(a1);
            //Arrays.sort(a2);
            int p1 = 0; // p1 = pointer for a1 array //p1 is pointing to the 0th index of array a1//p1 and p2 move forward through a1 and a2, respectively.
            int p2 = 0; // p2 = pointer for a2 array//p2 is pointing to the 0th index of array a2
            int p3 = 0; // p3 = pointer for a3 array //p3 is pointing to the 0th index of array a3
            //three pointers (p1, p2, p3) to iterate through a1, a2, and write to a3
            //p3 keeps track of the position where the next smallest element should go in a3.

            while (p1 < a1.length && p2 < a2.length) {//Keep looping as long as p1 hasn't reached the end of array c1 and p2 hasn't reached the end of array c2."
                if (a1[p1] < a2[p2]) { // if a1 > a2 ,a2 will be moved to a3 and the pointer of a1(p1)remains in the same place!
                    a3[p3] = a1[p1];
                    p3++;
                    p1++;
                } else {
                    a3[p3] = a2[p2];
                    p3++;
                    p2++;
                }
            }

            while (p1 < a1.length) {
                a3[p3] = a1[p1];
                p3++;
                p1++;
            }

            while (p2 < a2.length) {
                a3[p3] = a2[p2];
                p3++;
                p2++;
            }
            System.out.println(Arrays.toString(a3));
        }

    }

