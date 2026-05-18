package StringManipulation;

import java.sql.SQLOutput;

public class ReverseAString {

    public static void main(String[] args) {
        String name = "Athira";
for(int i = name.length()-1;i >= 0; i--){ // Reverse loop -	length - 1
    // length() is a method in String used to get the number of characters in the string.
    System.out.print(name.charAt(i));
}
    }
}

