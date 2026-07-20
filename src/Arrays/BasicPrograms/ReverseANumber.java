package Arrays.BasicPrograms;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 105;
        int reversedNumber = 0;

        // Keep looping until all digits are processed
        while (num != 0) {

            // Get the last digit
            int digit = num % 10;

            // Add the digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit from the original number
            //to remove the last digit that has already been processed, so that in the next iteration we can process the next digit.
            num = num / 10;
        }

        // Print the reversed number
        System.out.println("Reversed number is: " + reversedNumber);
    }

}