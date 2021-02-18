
public class Reverse_Integer {
	public int reverse(int x) {
		int ans = 0;
		int quo = 0;
		int rem = 0;
		int temp = 0;
		while(x != 0) {
			temp = ans * 10;
			System.out.println("temp = " + temp);
			rem = x % 10;
			System.out.println("rem = " + rem);
			if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
			ans = temp + rem;
			System.out.println("ans = " + ans);
			quo = x / 10;
			System.out.println("temp = " + quo);
			x = quo;
			System.out.println("x = " + x);
			System.out.println("========next======= ");
		}
		
		return ans;
		}
		
	
		
  
	
	public static void main(String[] args) {
		int x = 2147483412; //2147483647 -2147483648 
		Reverse_Integer ans = new Reverse_Integer();
		System.out.println(ans.reverse(x));
	}

}
