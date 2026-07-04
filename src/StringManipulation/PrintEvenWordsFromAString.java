package StringManipulation;

public class PrintEvenWordsFromAString {
    public static void main(String[] args) {

        String sentence = "I am beautiful and kind hearted";
        String[] words = sentence.split(" ");
        //System.out.println(Arrays.toString(name));
        for (String word : words) {
            //char[] letters = word.toCharArray();
            int len = word.length();
            if (len % 2 == 0) {
                System.out.println(word);


                //String input = "java";
                //int len = input.length();
            }   // System.out.println(len);



        }
    }
}







