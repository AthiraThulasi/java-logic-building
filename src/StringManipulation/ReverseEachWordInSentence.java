package StringManipulation;

public class ReverseEachWordInSentence {

    public static void main(String[] args) {
        String sentence = "peace and happiness";
        String[] words = sentence.split(" ");
        for(String word : words ){
            for(int i=word.length()-1;i>=0;i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" "); //Space after each reversed word
            }
        }

    }
