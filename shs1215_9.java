package shs;

public class shs1215_9 {

	public static void main(String[] args) {
		
		boolean ans;
		
		ans = 10 > 7 & 15 < 30;//참 참
		System.out.println(ans);
		ans = 10 > 7 && 15 < 30;//참 참
		System.out.println(ans);
		
		ans = 10 > 7 | 15 > 30;//참 거짓
		System.out.println(ans);
		ans = 10 < 7 || 15 < 30;//거짓 참
		System.out.println(ans);
		
		ans = 10 > 7 ^ 15 < 30;//참 참
		System.out.println(ans);
		ans = 10 < 7 ^ 15 < 30;//거짓 참
		System.out.println(ans);
	}
}//연산자