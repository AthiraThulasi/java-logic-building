package StringManipulation;
import java.util.Arrays;
public class CheckIfTwoStringsAreAnagramUsingAFunction {

        // The logic — returns true/false instead of printing
        static boolean isAnagram(String a, String b) {
            if (a.length() != b.length()) return false;   // early exit
            char[] x = a.toLowerCase().toCharArray();
            char[] y = b.toLowerCase().toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);
            return Arrays.equals(x, y);
        }

        // The runner — calls the logic and handles printing
        public static void main(String[] args) {
            String s1 = "Listen";
            String s2 = "Silent";

            if (isAnagram(s1, s2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("not Anagrams");
            }

            // reusable! test more pairs instantly:
            System.out.println(isAnagram("Athira", "Neil"));   // false
            System.out.println(isAnagram("race", "care"));     // true
        }
    }






