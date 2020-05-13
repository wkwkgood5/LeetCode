//双指针
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null){
            return 0;
        }

        int count = 0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if (nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1]=nums[j];
                i++;
                count++;
            }
        }
        return count+1;
    }
}

// 0 0 1 1 1 2 2 3 3 4
// i j
// 0 0 1 1 1 2 2 3 3 4
// i   j
// 0 1 1 1 1 2 2 3 3 4
//   i j
// 0 1 1 1 1 2 2 3 3 4
//   i       j
// 0 1 2 1 1 2 2 3 3 4
//   i       j
// 0 1 2 1 1 2 2 3 3 4
//     i     j
