//二分查找，两个指针一头一尾，当指针处值相加大于target时，大指针--；小于target时，小指针++

public class Solution_twopoints {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers==null || numbers.length<=1){
            return res;
        }

        int start= 0;
        int end= numbers.length-1;
        for (int i=0; i< numbers.length; i++){
            if (numbers[start]+numbers[end] == target){
                res[0]=start+1;
                res[1]=end+1;
            }
            else if(numbers[start]+numbers[end] < target){
                start++;
            }
            else if(numbers[start]+numbers[end] > target){
                end--;
            }
        }
        return res;
    }
}
