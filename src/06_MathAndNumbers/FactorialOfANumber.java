package NumberPrograms;

public class FactorialOfANumber {


        public static void main (String[] args){
            int number=5; // If number = 1, then result is always going to be 1.
            int result = 1;
            for(int i = 1; i<=number; i++){
                result = result*i;
            }
            System.out.println(result);
        }
    }

//If I try to find the factorial of 50, it is going to be a large number, which integer can't hold,so o/p is going to be 0.

