package gfg.greedyprogramming;

import java.util.ArrayList;
import java.util.List;

public class FindingCycleInGraph {

	public static void main(String[] args) {
		Edge e1 = new Edge(0, 1);
		Edge e2 = new Edge(1, 0);
		// Edge e3 = new Edge(2, 1);
		Graph g = new Graph(2, 2);
		g.addEdge(e1, e2);
		System.out.println("Graph is " + (g.hasCycle() ? "Cyclic" : "Non Cyclic"));

	}

	static class Edge {
		int src;
		int dest;

		public Edge(int src, int dest) {
			// TODO Auto-generated constructor stub
			this.src = src;
			this.dest = dest;
		}
	}

	static class Graph {
		int V, E;
		private static List<Edge> lst = new ArrayList<>();
		public Graph(int V, int E) {
			// TODO Auto-generated constructor stub
			this.V = V;
			this.E = E;
		}

		public void addEdge(Edge... e) {
			for (Edge edge : e)
				lst.add(edge);
		}

		public boolean hasCycle() {
			int[] parent = new int[this.V];
			for (int i = 0; i < this.V; i++) {
				parent[i] = -1;
			}
			for (int i = 0; i < lst.size(); i++) {
				int x = find(parent,lst.get(i).src);
				int y = find(parent, lst.get(i).dest);

				if (x == y)
					return true;

				union(parent, x, y);
			}
			return false;

		}

		private void union(int[] parent, int x, int y) {
			parent[x] = y;
		}

		private int find(int[] parent, int i) {
			if (parent[i] == -1)
				return i;
			return find(parent, parent[i]);
		}
	}

}
