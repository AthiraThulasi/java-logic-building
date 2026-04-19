
// Remove all white spaces from the string - "  Nothing   will   work   unless    you do   ";

package stringprograms;

public class RemoveAllWhiteSpacesFromString {
    public static void main(String[] args) {
        String input = "  Nothing   will   work   unless    you do   ";

        // Note:trim() method in Java removes any leading (at the start) and trailing (at the end) whitespace from a string.
        // It doesn’t touch any spaces between words.

        input = input.trim();

        // How to remove the space in between the words
        // "\\s" means: any whitespace character
        // Using replaceAll("\\s", "") removes all whitespace characters from a string, including spaces, tabs, and newlines, regardless of how many are present.
        String output = input.replaceAll("\\s", "");

        //s+ - If need one space in between words.
        //String output = input.replaceAll("\\s+", " ");

        System.out.println(output);

    }
}


/* TAKE AWAY :

        | Pattern | What it sees                 |  Understanding
        | ------- | ---------------------------- |-----------------------------------------------------------
        | `\\s`   | 1 space at a time            |\\s replaces each space individually, so count stays same
        | `\\s+`  | all continuous spaces as ONE | \\s+ replaces a group of spaces, so count reduces

*/