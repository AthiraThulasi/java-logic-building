package StringManipulation;

public class GetOnlyAlphabetsFromAString {

    public static void main (String [] args){
    String name = "Stay@123#Happy";
        String result = name.replaceAll("[^a-zA-Z]", "");
// In regex ^ means anything except this  >> So [^a-zA-Z] means replace anything except alphabets
        // The second argument "" is an empty string//replace anything except alphabets with empty string
        System.out.println(result);
    }
}


