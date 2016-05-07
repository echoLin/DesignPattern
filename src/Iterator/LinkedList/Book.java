package Iterator.LinkedList;

/**
 * 根据老师实验要求，采用了单链表的形式，其实不用这么麻烦的，不过实验嘛，重在掌握
 * */
public class Book {
	private String name;
	private Book nextBook;
	
	public Book(){
		super();
	}
	public Book(String name){
		super();
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public Book getNextBook() {
		return nextBook;
	}
	public void setNextBook(Book nextBook) {
		this.nextBook = nextBook;
	}
	public boolean hasNextBook(){
		if(nextBook == null)
			return false;
		return true;
	}
}
