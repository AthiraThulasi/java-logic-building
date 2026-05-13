package StringManipulation;

public class PrintTheLengthOfLastWordInString {

        public static void main(String[] args) {
            String s = "        Hello world     moon        ";
            System.out.println(s);
            System.out.println(s);
            int count = 0;
            char inputArray[] = s.toCharArray();
            for (int i = inputArray.length - 1; i >= 0; i--) {
                if (inputArray[i] != ' ') {
                    count = count + 1;
                } else {
                    if (count > 0) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }

