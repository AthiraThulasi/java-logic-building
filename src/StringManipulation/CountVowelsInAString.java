package StringManipulation;

public class CountVowelsInAString {

        public static void main(String[] args) {
            String name = "Athira Beena";
            String vowels = "aeiouAEIOU";
            int count = 0;

            for (int index = 0; index <= name.length() -1; index++){ // length() - method in string

                if(vowels.indexOf(name.charAt(index))!=-1){ // not equal to -1 means character is present in vowel list, count++
                    count ++;
                }}
            System.out.println("Total num of vowels are : "+ count);
        }
    }


/*LOGIC - Evaluation order
======================================
name.charAt(index) > checked first
 Gets the character at the current position (index) in the string name.

vowels.indexOf(...)
Checks if that character exists in the vowels string.

!= -1
 Confirms if it's a vowel (not -1 means the character was found in vowels)*/

