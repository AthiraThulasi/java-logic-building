package Arrays.BasicPrograms;

public class FindSecondLargestElementInAnArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7 };
        int largestNumber = Integer.MIN_VALUE; // Integer.MIN_VALUE is the smallest possible integer in Java
        //We use Integer.MIN_VALUE so that every element in the array is guaranteed to be greater than the starting value
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

//LOGIC

//Both largestNumber and secondLargestNumber are initialized with Integer.MIN_VALUE because initially no largest or second largest number is found.

//Using the smallest possible integer ensures that any number from the array can replace it during comparison.
