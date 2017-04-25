package cycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	public String name;
	public boolean Visited;
	public boolean BeingVisited;
	private List<Vertex> adjacenciesList;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public boolean isVisited() {
		return Visited;
	}

	public void setVisited(boolean visited) {
		Visited = visited;
	}

	public boolean isBeingVisited() {
		return BeingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		BeingVisited = beingVisited;
	}

	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Vertex> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}

	
	
	
	public Vertex(String name){
		this.name=name;
		this.adjacenciesList=new ArrayList<>();
	}

	@Override 
	public String toString(){
		
		return this.name;
	}
	
	public void addNeighbour(Vertex vertex){
		this.adjacenciesList.add(vertex);
	}
}
