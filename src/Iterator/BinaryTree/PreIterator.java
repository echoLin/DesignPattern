package Iterator.BinaryTree;

public class PreIterator implements Iterator{

	private BinaryTree tree;
	private Node[] stack;
	private int[] turn;
	private int index;
	
	public PreIterator(BinaryTree tree) {
		super();
		this.tree = tree;
		if(tree != null){
			stack = new Node[tree.getLength()];
			turn = new int[tree.getLength()];
		}
		index = 0;
		stack[index] = tree.getRoot();
	}

	@Override
	public boolean hasNext() {
		if(tree == null)
			return false;
		if(index < 0)
			return false;
		return true;
	}

	@Override
	public Object next() {
		Node node = null;
		while(index >= 0 && node == null){
			if(turn[index] == 0 && stack[index] != null){
				node = stack[index];
				turn[index] = 1;
				boolean flag = true;
				while(index >=0 && flag){
					if(turn[index] == 1 && stack[index].getLeft() == null && stack[index].getRight() == null)
						index--;
					else if(turn[index] == 2 && stack[index].getRight() == null)
						index--;
					else if(turn[index] == 3)
						index--;
					else
						flag = false;
					continue;
				}
			}else{
				if(turn[index] == 1){
					if(stack[index].getLeft() != null){
						stack[index+1] = stack[index].getLeft();
						turn[index+1] = 0;
						turn[index] = 2;
						index++;
					}else{
						turn[index] = 2;
					}
				}else if(turn[index] == 2){
					if(stack[index].getRight() != null){
						stack[index+1] = stack[index].getRight();
						turn[index+1] = 0;
						turn[index] = 3;
						index++;
					}else
						turn[index] = 3;
				}
			}
		}
		return node;
	}

}
