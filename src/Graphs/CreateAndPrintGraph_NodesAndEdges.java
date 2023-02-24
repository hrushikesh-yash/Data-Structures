package Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CreateAndPrintGraph_NodesAndEdges {

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void createNode(ArrayList<ArrayList<Integer>> graph, int startPoint, int endPoint) {
		graph.get(startPoint).add(endPoint);
		graph.get(endPoint).add(startPoint);
	}

	public static void main(String[] args) {
		int vertex = 5;
		System.out.println("Hello");
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(vertex);

		for (int i = 0; i < vertex; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		createNode(graph, 0, 1);
		createNode(graph, 0, 4);
		createNode(graph, 1, 2);
		createNode(graph, 1, 3);
		createNode(graph, 1, 4);
		createNode(graph, 2, 3);
		createNode(graph, 3, 4);

		printGraph(graph);
		
		System.out.println("BFS is ");
		bfs(vertex,graph).stream().forEach(v -> System.out.println(v));

	}

	private static ArrayList<Integer> bfs(int vertex,ArrayList<ArrayList<Integer>> graph) {
		ArrayList<Integer> bfs= new ArrayList<>();
		boolean visited[] = new boolean[vertex];
		Queue<Integer> queue= new LinkedList<>();
		
		queue.add(0);
		visited[0]=true;
		
		while(!queue.isEmpty())
		{
			Integer node=queue.poll();
			bfs.add(node);
			
			
			for (Integer integer : graph.get(node)) {
				if(visited[integer]== false)
				{
					visited[integer]=true;
					queue.add(integer);
				}
				
			}
		}
	
		return bfs;
	}

	private static void printGraph(ArrayList<ArrayList<Integer>> graph) {
		
		//graph.stream().flatMap(null);
		
		for (int i = 0; i < graph.size(); i++) 
		{
			for (int j = 0; j < graph.get(i).size(); j++) 
			{	
				System.out.println("Node from "+i+" to "+graph.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
	}

}
