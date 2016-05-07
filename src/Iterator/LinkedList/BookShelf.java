package Iterator.LinkedList;

public class BookShelf implements Aggregate{
	private Book head;
	private Book tail;
	private int bookNum = 0;

	
	public Book getBookAt(int index){
		if(bookNum == 0 || index > bookNum)
			return null;
		if(index == 0)
			return head;
		Book privote = head;
		for(int i = 1; i<=index; i++){
			if(!privote.hasNextBook())
				return null;
			privote = privote.getNextBook();
		}
		return privote;
	}
	
	public void appendBook(Book book){
		if(bookNum == 0){
			head = book;
			tail = book;
		}else{
			tail.setNextBook(book);
			tail = book;
		}
		bookNum++;
	}
	
	public int getlength(){
		return bookNum;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
