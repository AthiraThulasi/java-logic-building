package StringManipulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromASentence {

        public static void main(String[] args) {

            String name = "value the people who value you";

            String[] words = name.split(" ");

            Set<String> set = new LinkedHashSet<>();

            for(String word : words){
                set.add(word);
            }

            for(String word : set){
                System.out.print(word + " ");
            }
        }
    }

