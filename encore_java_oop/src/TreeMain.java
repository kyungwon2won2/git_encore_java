import com.encore.data.structure.tree.TreeNode;
import com.encore.data.structure.tree.TreeServiceImpl;

public class TreeMain {

	public static void main(String[] args) {
		
		TreeServiceImpl service = new TreeServiceImpl();
		
//		TreeNode node50 = service.makeTree(50, null, null);
//		TreeNode node60 = service.makeTree(60, null, null);
//		TreeNode node55 = service.makeTree(55, node50, node60);
//		TreeNode node70 = service.makeTree(70, null, null);
//		TreeNode node65 = service.makeTree(65, node55, node70);
		
//		System.out.println("데이터가 55인 노드의 left 데이터를 확인 --> " + node55.getLeftNode().getData());
//		System.out.println("데이터가 55인 노드의 left 데이터를 확인 --> " + node55.getRightNode().getData());
		
		// NullPointerException 발생
		// why? -> 주소값을 가지고있지 않는데 메서드 호출이 발생되어서
//		System.out.println("데이터가 50인 노드의 left 데이터를 확인 --> " + node50.getLeftNode().getData());
//		System.out.println("데이터가 50인 노드의 left 데이터를 확인 --> " + node50.getRightNode().getData());
		
		// 실습 : 0~11
		TreeNode node7 = service.makeTree(7, null, null);
		TreeNode node8 = service.makeTree(8, null, null);
		TreeNode node9 = service.makeTree(9, null, null);
		TreeNode node10 = service.makeTree(10, null, null);
		TreeNode node11 = service.makeTree(11, null, null);
		TreeNode node6 = service.makeTree(6, null, null);
		TreeNode node3 = service.makeTree(3, node7, node8);
		TreeNode node4 = service.makeTree(4, node9, node10);
		TreeNode node1 = service.makeTree(1, node3, node4);
		TreeNode node5 = service.makeTree(5, node11, null);
		TreeNode node2 = service.makeTree(2, node5, node6);
		TreeNode node0 = service.makeTree(0, node1, node2);
		
		System.out.println(">>>> preOrder ");
//		service.preOrder(node65);
		service.preOrder(node0);
		System.out.println();
		System.out.println(">>>> inOrder ");
//		service.inOrder(node65);
		service.inOrder(node0);
		System.out.println();
		System.out.println(">>>> postOrder ");
//		service.postOrder(node65);
		service.postOrder(node0);
	}

}
