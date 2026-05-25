package StringManipulation;

public class ReverseStringWithoutReversingWords {

    public static void main(String[] args) {
        String s = "I work at Infosys";

        String[] words = s.split(" ");  // output - ["I","work","at","Infosys"] - String Array
        // Split the string wherever there is a space.

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

// Output - Infosys at work I