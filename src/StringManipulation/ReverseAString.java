package StringManipulation;

import java.sql.SQLOutput;

public class ReverseAString {

    public static void main(String[] args) {
        String name = "Athira";
for(int i = name.length()-1;i>0; i--){
    System.out.print(name.charAt(i));
}
    }
}