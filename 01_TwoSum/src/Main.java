public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[]{2, 7, 11, 15};
	    int target = 18;
        int[] result = new int[2];
        Solution_force solution=new Solution_force();
        result = solution.twoSum(nums, target);
	    System.out.println("[" + result[0]+"," + result[1] + "]");
    }
}
