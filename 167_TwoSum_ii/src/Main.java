public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};

        int target_twopoints = 18;
        int[] result_twopoints = new int[2];
        Solution_twopoints solution_force=new Solution_twopoints();
        result_twopoints = solution_force.twoSum(nums, target_twopoints);
        System.out.println("Solution_force: [" + result_twopoints[0]+"," + result_twopoints[1] + "]");

        int target_hashmap = 17;
        int[] result_hashmap = new int[2];
        Solution_hashmap solution_hashmap=new Solution_hashmap();
        result_hashmap = solution_hashmap.twoSum(nums, target_hashmap);
        System.out.println("Solution_hashmap: [" + result_hashmap[0]+"," + result_hashmap[1] + "]");
    }
}
