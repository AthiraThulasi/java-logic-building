package StringManipulation;

public class ReverseAStringByReversingWords {

    public static void main(String[] args) {
        String name = "Athira works at Infosys";
        String[] words = name.split(" "); // split() returns a String Array >> ["Athira", "works", "at", "Infosys"]

        // Outer loop → reverses the word order
        for (int i = words.length - 1; i >= 0; i--) {
            // length is an array property used to find the size of an array.

            String reversedWord = "";//Need a blank variable to start building the reversed word character by character.

            // Inner loop → reverses the characters inside each word
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + words[i].charAt(j);
            }
            System.out.print(reversedWord + " ");
        }
    }
}

//LOGIC
//Outer loop
//   ↓
//Picks one word at a time from last to first
//   ↓
//Inner loop
//   ↓
//Reverses characters of that word


// OUTPUT - sysofnI ta skrow arihtA