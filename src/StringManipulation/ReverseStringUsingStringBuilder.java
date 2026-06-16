package StringManipulation;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String quote = "Every second counts, Use it wisely";
        StringBuilder results = new StringBuilder(quote);
        String reversedOutput = results.reverse().toString();
        // reverse() returns a StringBuilder object
        // use toString() to convert the StringBuilder into a String
        System.out.println(reversedOutput);


    }
}
