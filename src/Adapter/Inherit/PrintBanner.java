package Adapter.Inherit;

/**
 * 使用继承的方式
 * @author echo
 * */
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
	
}
