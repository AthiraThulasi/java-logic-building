package StringManipulation;

public class RemoveFirstWordFromStringUsingSubString {

        public static void main(String[] args) {
            String s = "Athira works at Capgemini";
            String result = s.substring(s.indexOf(" ")+1);// Start the substring from the position of the first space
            System.out.println(result);                      // +1 skips the first space
// The indexOf(" ") solution works when words are separated by spaces.
        }
    }






