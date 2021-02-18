
public class RemoveElement {
	
	public int removeElement(int[] nums, int val) {
		
		int numsLength = nums.length;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == val)
				numsLength -= 1;
			
		}
		
		for(int i = 0 ; i < numsLength  ; i++) {
				if(nums[i] == val) {
					for(int j = nums.length - 1; j >= 0; j--) {
						if(nums[j] != val) {
							nums[i] = nums[j];
							nums[j] = val;
							break;
						}
					}
				}
		}
		System.out.println("numsLength = " + numsLength);
		for(int xx : nums)
			System.out.println(xx);
		
		
		return 1;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {3,2,2,3}; 
		int val = 3;
		RemoveElement a = new RemoveElement();
		a.removeElement(nums, val);
		

	}
}