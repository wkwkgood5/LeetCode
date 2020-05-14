public class Main {

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        Solution solution=new Solution();
        int res = solution.searchInsert(nums,7);
        System.out.println(res);
        res = solution.searchInsert(nums,5);
        System.out.println(res);
        res = solution.searchInsert(nums,0);
        System.out.println(res);
        res = solution.searchInsert(nums,2);
        System.out.println(res);
    }
}
