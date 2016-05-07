package Iterator.BinaryTree;

public class PreIterator implements Iterator{

	private BinaryTree tree;
	private Node[] stack;
	private int[] turn;
	private int index;
	private boolean end;
	
	public PreIterator(BinaryTree tree) {
		super();
		this.tree = tree;
		if(tree != null){
			stack = new Node[tree.getLength()];
			turn = new int[tree.getLength()];
		}
		end = false;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if(tree == null)
			return false;
		if(!end && turn[index] == 2)
			return true;
		return false;
	}

	@Override
	public Object next() {
		if(index == 0)
			stack[index] = tree.getRoot();
		else if(turn[index] == 0)
			return null;
		return stack[index];
	}

}
