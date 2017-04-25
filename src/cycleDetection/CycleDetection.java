package cycleDetection;

import java.util.List;

public class CycleDetection {
	
	public void cycleDetection(List<Vertex> vertexList){
		
		//System.out.println(vertexList);
		for(Vertex v:vertexList){
			if(!v.isVisited()){
				
				dfs(v);
				
			}
		
		}
		
		
	}

	private void dfs(Vertex vertex) {
		
		//System.out.println(vertex);

		vertex.setBeingVisited(true);
		
		for(Vertex v:vertex.getAdjacenciesList()){
			if(v.isBeingVisited()){
				//System.out.println(v+"Vertex is being visited");
				
			}
			if(!v.isVisited()){
				v.setVisited(true);
				System.out.println(v+"Vertex is  visited");
				dfs(v);
	
			}
		}
		// I did not understand why setBeingvisited is false, It should true in my opinion.
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}
	

}
