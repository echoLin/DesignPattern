package Iterator.BinaryTree;

public class Main {
	public static void main(String[] args) {
		Node e = new Node("e");
		Node d = new Node("d");
		d.setRight(e);
		Node g = new Node("g");
		Node f = new Node("f");
		f.setLeft(g);
		Node b = new Node("b");
		b.setLeft(d);
		b.setRight(f);
		Node c = new Node("c");
		Node a = new Node("a");
		a.setLeft(b);
		a.setRight(c);
		
		BinaryTree tree = new BinaryTree(a);
		Iterator iterator= tree.iterator(BinaryTree.PreIteratorType);
		System.out.println("preIterator");
		while(iterator.hasNext()){
			Node node = (Node)iterator.next();
			System.out.println(node.getName());
		}
		System.out.println();
		
		
		iterator = tree.iterator(BinaryTree.MidIteratorType);
		System.out.println("midIterator");
		while(iterator.hasNext()){
			Node node = (Node)iterator.next();
			System.out.println(node.getName());
		}
		System.out.println();
		
		
		iterator = tree.iterator(BinaryTree.PostIteratorType);
		System.out.println("postIterator");
		while(iterator.hasNext()){
			Node node = (Node)iterator.next();
			System.out.println(node.getName());
		}
		System.out.println();
		
	}
}
