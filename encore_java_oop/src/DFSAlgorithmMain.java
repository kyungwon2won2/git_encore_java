// 알고리즘 - DFS

import java.util.ArrayList;
import java.util.List;

public class DFSAlgorithmMain {

	// 리스트 중첩
	public static List<List<Integer>> graph = new ArrayList<List<Integer>>();
	public static boolean[] visited = new boolean[9]; // 방문 기록 - 인덱스 0 제외
	
	public static void main(String[] args) {
		// 요소를 담을 수 있는 리스트 생성(사이즈 만큼)
		for(int i=0; i<visited.length; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 1번 노드에 연결된 연결정보
		graph.get(1).add(2); graph.get(1).add(3); graph.get(1).add(8);
		graph.get(2).add(1); graph.get(2).add(7);
		graph.get(3).add(1); graph.get(3).add(4); graph.get(3).add(5);
		graph.get(4).add(3); graph.get(4).add(5);
		graph.get(5).add(3); graph.get(5).add(4);
		graph.get(6).add(7);
		graph.get(7).add(2); graph.get(7).add(6); graph.get(7).add(8);
		graph.get(8).add(1);graph.get(8).add(7);
		
		dfs(1);
		
	}
	
	public static void dfs(int start) {
		System.out.print(start + " ");
		visited[start] = true;
		
		for(int node : graph.get(start)) {
			if(!visited[node]) {
				dfs(node);
			}
		}
	}

}
