package Arrays.BasicPrograms;
import java.util.Arrays;


  class CombineTwoarrays {
        public static void main(String[] args) {
            int[] a = {1, 2, 4, 5};
            int[] b = {1, 0, 3, 5, 100};
            int[] result = new int[a.length + b.length];

            int p1 = 0;
            int p2 = 0;
            int p3 = 0;


            while (p1 < a.length && p2 < b.length) {

                if (a[p1] < b[p2]) {
                    result[p3] = a[p1];
                    p1++;
                    p3++;
                } else {
                    result[p3] = b[p2];
                    p3++;
                    p2++;

                }

                while (p1 < a.length) {
                    result[p3] = a[p1];
                    p3++;
                    p1++;
                }


                while (p2 < b.length) {
                    result[p3] = b[p2];
                    p3++;
                    p2++;

                }

                System.out.println("result is" + Arrays.toString(result));

            }


        }


    }


