package StringManipulation;

import java.util.HashMap;
import java.util.Map;

class FirstAndLastNonRepeatingCharactersInString {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String name = "Stay Happy and Healthy";
        char[] characters = name.toCharArray();

        // Build frequency map — ONCE
        for (char ch : characters) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // FIRST non-repeating → scan forward
        for (char ch : characters) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character is: " + ch);
                break;
            }
        }

        // LAST non-repeating → scan BACKWARD
        for (int i = characters.length - 1; i >= 0; i--) {
            if (characters[i] != ' ' && map.get(characters[i]) == 1) {
                System.out.println("Last non-repeated character is : " + characters[i]);
                break;
            }
            }
        }
    }
