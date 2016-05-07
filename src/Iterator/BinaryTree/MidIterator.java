package Iterator.BinaryTree;

public class MidIterator implements Iterator{
	private BinaryTree tree;
	
	public MidIterator(BinaryTree tree) {
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
