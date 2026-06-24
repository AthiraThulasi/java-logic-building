package StringManipulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static void main(String[] args){

        String name = "Be Genuine";

        Set<Character> set= new LinkedHashSet<>();
        for(int i = 0; i<name.length();i++) { // Forward loop	i < length

            set.add(name.charAt(i));
        }

            for(Character ch : set)

                System.out.print(ch);

        }



    }

