package StringManipulation;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {

    public static void main(String[] args) {

        String s1 = "Silent";
        String s2 = "Listen";

        // Step 1: Check the length of 2 strings are equal
        // Step 2 : Convert String to charArray
        // Use the arrays built-in function sort -> Arrays.sort()

        if (s1.length() == s2.length()) {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Not Anagrams");
            }

        } else {
            System.out.println("Not Anagrams");
        }

    }
}






