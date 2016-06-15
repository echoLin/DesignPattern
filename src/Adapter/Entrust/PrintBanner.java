package Adapter.Entrust;

/**
 * 使用委托的方式
 * @author echo
 * */
public class PrintBanner implements Print{
	private Banner banner;
	public PrintBanner(String string){
		this.banner = new Banner(string);
	}
	@Override
	public void printWeak() {
		banner.showWithParen();
		
	}
	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}
