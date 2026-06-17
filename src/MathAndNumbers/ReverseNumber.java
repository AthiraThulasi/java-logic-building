package MathAndNumbers;

public class ReverseNumber {

        public static void main(String[] args) {

            int number = 12345;
            int reversedNumber = 0;

            while (number > 0) {

                int digit = number % 10; // Extract last digit

                reversedNumber = reversedNumber * 10 + digit;

                number = number / 10; // Remove last digit
            }

            System.out.println("Reversed Number: " + reversedNumber);
        }
    }

