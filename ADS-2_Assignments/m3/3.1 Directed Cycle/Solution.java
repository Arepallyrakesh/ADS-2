
import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = Integer.parseInt(sc.nextLine());
		Bag bag = new Bag();
		Digraph g = new Digraph(v);
        DirectedCycle finder = new DirectedCycle(g);
	    
	    /*for (int i = 0; i < v; i++) {
        	adj[v] = new Bag<Integer>();
    	}*/
    	int E = Integer.parseInt(sc.nextLine());
        if (E < 0) throw new IllegalArgumentException("number of edges in a Digraph must be nonnegative");
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int w = Integer.parseInt(tokens[1]);
            g.addEdge(a, w); 
        }
        if (finder.hasCycle()) {
            System.out.println("Cycle exists.");
        } else {
            System.out.println("Cycle doesn't exists.");
        }
		
	}
    
}



