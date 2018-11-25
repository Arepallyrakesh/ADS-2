import java.util.*;
public class MoveToFront {

    public static void encode() {
    	/*String s = BinaryStdIn.readString();*/
    	String s = "ABRACAD";
        char[] input = s.toCharArray();

        // Store the list of chars.
        ArrayList<Character> arr = new ArrayList<Character>();
        for (char i = 0; i < 256; i++)
            arr.add(i);
        // Check whether the char is in the list.
        for (int i = 0; i < input.length; i++) {
            int idx = arr.indexOf((int) input[i]);
            BinaryStdOut.write((char) idx, 8);
            char obj = arr.remove(idx);
            arr.add(0, obj);
        }

        BinaryStdOut.close();

    }

    public static void decode() {
    	 //String s = BinaryStdIn.readString();
    	String s = "ABRACADABRA";
        char[] input = s.toCharArray();

        ArrayList<Character> arr = new ArrayList<Character>();
        for (char i = 0; i < 256; i++)
            arr.add(i);

        for (int i = 0; i < input.length; i++) {
            char obj = arr.remove((char) input[i]);
            arr.add(0, obj);
            BinaryStdOut.write((char) obj, 8);
        }

        // Total, worst, R*N, Best, N
        BinaryStdOut.close();

    }

    public static void main(String[] args) {
    	  if      (args[0].equals("-")) encode();
        else if (args[0].equals("+")) decode();

    }
}
