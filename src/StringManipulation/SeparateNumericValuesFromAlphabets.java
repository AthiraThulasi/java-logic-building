package StringManipulation;

    public class SeparateNumericValuesFromAlphabets {
        public static void main (String [] args){

            String input ="Athi123";

            char [] charArray = input.toCharArray();
            StringBuilder numbers  = new StringBuilder();
            StringBuilder alphabets = new StringBuilder();

            for(char currentchar : charArray) {
                if (Character.isAlphabetic(currentchar)) {
                    alphabets.append(currentchar);

                } else if (Character.isDigit(currentchar)) {
                    numbers.append(currentchar);
                }
            }

            System.out.println(alphabets.toString());
            System.out.println(numbers.toString());
        }
    }


