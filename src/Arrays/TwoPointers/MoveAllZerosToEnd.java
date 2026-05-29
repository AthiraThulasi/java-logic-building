package Arrays.TwoPointers;

import javax.security.auth.login.LoginContext;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

            int a[] = { 1, 0, 2, 0, 3, 0 };

            int putNonZeroValuesHere = 0;
            int temp; // swapping!!
// currentScans every element one by one
// NonZeroValuesHereMarks where the next non-zero should land
            for (int current = 0; current < a.length; current++) {
                if (a[current] != 0) {
                    // Swap
                    temp = a[putNonZeroValuesHere];
                    a[putNonZeroValuesHere] = a[current];
                    a[current] = temp;
                    putNonZeroValuesHere++;
                }
            }

            for (int no : a) {
                System.out.print(no + " ");
            }
        }
    }


//Logic

//This program has Two Pointers because:

//Two variables both holding indexes - current & putNonZeroValuesHere
//Both pointing at the same array - But moving at different speeds
// One pointer is fast → scans everything
// One pointer is slow → only moves when a condition is met
// Every time a non-zero and a zero swap places:Non-zero goes left  and Zero goes right







