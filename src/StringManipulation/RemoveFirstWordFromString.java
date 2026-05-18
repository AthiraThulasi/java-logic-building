package StringManipulation;

public class RemoveFirstWordFromString {

    public static void main(String[] args) {

        String s = "Athira works at Infosys";

        String[] StrOutput = s.split(" "); // Output is a String Array = {"Athira","works","at","Infosys"};

        for (int i = 1; i < StrOutput.length; i++) { // length → property for array - is used to find the length
            System.out.println(StrOutput[i]);


        }
    }
}
