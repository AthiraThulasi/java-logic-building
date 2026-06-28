package MathAndNumbers;

//An Armstrong number (for 3-digit numbers) is a number where:Sum of the cube of each digit = the number itself

public class CheckIfANumIsAmstrong {
    public static void main(String[] args) {
        int number = 153;
        int copyNumber = number;
        int lastDigit;
        int armStrong = 0;

        while(copyNumber!=0) {
            lastDigit = copyNumber%10;// This gives the last digit of the number ie 153 % 10 = 3
            armStrong = armStrong+(lastDigit*lastDigit*lastDigit);
            copyNumber = copyNumber/10;// This removes the last digit from the number so the loop can move to the next digit.
        }
//Number still holds 153, while copyNumber has become 0.
        if(number == armStrong) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("No");
        }
    }
}

/*
num % 10>>	Get the last digit
num / 10>>	Remove the last digit
a³ + b³ + c³>>	Check Armstrong condition for 3 digits
=======================================================
 copyNumber % 10 — Why?
This gives the last digit of the number.
 For 153:
153 % 10 = 3
15 % 10 = 5
1 % 10 = 1
 This is how we extract each digit from right to left.
==============================================================
 copyNumber / 10 — Why?
This removes the last digit from the number so the loop can move to the next digit.
 For 153:
153 / 10 = 15
15 / 10 = 1
1 / 10 = 0
 Loop ends when the number becomes 0.
=================================================================
 Summary (Your Key Learning Points)
Operation	Purpose
num % 10	Get the last digit
num / 10	Remove the last digit
a³ + b³ + c³	Check Armstrong condition for 3 digits
===============================================================
First Iteration
==========================
lastDigit = copyNumber % 10;   // 153 % 10 = 3
armStrong = armStrong + (3*3*3); // 0 + 27 = 27
copyNumber = copyNumber / 10;   // 153 / 10 = 15  (since it's int division, decimal is dropped)
==================================================================================================
 Extra Tip
If you want to write a general Armstrong check (for 4-digit, 5-digit...), you need to:
First count the number of digits
Then raise each digit to the power of that count

L










 */
