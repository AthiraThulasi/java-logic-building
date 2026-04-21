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
                num[index] = output;
                index++;
            }

for(int i = index; i<=num.length-1;i++){
    num[i] = 0;
}

    Arrays.sort(num,0,index)    ;
            System.out.println("index" + index);
            System.out.println(Arrays.toString(num));
        }


}
}
