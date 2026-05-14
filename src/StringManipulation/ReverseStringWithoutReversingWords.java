package StringManipulation;

public class ReverseStringWithoutReversingWords {

    public static void main(String[] args) {
        String s = "I work in Infosys";

        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}