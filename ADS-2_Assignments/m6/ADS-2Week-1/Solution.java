import java.util.Scanner;
class PageRank {
	Digraph d;
	double[] p;
	PageRank(Digraph graph) {
		this.d = graph;
		p = new double[d.V()];
		for (int i = 0; i < p.length; i++) {
			p[i] = 1.0 / d.V();
		}
	}
	double getPr(int v) {
		double pr = p[v];
		int m = Integer.MAX_VALUE;
		for(int j = 0; j < m; j++) {
		for (int i: d.adj(v)) {
			pr = pr / d.outdegree(i);
		}
	}
		return pr;
	}
	public String toString() {
		String str = "";
		str += d;
		for (int i = 0; i < d.V(); i++) {
			str += i + " - " + getPr(i) + "\n";
		}
		return str;
	}

}

class WebSearch {

}


public class Solution {
	public static void main(String[] args) {
		// read the first line of the input to get the number of vertices
		Scanner sc = new Scanner(System.in);
		int ver = Integer.parseInt(sc.nextLine());
		// iterate count of vertices times
		// to read the adjacency list from std input
		// and build the graph
		Digraph graph = new Digraph(ver);
		for (int i = 0; i < ver; i++) {
			String[] s = sc.nextLine().split(" ");
			for (int j = 1; j < s.length; j++) {
				graph.addEdge(Integer.parseInt(s[0]), Integer.parseInt(s[j]));
			}
		}
		// Create page rank object and pass the graph object to the constructor
		PageRank pr = new PageRank(graph);
		// print the page rank object
		
		System.out.println(graph);

		// This part is only for the final test case

		// File path to the web content
		String file = "WebContent.txt";

		// instantiate web search object
		// and pass the page rank object and the file path to the constructor

		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky

	}
}