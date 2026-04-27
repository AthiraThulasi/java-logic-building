package Arrays;


import java.util.Arrays;

public class RemoveDuplicatesFromArray1 {


    public static void main(String[] args) {

        int a[] = {20, 10, 30, 20, 10, 40};
        System.out.println(Arrays.toString(a));//If Arrays.toString is not used, a will print as its hashcode!
        a = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(a));
    }
}

//streams reduces boilerplate —  don't need to write manual loops or conditionals.
// It makes the code concise, readable, and less error-prone."
