package NumberPrograms;

public class FibinocciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int next;
        int number = 10;

        System.out.print(first + " " + second + " ");

        for (int i = 2; i < number; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

