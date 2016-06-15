package Iterator.BookShelf;

/**
 * aggregate 聚合
 * 聚合定义创建相应迭代器对象的接口
 * @author echo*/
public interface Aggregate {
	public abstract Iterator iterator();
}
