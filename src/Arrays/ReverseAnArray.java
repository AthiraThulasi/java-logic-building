package Arrays;

//Two pointer Approach - Left (o Index) & Right ( last Index)

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        int left = 0;
        int right = input.length - 1;
        int temp;

        System.out.print("Original Array: ");
        for (int number: input){
            System.out.print(number + " ");
        }

        System.out.println();//  First o/p(Original Array) to move to the next line

        while (  left < right ) { // or (right > left)// checking index
            temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            right--;
            left++;
        }

        System.out.print("Reversed Array: ");
        for (int number: input){ // display the final reversed array
            System.out.print( number + " ");
        }
    }}

//Logic : Used Two pointer Approach
//1. One pointer at the beginning and one at the end.
//2. Swap the elements at left and right.
//3. Move left forward and right backward.
//4. Repeat until left >= right.
//✅ 1st iteration (left = 0, right = 4):
//✅ 2nd iteration (left = 1, right = 3):
//🛑 Stop condition (left = 2, right = 2):
//left >= right → middle of array reached
//Loop exits.