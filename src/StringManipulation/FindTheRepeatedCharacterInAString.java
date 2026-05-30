package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class FindTheRepeatedCharacterInAString {
    public static void main(String[] args) {
             String str = "Athiraaa";
              Map<Character, Integer> map = new HashMap<>();

                // Count frequency of each character
                for (char ch : str.toCharArray()) {

                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);// map.get(key)returns the value associated with that key.
                    } else {
                        map.put(ch, 1);
                    }
                }

                // Print repeated characters
                System.out.println("Repeated characters are:");

                for (Character ch : map.keySet()) {
                    if (map.get(ch) > 1) {
                        System.out.println(ch);
                    }
                }
            }
        }