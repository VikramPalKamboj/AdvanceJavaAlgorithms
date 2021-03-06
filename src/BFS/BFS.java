package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex root){
		// Because for BFS, we FIFO operations
		Queue<Vertex> queue=new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Vertex actualVertex=queue.remove();
			System.out.println(actualVertex+" ");
			
			for(Vertex v:actualVertex.getNeighourList()){
				v.setVisited(true);
				queue.add(v);
				
				
			}
			
		}
	}
	
}
