package StringManipulation;

public class PrintFirstAndLastWordFromString {

    public static void main(String[] args) {
        String status = "Athira works at Capgemini";
        String [] words =  status.split(" ");
        // split() returns a string array - ["Athira","works","at","Capgemini"];
        // spaces themselves are not stored in the array
        System.out.println("First Word :" + words[0]);
        System.out.println("Last Word :" + words[words.length-1]);
    }

}
