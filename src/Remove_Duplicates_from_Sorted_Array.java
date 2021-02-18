import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
		int ans = 1;
		System.out.println("nums[0] = " + nums [0]);
		for(int i = 1; i < nums.length ; i++) {
			if(nums[i] != nums[i - 1]) {
				ans = ans + 1;
				nums[ans-1] = nums [i];
				System.out.println("nums[ans-1] = " + nums [ans-1]);
			}
		}
//nums[i]    ;  nums[i-1]  ; ans = 1 ; nums[ans-1]  nums[i] 
//nums[1] = 0;  nums[0] = 0; ans = 1 ; 
//nums[2] = 1;  nums[1] = 0; ans = 2 ; nums[1] = nums[1] = 1
//nums[3] = 1;  nums[2] = 1; ans = 2 ; 
//nums[4] = 1;  nums[3] = 1; ans = 2 ; 		
//nums[5] = 2;  nums[4] = 1; ans = 3 ; nums[2] = nums[4] = 2
//nums[6] = 2;  nums[5] = 2; ans = 3 ; 
//nums[7] = 3;  nums[6] = 2; ans = 4 ; nums[3] = nums[6] = 3
//nums[8] = 3;  nums[7] = 3; ans = 4 ; 
//nums[9] = 4;  nums[8] = 3; ans = 5 ; nums[4] = nums[8] = 4
		System.out.println(ans);
		return ans;
    }
	
	public static void main (String[] Args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Remove_Duplicates_from_Sorted_Array put = new Remove_Duplicates_from_Sorted_Array();
		put.removeDuplicates(nums);
	}
}
