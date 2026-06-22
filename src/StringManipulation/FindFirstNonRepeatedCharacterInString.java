package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacterInString {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String name = "Stay Happy and Healthy";
        char[] namechar = name.toCharArray();
        for (char ch : namechar) {
            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }

        for (char ch : namechar)
            {
                if (map.get(ch) == 1) {
                    System.out.println("First non-repeated character is: " + ch);
                    //break;
                }
            }
        }
    }


