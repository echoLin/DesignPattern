package Iterator.BinaryTree;

public class BinaryTree implements Aggregate{
	private Node root;
	public final static int PreIteratorType = 1;
	public final static int MidIteratorType = 2;
	public final static int PostIteratorType = 3;
	public BinaryTree(Node root){
		this.root = root;
	}
	public Node getRoot() {
		return root;
	}
	public int getLength(){
		return count(root);
	}
	private int count(Node node){
		int count = 0;
		if(node == null)
			return count;
		if(node != null)
			count += 1;
		if(node.getLeft() != null)
			count += count(node.getLeft());
		if(node.getRight() != null)
			count += count(node.getRight());
		return count;
	}

	@Override
	public Iterator iterator(int type) {
		if(type == PreIteratorType)
			return new PreIterator(this);
		if(type == MidIteratorType)
			return new MidIterator(this);
		if(type == PostIteratorType)
			return new PostIterator(this);
		return null;
	}
}
