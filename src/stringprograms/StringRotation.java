package stringprograms;


// Check whether s2 is rotation of s1; Are they rotation of each other?
// INTERVIEW -> rotate -> WINTERVIE -> EWINTERVI -> IEWINTERV -> VIEW INTER (Output)
public class StringRotation {
    public static void main(String[] args) {
        String s1 = "INTERVIEW";
        String s2 = "VIEWINTER";
// First check  - length of s1 & s2 are equal
//Second Check -  concatanation of s1 contains s2
// If one string is a rotation of another,
// it will always appear as a substring inside the original string concatenated with itself (s1 + s1).

        if ((s1.length() == s2.length()) && ((s1 + s1).contains(s2))) {
//
            System.out.println("2 strings r rotation of each other");
        } else {
            System.out.println("not  a rotation");
        }
    }
}

