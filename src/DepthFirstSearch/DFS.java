package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	public Stack<Vertex> stack;
	
	public DFS(){
		this.stack=new Stack<>();
	}
	
	public void dfs(List<Vertex> vertexList){
		
		for(Vertex v:vertexList){
			if(!v.isVisited()){
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
		
	}

	private void dfsWithStack(Vertex rootVetex) {

		this.stack.add(rootVetex);
		rootVetex.setVisited(true);
		
		while(!stack.isEmpty()){
			
			Vertex actualVertex=this.stack.pop();
			System.out.println(actualVertex+" ");
			
			for(Vertex v:actualVertex.getNeighbourList()){
				if(!v.isVisited()){
					v.setVisited(true);
					
					this.stack.push(v);
					
				}
			}
			
			
		}
	}

}
