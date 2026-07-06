package MathAndNumbers;

public class SwapWithoutTemp {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a + b;//30
        System.out.println("a is : " + a);
        b = a - b;//10
        System.out.println("b is : " + b);
        a = a - b;//20
        System.out.println("a is : " + a);
    }
}