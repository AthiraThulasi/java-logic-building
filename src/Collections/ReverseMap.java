package Collections;
import java.util.HashMap;
import java.util.Map;

public class ReverseMap {
    public static void main (String[] args){

        Map<String, Integer> orginalMap = new HashMap<String, Integer>();
        orginalMap.put("A", 1);//put enter values in map
        orginalMap.put("B", 2);
        orginalMap.put("C", 3);

        System.out.println(orginalMap);

        Map<Integer, String> reverseMap = new HashMap<Integer, String>();
        for (Map.Entry<String, Integer> data : orginalMap.entrySet()) {
            reverseMap.put(data.getValue(), data.getKey());
        }

        System.out.println(reverseMap);
    }
}


