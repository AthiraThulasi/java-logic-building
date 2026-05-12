// Count frequency of characters in a string

package stringprograms;
import java.util.*;
public class CountTheFrequencyOfCharactersInString {

        public static void main(String[] args) {

            String str = "athira";

            Map<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {
                //  if (ch == ' ') continue; // To ignore if there is space in between the string
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            System.out.println("Character frequency: " + map);
        }
    }

