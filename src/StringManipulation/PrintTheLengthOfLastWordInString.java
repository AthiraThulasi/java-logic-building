package StringManipulation;

public class PrintTheLengthOfLastWordInString {

        public static void main(String[] args) {
            String s = "        Be Kind        ";
            System.out.println(s);
            System.out.println(s);
            int count = 0;
            char inputArray[] = s.toCharArray();
            for (int i = inputArray.length - 1; i >= 0; i--) {
                if (inputArray[i] != ' ') {
                    count = count + 1;
                } else {
                    if (count > 0) {// count > 0  means we already counted some characters of the last word, so now we hit a space, so the last word is complete.
                        // So print the count and break.
                        System.out.println(count);
                        break;// exits the loop completely, no more iteration
                    }
                }
            }
        }
    }

