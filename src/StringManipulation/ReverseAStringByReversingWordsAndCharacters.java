package StringManipulation;

public class ReverseAStringByReversingWordsAndCharacters {
    // Reverse the words and then reverse the characters - Using Nested Loops
    // Reversing the order of words
    // Reversing the characters inside each word

    public static void main(String[] args) {
        String name = "Live in the present";
        String[] words = name.split(" "); // split() returns a String Array >> ["Athira", "works", "at", "Infosys"]

        // Outer loop  → picks each word from end
        for (int i = words.length - 1; i >= 0; i--) {
            // length is an array property used to find the size of an array.

            String reversedWord = "";//Need a blank variable to start building the reversed word character by character.
            // reversedWord is declared inside the loop so that it resets to empty for every new word,

            // Inner loop → reverses the characters inside each word
            for (int j = words[i].length() - 1; j >= 0; j--) { // words[i] is a one single element from array ie String, so use length()
                reversedWord = reversedWord + words[i].charAt(j);//charAt(j) → fetches each character one by one from the current word
            }
            System.out.print(reversedWord + " ");
        }
    }
}

//LOGIC
/*
split(" ") converts the sentence into a String array of words.
Outer loop starts from the last index and picks words in reverse order.
words[i] gives one word at a time (example: "Infosys").
Inner loop uses words[i].length() - 1 to start from the last character of the current word.
charAt(j) fetches each character one by one from the current word in reverse direction.
reversedWord = reversedWord + words[i].charAt(j) keeps building the reversed word character by character.
// OUTPUT - sysofnI ta skrow arihtA
*/
