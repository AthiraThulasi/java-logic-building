package Arrays.TwoPointers;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

            int a[] = { 1, 0, 2, 0, 3, 0 };

            int putNonZeroValuesHere = 0;
            int temp; // swapping!!

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







