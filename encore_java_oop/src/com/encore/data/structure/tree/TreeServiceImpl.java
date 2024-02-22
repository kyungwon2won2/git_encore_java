package com.encore.data.structure.tree;

public class TreeServiceImpl {
	
	public TreeServiceImpl() {
			
	}
	
	public TreeNode makeTree(int data, TreeNode leftNode, TreeNode rightNode) {
		//선언방법1
		//TreeNode node = new TreeNode(data, leftNode, rightNode);
		
		//선언방법2
		TreeNode node = new TreeNode(data);
		node.setLeftNode(leftNode);
		node.setRightNode(rightNode);
		
		return node;
	}
	
	// 전위 순회( 뿌리 -> 왼쪽자식 -> 오른쪽자식 ) 
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.getData() + " ");
			preOrder(node.getLeftNode());
			preOrder(node.getRightNode());
		}
	}
	
	// 중위 순회( 왼쪽자식 -> 뿌리 -> 오른쪽자식 ) 
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.getLeftNode());
			System.out.print(node.getData() + " ");
			inOrder(node.getRightNode());
		}
	}
	
	// 후위 순회( 왼쪽자식 -> 오른쪽자식 -> 뿌리 ) 
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.getLeftNode());
			postOrder(node.getRightNode());
			System.out.print(node.getData() + " ");
		}
	}
}
