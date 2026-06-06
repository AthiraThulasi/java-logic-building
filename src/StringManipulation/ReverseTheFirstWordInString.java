package StringManipulation;

public class ReverseTheFirstWordInString {
    public static void main(String[] args) {
            String sentence = "Hard work pays off";
            String [] words = sentence.split(" ");
            String firstWord = words[0];
            for(int i=firstWord.length()-1;i>=0;i--){
                System.out.print(firstWord.charAt(i));

            }
        }
    }

