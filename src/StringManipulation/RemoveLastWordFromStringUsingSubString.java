package StringManipulation;

import java.util.concurrent.Flow;

public class RemoveLastWordFromStringUsingSubString {

    public static void main(String[] args) {
        String s = "Athira works at Capgemini";
        String result = s.substring(0, s.lastIndexOf(" "));// lastIndexOf(" ") → last occurrence of space
        System.out.println(result);
// The lastIndexOf(" ") solution works when words are separated by spaces.
    }
}














