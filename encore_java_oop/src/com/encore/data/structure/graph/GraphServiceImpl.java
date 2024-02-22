package com.encore.data.structure.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.encore.hms.domain.sup.Person;

public class GraphServiceImpl {

	public GraphServiceImpl() {
		
	}
	
	public GraphNode makeNode(int data) {
		GraphNode node = new GraphNode(data);
		
		return node;
	}
	
	public void makeEdge(GraphNode start, GraphNode end) {
		start.getCorLst().add(end);
	}
	
	// 재귀호출이 필요
	// Iterator 반복구문 필요
	// 방문 체크 필요
	public void dfs(GraphNode node) {
		System.out.print(node.getData() + " ");
		node.setVisited(true);
		// List<GraphNode> lst = node.getCorLst();  -> for loop 사용
		
		// iterator 사용
		Iterator<GraphNode> iter = node.getCorLst().iterator();
		while(iter.hasNext()) {
			GraphNode data = iter.next();
			if(data.isVisited() == false) {
				dfs(data);
			}
		}
	}
	
	public void bfs(int[][] ary, boolean[] visit) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// 데이터이면서 2차원배열의 행의 인덱스
		queue.offer(1);
		visit[1] = true;
		
		while(!queue.isEmpty()){
			int row_data = queue.poll();
			System.out.print(row_data + " ");
			for(int idx=0; idx<ary[row_data].length; idx++) {
				int temp = ary[row_data][idx];
				if(!visit[temp]) {
					queue.offer(temp);
					visit[temp] = true;
				}
			}
		}
	}
	
	public void bfs(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		
			queue.offer(node);
			boolean [] visit = new boolean[9] ;
			visit[node.getData()] = true ; 
		
			while(!queue.isEmpty()) {
				GraphNode g = queue.poll();
				System.out.print(g.getData() + " ") ; 
				for(int idx = 0 ; idx < g.getCorLst().size() ; idx ++) {
			// 데이터이지만 인덱스로 사용
					GraphNode data = g.getCorLst().get(idx) ; 
					if( !visit[data.getData()] ) {
						visit[data.getData()] = true ; 
						queue.offer(data);
					}
				}
			}
		}

}