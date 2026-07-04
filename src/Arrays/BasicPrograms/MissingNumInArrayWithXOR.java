package Arrays.BasicPrograms;

public class MissingNumInArrayWithXOR {


// This logic applies  only to sequence starting from 1

        public static void main(String[] args) {
            int numbers[] = {1, 2, 4, 5, 6};
            int missingNumber = 0;

            for (int no : numbers) {
                missingNumber = missingNumber ^ no;
                //First loop = xor only the numbers inside array (present numbers).
                //missingNumber will contain the XOR of all numbers that are present in the array.


            }
            // Second Loop -  looping over the expected full range of numbers, including missing num, so i<=6
            //Since XOR is a commutative and associative operation, all numbers that appear in both the array and the range will cancel out (because x ^ x = 0).
            for (int i = 1; i <= 6; i++) {
                missingNumber = missingNumber ^ i;
            }

            System.out.println(missingNumber);
            //Result:
            //
            //After both loops, missingNumber will hold the missing number,
            //because all other numbers have XORed out to zero.
        }
    }

//After the first loop,
//missingNumber already holds the XOR of all the numbers present in the array.say 4 >011
// Then in the second loop,
//You continue using that same missingNumber(4 >>011) and XOR it with the full expected range (like 1 to 6).
//Because of XOR properties (same number XOR twice = 0),
//✅ all the matching numbers cancel out,
//✅ only the missing number stays in missingNumber at the end!


//✅ First XOR array elements: {1, 2, 4, 5, 6}):
// array = {1, 2, 4, 5, 6} and missing is 3.
//First loop (XOR of array elements):
//missingNumber = 0 ^ 1 ^ 2 ^ 4 ^ 5 ^ 6

//✅ Second XOR loop (full range from 1 to 6):
//Second loop (XOR of all numbers from 1 to 6):
//missingNumber = missingNumber ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6
//Now numbers like 1 ^ 1, 2 ^ 2, 4 ^ 4, 5 ^ 5, 6 ^ 6 become 0,
//so the only number left unpaired is 3 (the missing one)!
//Thus finally ➔ missingNumber = 0 ^ 3 = 3
//Why it works:
//XOR of same numbers cancels out: x ^ x = 0
//a ^ 0 = a
//So, (1^2^3^4^5^6) ^ (1^2^4^5^6) = 3, because 3 is the only one that doesn’t cancel.

