package Arrays.BasicPrograms;

    //Leader is an element which is greater than all elements to its right

    public class LeaderInArray {
        public static void main(String[] args) {


            int a[] = {16, 17, 4, 3, 5, 2};
            int length = a.length; // 6
            int maxRight = a[length - 1];
            System.out.println(maxRight);

            for (int index = length - 2; index >= 0; index--) {
                if (a[index] > maxRight) {
                    maxRight = a[index];// While moving left, we always want to store the biggest number seen so far in maxRight.

                    //Is this number bigger than the biggest I’ve seen so far from the right?
                    //a.length - 1	Last index of the array	3
                    //a[a.length - 1]	Value at the last index
                }
            }
        }
    }




