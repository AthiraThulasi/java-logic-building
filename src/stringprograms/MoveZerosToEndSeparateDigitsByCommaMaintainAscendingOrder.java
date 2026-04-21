// Move zeros to the right, separate numbers with comma, and keep nums in order


package stringprograms;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MoveZerosToEndSeparateDigitsByCommaMaintainAscendingOrder {

    public static void main(String[] args) {

        int[] num = {1, 3, 0, 4, 5, 0, 2, 0};
// Logic - Two pointer with overwrite + sort
        // Every time it finds a non-zero, it writes it at the position indicated by index and then increments index.
        int index = 0;
        for(int output : num){
            if (output!=0){
                num[index] = output; // if num!= 0, overwrite with the same number
                index++;
            }
// The above logic does NOT remove old values at the back, It moves non-zero elements to the front.
// After placing all non-zero elements at the front,fill the remaining positions with zeros
for(int i = index; i<=num.length-1;i++){
    num[i] = 0; //Used a pointer to track the end of valid non-zero elements.
               // Everything beyond that position is overwritten with zeros
}

    Arrays.sort(num,0,index)    ;
            System.out.println("index" + index);
            System.out.println(Arrays.toString(num));
        }


}
}
