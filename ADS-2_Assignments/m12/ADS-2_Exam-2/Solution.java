import java.util.*;
public class Solution {

	Solution(){

	}
	// Time complexity is O(N).
	public static void main(String[] args) {
		// Self loops are not allowed...
		// Parallel Edges are allowed...
		// Take the Graph input here...
		// 
		Scanner sc = new Scanner(System.in);
		int vertices = Integer.parseInt(sc.nextLine());
		int lines = Integer.parseInt(sc.nextLine());
		EdgeWeightedGraph graph = new EdgeWeightedGraph(vertices);
		//EdgeWeightedDigraph egraph = new EdgeWeightedDigraph(vertices);
		for(int i = 0; i < lines; i++) {
			String[] tokens = sc.nextLine().split(" ");
			//egraph.addEdge(new DirectedEdge(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Double.parseDouble(tokens[2])));
			graph.addEdge(new Edge(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2])));
		}
		String caseToGo = sc.nextLine();
		switch (caseToGo) {
		case "Graph":
			//Print the Graph Object.
			System.out.println(graph);
			break;

		case "DirectedPaths":
			// Handle the case of DirectedPaths, where two integers are given.
			// First is the source and second is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			String[] token1 = sc.nextLine().split(" ");
			boolean flag = true;
			
            DijkstraUndirectedSP dsp = new DijkstraUndirectedSP(graph,Integer.parseInt(token1[0]));
            if (dsp.hasPathTo(Integer.parseInt(token1[1]))) {
				System.out.println(dsp.distTo(Integer.parseInt(token1[1])));
			} else {
				System.out.println("No Path Found.");
			}
			break;
			

		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			// tokens = sc.nextLine().split(" ");
			
				System.out.println("No Path Found.");
						
			
			break;

		default:
			break;
		}

	}
}