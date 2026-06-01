package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueCharactersInAString {
    public static void main(String[]args){

        String company = "I work at Capgemini";
        char [] characters = company.toCharArray();
        Map<Character,Integer> map = new HashMap<>();



        for(char ch : characters){
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
                else {
                    map.put(ch,1);
                }

            }
        // print unique
        System.out.print("Unique characters : ");
        for(char key : map.keySet()){ // map.keySet() method returns a Set view of all the keys contained in your map.
            if(map.get(key) == 1){
                System.out.print(key + ",");
            }
        }

        }

    }

