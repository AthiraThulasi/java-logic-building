package StringManipulation;

public class GetOnlyAlphabetsFromAString {

    public static void main (String [] args){
    String name = "DontSress@123#QA";
        String result = name.replaceAll("[^a-zA-Z]", "");
// In regex ^ means anything except this  >> So [^a-zA-Z] means replace anything except alphabets
        // replace anything except alphabets with empty string
        System.out.println(result);
    }
}


