package Iterator.BookShelf;

/**
 * 具体迭代器实现迭代器接口
 * 对该聚合遍历时跟踪当前位置
 * @author echo
 * */
public class BookShelfIterator implements Iterator{
	private BookShelf bookshelf;
	private int index;
	public BookShelfIterator(BookShelf bookshelf){
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if(index < bookshelf.getLenth())
			return true;
		else
			return false;
	}
	@Override
	public Object next() {
		Book book = bookshelf.getBook(index);
		index++;
		return book;
	}
	
}
