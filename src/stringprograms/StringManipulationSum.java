package stringprograms;


//To find the sum of numbers placed in between string!


public class StringManipulationSum {
    public static void main(String[] args) {

        String input = "Qwer100t19y10";
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }

            else { // Non-digit → could be alphabet, symbol, space, etc.
                if(sb.length()>0){// Hey, did we just finish building a number? If yes, let’s convert and add it!
                    sum = sum + Integer.parseInt(sb.toString());//Integer is in string format, so convert to Int using Integer.parseInt
                    sb.setLength(0);//It clears the contents of the StringBuilder// Because we’re using the same sb object to build multiple numbers.

                }
            }
        }
        if(sb.length()>0){  // This loop - To handle the final number that was never followed by a non-digit character.
            sum = sum + Integer.parseInt(sb.toString());
        }
        System.out.println(sum);
      /*
NOTE:
abc12d45ef - Ends with letter  → last number 45 is followed by e → handled inside loop.
abc12d45ef45 - Ends with a digit > Final loop is needed!
Final Rule (Simple Version):
If string ends with digits → we need the final if (sb.length() > 0) block
If string ends with non-digits → we don’t need it, but having it doesn’t hurt.
 */
    }



}
