package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args){

        Map<Character,Integer> map = new HashMap<>();
        // // Map stores character as key and count as value

        String name = "Keep shining";

        char [] nameoutput = name.toCharArray();
        //  Converts String into char array >> ['A','a','t','h','i','r','a','a','a']
        for(char ch : nameoutput) // Enhanced for loop to get each character one by one
        {
        if(map.containsKey(ch)) // Checks whether character already exists in map
            {
            map.put(ch,map.get(ch) +1); // map.get(ch)+1 >> Gives the current count/value of the character
            }      // Gets existing count and increases by 1

            else
            {
                map.put(ch,1); // First time character appears, so count is set to 1
                // First time character comes → store count as 1
            }
        }
        System.out.println(map);

    }

}
