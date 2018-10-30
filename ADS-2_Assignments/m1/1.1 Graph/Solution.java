import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        switch (type) {
        case "List":
            GraphList lisObj = new GraphList(scan);
            System.out.println(lisObj);
            break;
        case "Matrix":
            GraphMatrix matObj = new GraphMatrix(scan);
            matObj.toString();
            break;
        default :
            break;
        }
    }
}


