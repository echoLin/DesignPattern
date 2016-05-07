package Iterator.LinkedList;

public class BookShelfIterator implements Iterator{
	
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getlength())
			return true;
		return false;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
