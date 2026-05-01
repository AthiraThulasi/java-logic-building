//Reverse the case in String
// Logic - Given is a String > Convert it to a character array and do array traversing of each character
package stringprograms;

import java.util.Arrays;

public class ReverseTheCaseInString {
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuilder result = new StringBuilder();
        //StringBuilder- is a mutable sequence of characters—ideal for building or modifying strings efficiently in Java.
        //This creates an empty StringBuilder object named result.
        char letters[] = s.toCharArray();// convert string to char array -
        System.out.println("letters are" + Arrays.toString(letters)); //O/P > [H, e, l, l, o,  , W, o, r, l, d]
        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                result.append(Character.toLowerCase(letter));//// convert to lowercase and append to result

            } else if (Character.isLowerCase(letter)) {
                result.append(Character.toUpperCase(letter));//// convert to uppercase and append to result

            } else result.append(letter);
        }
        System.out.println(result);
    }

}
