import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = new String[n];
		int w = 0;
		LSD lsd = new LSD();
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
			
			w = s[i].length();
		}
		String[]  a = lsd.sort(s, w);
		System.out.println(Arrays.toString(a));
	}
}