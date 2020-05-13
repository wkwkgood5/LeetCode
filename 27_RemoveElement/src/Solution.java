//双指针，一个指针计数，一个指针循环
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int count = 0;
        int i = 0;
        for (int j=0; j<nums.length; j++){
            if (nums[j] != val){
                nums[i]=nums[j];
                count ++;
                i ++;
            }
        }
        return count;
    }
}

// 0 1 2 2 3 0 4 2
// i               1
// j
// 0 1 2 2 3 0 4 0
//   i             2
//   j
// 0 1 2 2 3 0 4 2
//     i           3
//     j
// 0 1 2 2 3 0 4 2
//     i
//         j
// 0 1 3 2 3 0 4 2
//       i         4
//         j
// 0 1 3 2 3 0 4 2
//       i
//           j
//一旦遇到不等于val的，就把这个值给nums[i]
