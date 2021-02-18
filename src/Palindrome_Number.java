
public class Palindrome_Number {
	
	public boolean isPalindrome(int x) {
		int xReal = x;
		int ans = 0;
		int rem = 0;
		int quo = 0;
		int temp = 0;
		if(x < 0) return false;
		while(true) {
			temp = ans * 10;
			rem = x % 10;
			if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return false;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return false;
			ans = temp + rem;
			quo = x / 10;
			x = quo;
			if(x == 0) break;
			}
		System.out.println("ans = " + ans);
		System.out.println("x = " + x );
		System.out.println("xReal = " + xReal );
		if(ans == xReal) {
			return true;
		}else {
			return false;
		}		
    }
	
	public static void main(String[] args) {
		Palindrome_Number ans = new Palindrome_Number();
		int x = -121;
		System.out.println(ans.isPalindrome(x));

	}
}
