public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution_force solution_force=new Solution_force();
        int res_force = solution_force.maxSubArray(nums);
        System.out.println(res_force);
    }
}
