import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {

	/**
	 * Constructs the object.
	 */
	private Solution() {

	}

	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String synsetsFileName = scan.nextLine();
		String hypernymFileName = scan.nextLine();
		String line = scan.nextLine();
		WordNet wordNet = new WordNet("Files/" + synsetsFileName, 
			"Files/" + hypernymFileName);

		switch(line) {
			case "Graph":
			wordNet.printGraph();
			break;
			case "Queries":
			try {
				while (scan.hasNextLine()) {
					String query = scan.nextLine();
					wordNet.processQuery(query);
				}
			} catch(IllegalArgumentException iaEx) {
				System.out.println(iaEx.getMessage());
			}
			break;
			default:
			break;
		}

	}
}
