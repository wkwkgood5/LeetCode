//思想：利用hashmap，只遍历一遍，根据遍历值，去hashmap里寻找与之匹配的值，若有，返回各自的key，若没有，将此遍历值放入hashmap中

import java.util.HashMap;

public class Solution_hashmap {
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        if (nums == null || nums.length<=1){
            return res;
        }

        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();//创建hashmap，内部为空元素
        for (int i=0; i<nums.length; i++){
            int num = nums[i];
            int value = target-num;
            if (map.containsKey(value)){
                res[1]=i;
                res[0]=map.get(value);
            }
            else {
                map.put(num, i);
            }

        }
        return res;
    }
}
