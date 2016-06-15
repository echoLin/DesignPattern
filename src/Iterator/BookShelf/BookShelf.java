package Iterator.BookShelf;

/**
 * 具体聚合实现创建相应迭代器的接口，该操作返回一个具体迭代器的实例
 * @author echo
 * */
public class BookShelf implements Aggregate{
	private Book books[];
	private int last = 0;
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	public Book getBook(int index){
		return books[index];
	}
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	public int getLenth(){
		return last;
	}
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
