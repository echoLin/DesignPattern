package Iterator.BookShelf;

/**
 * 迭代器定义访问和遍历元素的接口
 * @author echo
 * */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
