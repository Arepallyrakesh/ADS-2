import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {

	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		String[] words = loadWords();
		TST tst = new TST();
		//Your code goes here...
		//System.out.println(Arrays.toString(words));
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < words.length; i++) {
			String[] tokens = new String[words[i].length()];
			for (int j = 0; j < words[i].length(); j++) {
				tokens[j] = words[i].substring(j, words[i].length());
				tst.put(tokens[j], 0);
			}
		}
		System.out.println(tst.keysWithPrefix(str));
	}

	/**
	 * Loads words.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public static String[] loadWords() {
		In in = new In("/Files/dictionary-algs4.txt");
		String[] words = in.readAllStrings();
		return words;
	}
}
