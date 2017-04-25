package dfs.topological.order;

import java.util.Stack;

public class DFS {
	
	public Stack<Vertex> stack;
	
	public DFS(){
		this.stack=new Stack<>();
	}
	
	public void dfs(Vertex vertex){
		vertex.setVisited(true);
		
		for(Vertex v:vertex.getNeighbourList()){
			
			if(!v.isVisited()){
				dfs(v);
				
			}
			stack.push(v);
			
		}
		
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
		
	}
	

}
