package MathAndNumbers;

    public class NumberPalindrome {

        public static void main(String[] args) {

            int number = 121;
            int originalNumber = number;
            int reverseNumber = 0;
            int lastDigit;

            while (number != 0) {
                lastDigit = number % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                number = number / 10;
            }

            if (originalNumber == reverseNumber) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }

