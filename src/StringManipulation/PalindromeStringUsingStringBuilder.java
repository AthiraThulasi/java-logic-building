package StringManipulation;

public class PalindromeStringUsingStringBuilder {

        public static void main(String[] args) {

            String original = "madam";

            String reversed = new StringBuilder(original)
                    .reverse()
                    .toString();

            if (original.equals(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }

