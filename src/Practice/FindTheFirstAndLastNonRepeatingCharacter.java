package Practice;
import java.util.Map;
import java.util.HashMap;



public class FindTheFirstAndLastNonRepeatingCharacter {

    public static void main(String[] args) {
        String name = "Stay Happy and Healthy";
        char[] Characters = name.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : Characters) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : Characters) {
            if (map.get(ch) == 1) {
                System.out.println("first non repeating: " + ch);
                break;
            }

            }

            for (int i = Characters.length - 1; i >= 0; i--) {
                if (map.get(Characters[i]) == 1) {
                    System.out.println("last non repeating: " + Characters[i]);
                    break;
                }


            }
        }
    }
