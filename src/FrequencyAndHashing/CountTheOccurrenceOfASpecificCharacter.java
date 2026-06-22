package FrequencyAndHashing;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurrenceOfASpecificCharacter {

        public static void main(String[] args) {

            String str = "Value each second";
            char targetChar = 'e';

            Map<Character, Integer> map = new HashMap<>();

            // Count frequency of each character
            for (char ch : str.toCharArray()) {

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            // Print occurrence of the target character
            if (map.containsKey(targetChar)) {
                System.out.println(targetChar + " occurs " + map.get(targetChar) + " times");
            } else {
                System.out.println(targetChar + " does not exist in the string");
            }
        }
    }

