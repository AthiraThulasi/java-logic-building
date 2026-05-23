package Arrays.BasicPrograms;

public class FindLargestElementInAnArray {

        public static void main(String[] args) {
            int input[] = {10, 20, 44, 33, 12, 67};

            int largestNumber = input[0];

            for (int index = 1; index <= input.length - 1; index++) {
                if (input[index] > largestNumber) {
                    largestNumber = input[index];
                }
            }
            System.out.println("The Largest Number is" + largestNumber);
        }
    }

