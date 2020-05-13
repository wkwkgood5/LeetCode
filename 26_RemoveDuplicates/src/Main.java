public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
	    Solution solution = new Solution();
	    int count = solution.removeDuplicates(nums);
	    for (int i=0; i<count; i++){
	        System.out.println(nums[i]);
        }
    }
}
