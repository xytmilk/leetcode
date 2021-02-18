public class Solution_two_sum {
	public int[] twoSum(int[] sums, int target) {
		int[] solution = new int[2];
		for(int i = 0 ; i < (sums.length - 1) ; i++ ) {
			for(int j = sums.length -1 ; j > i ; j --) {
				if(sums[i] + sums[j] == target) {
					solution[0] = i;
					solution[1] = j;
				}
			}
	}
		
		System.out.println("[" + solution[0] + "," + solution[1] + "]");
		return solution;
}
	public static void main(String[] args) {
		Solution_two_sum ans = new Solution_two_sum();
		int[] nums = {3,2,4};
		int target = 6;
		ans.twoSum(nums, target);
	}
}



