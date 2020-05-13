public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        Solution solution = new Solution();
        int count = solution.removeElement(nums, 2);
        for (int i=0; i<count; i++){
            System.out.println(nums[i]);
        }
    }
}
