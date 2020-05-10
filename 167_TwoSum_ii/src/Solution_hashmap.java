import java.util.HashMap;
public class Solution_hashmap {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers==null || numbers.length<=1){
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<numbers.length; i++){
            int number= numbers[i];
            int value= target- number;
            if (map.containsKey(value)){
                res[1]=i+1;
                res[0]=map.get(value)+1;
            }
            else{
                map.put(number,i);
            }
        }
        return res;
    }
}
