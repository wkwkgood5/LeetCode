//-2 1 -3 4 -1 2 1 -5 4
// i j                  -1
//-2 1 -3 4 -1 2 1 -5 4
// i    j               -4
//-2 1 -3 4 -1 2 1 -5 4
// i      j             0
public class Solution_force {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int res = Integer.MIN_VALUE;   //因为有可能最后结果最大值是负的，若是设置0，那最后就会返回0
        for (int i = 0; i<nums.length; i++){
            int temp = nums[i];
            if (res<temp){     //有可能到最后一个了，j已经没有办法循环了，还没找到最大，比如nums[-2,1]
                res = temp;
            }
            for (int j=i+1; j<nums.length; j++){
                temp = temp + nums[j];
                if(res<temp){
                    res = temp;
                }
            }
        }
        return res;
    }
}
