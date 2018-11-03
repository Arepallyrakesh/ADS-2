import java.util.Scanner;
class PageRank {
	Digraph d;
	double[] p;
	PageRank(Digraph dg) {
		this.d = dg;
		p = new double[d.V()];
		for (int i = 0; i < p.length; i++) {
			p[i] = 1.0 / d.V();
		}
	}

	double getPr(int v) {
		double pr = p[v];
		int m = 500;
		for(int j = 0; j < m; j++) {
		for (int i: d.adj(v)) {
			pr = pr / d.outdegree(i);
		}
	}
		return pr;
	}
	public String toString() {
		String str = "";
		str += d + "\n";
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
		int vertices = Integer.parseInt(sc.nextLine());
		// iterate count of vertices times
		// to read the adjacency list from std input
		// and build the graph
		Digraph dg = new Digraph(vertices);
		for (int i = 0; i < vertices; i++) {
			String[] s = sc.nextLine().split(" ");
			for (int j = 1; j < s.length; j++) {
				dg.addEdge(Integer.parseInt(s[0]), Integer.parseInt(s[j]));
			}
		}
		// Create page rank object and pass the graph object to the constructor
		PageRank pr = new PageRank(dg);
		// print the page rank object
		System.out.println(pr);

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