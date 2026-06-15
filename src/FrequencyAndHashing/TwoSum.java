package FrequencyAndHashing;

import java.util.HashMap;

public class TwoSum {

    // Two sum means - Find the indices of  2 numbers in the i/p array that adds to  Target number

    public class CalculateTwoSum {
        public static void main(String[] args) {

            int[] a = {2, 11, 4, 5};
            int target = 9; // 4 + 5 gives target as 9, so o/p is going to be the index of 4 & 5 which is (2,3)
            int [] result = calculateTwoSum(a,target);//Method call - giving java actual inputs
            System.out.println(result[0]+" , " + result[1]);
        }

        private static int[] calculateTwoSum(int[] a, int target) {//Method definition - parameters with data types
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();// create a new hashmap with key as Integer and value as index(Integer)
            //key(number) and index are stored in 2 columns. each key(num) corresponds to its index(value)
            // Which number have I already stored as element in key ? and At which index?
            for(int i = 0;i <a.length;i++){
                int compliment = target - a[i];// find the compliment
                if(map.containsKey(compliment)){ //✅ If compliment is found in the map : simply return the pair of indices
                    int result[] = {map.get(compliment),i};// // ✅ If complement is already in map → we found a match!
                    //map.get(compliment) means "get the index of the number that complements the current number."
                    return result;//If you find it → ✅ Return it immediately
                }
                map.put(a[i],i);// // ✅ If compliment is not found → add current element & index to map,  for future reference.
            }
            return null;//If you never find it → ❌ You still need to return something (like null) to indicate "no answer"
        }
    }
//HashMap makes that lookup super fast — O(1) time.

}
