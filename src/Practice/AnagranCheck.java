package Practice;
import java.util.Arrays;
public class AnagranCheck {
    public static void main(String[] args) {

        String s1 = "Silent";
        String s2 = "listen";

        if (s1.length() == s2.length()) {

            char s1Array[] = s1.toCharArray();
            char s2Array[] = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println("two are anagram");
            } else {
                System.out.println("not anagrams");

            }
        }
        else {
            System.out.println("not anagrams");
        }
    }

}