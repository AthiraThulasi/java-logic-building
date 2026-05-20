package StringManipulation;

public class ReverseAStringByReversingWords {

    public static void main(String[] args) {
        String name = "Athira works at Infosys";
       String [] words = name.split(" "); // split() returns a String Array
       for(int i = words.length-1;i >=0; i-- ){ // Outer loop → reverses the word order
           // length is an array property used to find the size of an array.
           String reversedWord = "";
           for (int j = words[i].length() - 1; j >= 0; j--) { // Inner loop → reverses the characters inside each word
               reversedWord = reversedWord + words[i].charAt(j);
           } System.out.print(reversedWord + " "); }
        }



    }
