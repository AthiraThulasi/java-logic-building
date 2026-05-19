package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args){
        Map<Character,Integer> map = new HashMap<>();

        String name = "Aathiraaa";
        char [] nameoutput = name.toCharArray();
        for(char ch : nameoutput)
        {
        if(map.containsKey(ch))
            {
            map.put(ch,map.get(ch) +1);
            }

            else
            {
                map.put(ch,1);
            }
        }
        System.out.println(map);

    }

}
