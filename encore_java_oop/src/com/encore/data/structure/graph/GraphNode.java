package com.encore.data.structure.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	
	private int data;
	private boolean visited;
	private List<GraphNode> corLst; // 인접 인덱스
	
	public GraphNode() {
		
	}
	
	public GraphNode(int data) {
		this.data = data;
		this.visited = false;
		corLst = new ArrayList<GraphNode>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<GraphNode> getCorLst() {
		return corLst;
	}

	public void setCorLst(List<GraphNode> corLst) {
		this.corLst = corLst;
	}
	
	
}
