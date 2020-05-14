//不管数组里面有没有target，只需要看数组内有多少比target小的就行

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]<target){
                res++;
            }
        }
        return res;
    }
}
