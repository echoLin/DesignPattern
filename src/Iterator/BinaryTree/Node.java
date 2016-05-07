package Iterator.BinaryTree;

public class Node {
	private String name;
	private Node left;
	private Node right;
	public Node(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
