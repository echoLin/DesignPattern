package Iterator.BinaryTree;

public class PostIterator  implements Iterator{

	private BinaryTree tree;
	
	public PostIterator(BinaryTree tree) {
		super();
		this.tree = tree;
	}
	
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

}
