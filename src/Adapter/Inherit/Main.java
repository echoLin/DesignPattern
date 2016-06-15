package Adapter.Inherit;

/**
 * 使用类的继承的方式实现适配器作为沟通的桥梁
 * @author echo
 * */
public class Main {
	public static void main(String[] args){
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
