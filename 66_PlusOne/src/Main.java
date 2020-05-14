public class Main {

    public static void main(String[] args) {
	    int[] digits= new int[]{9,9,9,9,9};
	    Solution solution = new Solution();
	    int[] res = solution.plusOne(digits);
	    for (int i=0; i<res.length; i++){
			System.out.println(res[i]);
		}
    }
}
