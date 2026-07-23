package Arrays.BasicPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,20,10};

        Set<Integer> set = new LinkedHashSet<>();
        for(int num :arr) { // Java automatically converts the primitive int into an Integer object using a feature called autoboxing
            set.add(num);     // java introduced this feature in java5
        }

        System.out.println("Without Duplicates: " + set);
            }
        }

