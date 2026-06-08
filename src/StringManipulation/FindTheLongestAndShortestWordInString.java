package StringManipulation;

public class FindTheLongestAndShortestWordInString {

        public static void main(String[] args) {

            String str = "Every day is a new opportunity";

            String[] words = str.split(" ");// returns String array

            // we made first word as longest and shortest and then compare the rest with the first
            String longestWord = words[0];
            String shortestWord = words[0];

            for (String word : words) {

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }

                if (word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }

            System.out.println("Longest word: " + longestWord);
            System.out.println("Shortest word: " + shortestWord);
        }
    }

