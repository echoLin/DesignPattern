package Iterator.BinaryTree;

public class PostIterator  implements Iterator{

	private BinaryTree tree;
	private Node[] stack;
	private int[] turn;
	private int index;
	
	
	public PostIterator(BinaryTree tree) {
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
			while(turn[index] == 0){
				if(stack[index].getLeft() != null){
					turn[index] = 1;
					stack[index+1] = stack[index].getLeft();
					turn[index+1] = 0;
					index++;
				}else{
					turn[index] = 1;
				}
			}
			while(turn[index] == 1){
				if(stack[index].getRight() != null){
					turn[index] = 2;
					stack[index+1] = stack[index].getRight();
					turn[index+1] = 0;
					index++;
				}else{
					turn[index] = 2;
				}
			}
			if(turn[index] == 2 && stack[index] != null){
				node = stack[index];
				turn[index] = 3;
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
			}
		}
		return node;
	}

}
