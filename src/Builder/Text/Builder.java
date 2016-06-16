package Builder.Text;

/**
 * 规定了组成文件的方法
 * @author echo
 * */
public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
	public abstract String getResult();
}
