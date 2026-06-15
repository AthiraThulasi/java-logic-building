package FrequencyAndHashing;
import java.util.HashMap;
public class CountTheFrequencyOfSpecialCharactersInString {

        public static void main(String[] args) {

            String s = "abc#@!";
            HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
            char inputArray[] = s.toCharArray();

            for (char c : inputArray) {
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {// Filters OUT alphabets and numbers, keeping only special chars
                    if (frequency.containsKey(c)) { // Checks if the special char was already seen in map
                        frequency.put(c, frequency.get(c) + 1);
                    } else {
                        frequency.put(c, 1); // Adds with count 1, if new
                    }
                }
            }

            System.out.println(frequency);
        }
    }

