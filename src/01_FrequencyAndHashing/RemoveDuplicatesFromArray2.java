package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray2 {

    public static void main(String[] args) {

        int[] a = {20, 10, 30, 20, 10, 40};

        System.out.println("Original array: " + Arrays.toString(a));

        //  LinkedHashSet Syntax - this will create a LinkedHashSet  object in heap mmry, assigned to a refrence variable data of type Set<Integer>
        Set<Integer> s = new LinkedHashSet<>();
        //LinkedHashSet does not allow duplicates and preserves insertion order, the duplicates are removed automatically
        for (int distinct : a) {
            s.add(distinct);
        }

        // Convert Set<Integer> to int[]
        int[] result = s.stream().mapToInt(Integer::intValue).toArray();
//LinkedHashSet uses wrapper class Integer
// Now we are converting it back into primitive and then to array
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}

/*
Set<Integer> s = new LinkedHashSet<>() -  what happens under the hood:
✅ A new LinkedHashSet object is created in heap memory
✅ It’s assigned to a reference variable s of type Set<Integer>
✅ The s object is now ready to store unique integers in insertion order
=============================================================================
| Part                    | Meaning                                                           |
        | ----------------------- | ----------------------------------------------------------------- |
        | `Set<Integer>`          | This is the **interface type** — the **LHS (parent reference)**   |
        | `dataSet`               | This is the **variable name** (you chose this name)               |
        | `new LinkedHashSet<>()` | This is the **object** created — the **RHS (child class object)** |

✅ LHS is the interface → Set (parent)
✅ RHS is the implementing class → LinkedHashSet (child)

🔁 Is this Polymorphism?
YES, this is an example of polymorphism — specifically, interface-based polymorphism (or upcasting).
🔸 You're using a parent reference (Set) to hold a child object (LinkedHashSet).

TAKEAWAY -  this is interface-based polymorphism. I'm using a Set reference to refer to a LinkedHashSet object. This allows me to switch to any other Set implementation easily,
 making the code more flexible and loosely coupled.

 Why is Set<Integer> used and not Set<int>?
 Java collections only work with objects, not primitive types like int, char, double.

==========================================================================================
 All Java Collection classes like Set, List, Queue, Map, etc., follow the same design pattern:

Parent interface/reference (like List, Set, Map) → can refer to any of their implementing child classes.

This is a core Object-Oriented Programming principle in Java — and yes, it’s polymorphism in action.
*/
