package MathAndNumbers;

public class SwapUsingTemp {
        public static void main (String[] args){

            int a = 10;
            int b= 20;
            int temp;

            temp = a;
            a = b;
            b = temp;
            System.out.println("a is : " + a);
            System.out.println("b is : " + b);

        }

    }
// This is not an optimized solution, as we are using extra memory - temp variable!

