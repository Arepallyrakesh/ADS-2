import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused
    }
    /**
     * main method to read input.
     * Time complexity is O(N)
     * @param args String
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Percolation pcObj = new Percolation(n);
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            pcObj.open(Integer.parseInt(tokens[0]),
                      Integer.parseInt(tokens[1]));
        }
        System.out.println(pcObj.percolates()
                           && pcObj.numberOfOpenSites() != 0);
    }
}
