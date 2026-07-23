package StringManipulation;

public class StringCompression {

    public static void main(String[] args) {

        String str = "AAABBCC";
        String result = "";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i) + count;
                count = 1; // When the character changes, print the previous character and reset count to 1 for the new character.
            }
        }

        // Add the last character and its count
        result = result + str.charAt(str.length() - 1) + count;

        System.out.println(result);
    }
}

/* LOGIC
Start from the first character.
Count how many times it repeats consecutively.
When the character changes:
Print the previous character.
Print its count.
Repeat until the end.
 */