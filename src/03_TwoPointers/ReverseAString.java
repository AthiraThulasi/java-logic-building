package stringprograms;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Athira Beena";
        String rev = new StringBuilder(str).reverse().toString();
// new StringBuilder(str) creates a MUTABLE object from our string
// behaves similar to a character array (nor an array)- [A t h i r a] - just for mental understanding
// Now Java can - Modify characters, Swap positions, Reverse efficiently - which is not possible with String directly
// .toString() - Converts it back to a normal String
        System.out.println(rev);
    }
}

//Why String builder and not String buffer?
// StringBuilder is used as (1) No multithreading involved and (2) We just need fast operation
//StringBuilder is preferred for better performance (String builder is not thread safe - used for single thread)

// String buffer is multithreaded (thread safe) and slower.