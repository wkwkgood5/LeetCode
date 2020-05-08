//暴力法，执行用时:88 ms, 在所有 Java 提交中击败了17.90%的用户。内存消耗:40.3 MB, 在所有 Java 提交中击败了5.06%的用户

public class Solution_force {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j] == target){
                    index[0]=i;
                    index[1]=j;
                }
            }
        }
        return index;
    }
}
