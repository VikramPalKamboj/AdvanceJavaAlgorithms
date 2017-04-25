package dfs.topological.order;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	public String data;
	public boolean visited;
	public List<Vertex> neighbourList;
	
	
	public Vertex(String data){
		this.data=data;
		this.neighbourList=new ArrayList<>();
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public boolean isVisited() {
		return visited;
	}


	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	
	
	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}


	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}


	public String toString(){
		return this.data;
		
	}
	
	public void addNeighbour(Vertex vertex){
		
		this.neighbourList.add(vertex);
	}
	
	

}
