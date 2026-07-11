package Practice;


public class ReverseAString {
    public static void main(String[] args) {
        String name = "hello how are you";
        String[] words = name.split(" ");
        for (String word : words) {
            for (int i = word.length()-1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
