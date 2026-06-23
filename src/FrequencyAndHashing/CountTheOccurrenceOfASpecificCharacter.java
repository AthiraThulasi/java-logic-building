package FrequencyAndHashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountTheOccurrenceOfASpecificCharacter {

        public static void main(String[] args) {

            String name = "Value each second";
            char target = 'a';
            char [] characters = name.toCharArray();
            Map<Character,Integer> map = new LinkedHashMap<>();
            for (char ch : characters){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                } }


            if(map.containsKey(target)){
                System.out.println(map.get(target));

            }
            else{
                System.out.println("no target present");
            }



        }
}