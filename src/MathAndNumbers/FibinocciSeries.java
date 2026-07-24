package MathAndNumbers;

public class FibinocciSeries {
// A Fibonacci series is a sequence of numbers where each number is the sum of the previous two numbers.
    public static void main(String[] args) {

        // The first two numbers (0 and 1) are already known, We start calculating from the third number.
        int first = 0;
        int second = 1; // initialize first as 0 and second as 1.
        int next;
        int number = 10;

        System.out.print(first + " " + second + " ");
        // print the first 2 numbers we already know.
        // If we don't print first and second before the loop, the output starts from the third Fibonacci number, so the first two numbers (0 and 1) are missing.

        for (int i = 2; i < number; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second; // first and second always hold the latest two Fibonacci numbers needed for the next calculation
            second = next;
        }
    }
}

