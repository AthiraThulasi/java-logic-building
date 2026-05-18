package StringManipulation;

public class ReverseTheFirstWordInString {
    public static void main(String[] args) {
        String s = "Athira works in Infosys";
        String[] charOutput = s.split(" "); //Output - ["Athira" "works" "in" "Infosys"]
        StringBuilder sb = new StringBuilder(charOutput[0]);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}

