package StringManipulation;

import java.util.Arrays;

public class ReverseTheCaseInString {
    public static void main(String[] args) {
        String s = "Believe you can and you are halfway there";

        StringBuilder result = new StringBuilder();
        //StringBuilder is mutable >> used for building or modifying strings efficiently in Java.
        //This creates an empty StringBuilder object named result.

        char [] letters = s.toCharArray();// convert string to char array -
        System.out.println("letters are" + Arrays.toString(letters)); //O/P > [H, e, l, l, o,  , W, o, r, l, d]
        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {  // Character is the wrapper class for the primitive data type char.
                result.append(Character.toLowerCase(letter));// convert to lowercase and append to result

            } else if (Character.isLowerCase(letter)) {
                result.append(Character.toUpperCase(letter));// convert to uppercase and append to result

            } else result.append(letter);
        }
        System.out.println(result);
    }

}
