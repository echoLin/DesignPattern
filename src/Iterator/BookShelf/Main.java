package Iterator.BookShelf;

public class Main {

	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf(6);
		bookshelf.appendBook(new Book("BookOne"));
		bookshelf.appendBook(new Book("BookTwo"));
		bookshelf.appendBook(new Book("BookThree"));
		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}
