
import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = Integer.parseInt(sc.nextLine());
    	int E = Integer.parseInt(sc.nextLine());
		
		Digraph g = new Digraph(v);
	    
        
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int w = Integer.parseInt(tokens[1]);
            g.addEdge(a, w); 
        }
        DirectedCycle finder = new DirectedCycle(g);
        if (finder.hasCycle()) {
            System.out.println("Cycle exists.");
        } else {
            System.out.println("Cycle doesn't exists.");
        }
		
	}
    
}



