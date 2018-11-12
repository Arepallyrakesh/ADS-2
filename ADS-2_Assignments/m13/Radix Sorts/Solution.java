import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int w = 0;
		LSD lsd = new LSD();
		for (int i = 0; i <= n; i++) {
			s[i] = sc.nextLine();
			System.out.println(s[i]);
			w = s[i].length();
		}
		//String[]  a = lsd.sort(s, w);
		System.out.println(Arrays.toString(s));
	}
}