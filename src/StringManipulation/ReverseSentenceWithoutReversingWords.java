package StringManipulation;

public class ReverseSentenceWithoutReversingWords {

    public static void main(String[] args) {
        String s = "Be happy and healthy";

        String[] words = s.split(" ");  // output - ["Be","happy","and","healthy"] - String Array
        // Split the string wherever there is a space.

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

// Output - healthy and happy Be
