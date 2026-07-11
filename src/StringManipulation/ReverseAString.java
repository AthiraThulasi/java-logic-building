package StringManipulation;

public class ReverseAString {

    public static void main(String[] args) {
        String name = "heartbeat";
for(int i = name.length()-1;i >= 0; i--){ //for loop - changes index values one by one
    // length() is a method in String used to get the number of characters.
    System.out.print(name.charAt(i));//charAt(i) → goes to that index and gets the character

    // charAt() is memory efficient because it accesses characters directly from the String without creating a new array.
    // toCharArray() creates an extra character array in memory.
}
    }
}

