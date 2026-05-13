package Arrays;

public class FindSecondLargestNumInAnArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7 };
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int number : a) {
            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            } else if (number > secondLargestNumber && number != largestNumber) {
                secondLargestNumber = number;
            }
        }
        System.out.println("Second Largest Number" + secondLargestNumber);
    }
}

