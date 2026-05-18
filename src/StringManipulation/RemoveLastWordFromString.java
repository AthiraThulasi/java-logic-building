package StringManipulation;

public class RemoveLastWordFromString {

    public static void main(String[] args) {
        String s = "Athira works at Infosys";

        String [] outputArray = s.split( " ");

        for(int i = 0; i < outputArray.length-1; i++){

            System.out.print(outputArray[i] + " ");
        }
        }


    }

