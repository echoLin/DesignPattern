package Adapter.Inherit;

/**
 * 既有内容
 * 交流220V
 * @author echo
 * */
public class Banner {
	private String string;
	public Banner(String string){
		this.string = string;
	}
	public void showWithParen(){
		System.out.println("(" + string + ")");
		
	}
	public void showWithAster(){
		System.out.println("*" + string + "*");
	}
}
