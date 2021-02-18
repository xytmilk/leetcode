
public class SearchInsert {

	public int searchInsert(int[] nums, int target) {
	/*	if(target <= nums[0]) {
			System.out.println("0");
			return 0;
		}else if(target > nums[nums.length - 1]) {
			System.out.println(nums.length);
			return nums.length;
		}	
		for(int i = 0 ; i < nums.length - 1 ; i++ ) {
			if(nums[i] < target && target <= nums[i+1]) {
				System.out.println(i + 1);
				return i+1;
			}
		}
		return target;
*/		
		int k=0;
	    
	    while(k<nums.length && nums[k] < target){
	        k++;
	    }
	    System.out.println(k);
	    return k;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {1}; 
		int target = 0;
		
		SearchInsert a = new SearchInsert();
		a.searchInsert(nums, target);

	}

}
