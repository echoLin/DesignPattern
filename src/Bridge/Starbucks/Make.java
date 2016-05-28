package Bridge.Starbucks;

public class Make{
	private CoffeImpl impl;
	public Make(CoffeImpl impl){
		this.impl = impl;
	}
	public final void make(){
		System.out.println("----------begin to make coffe---------");
		impl.putCoffe();
		impl.putCup();
		impl.putMilkAndFoam();
		System.out.println();
	}
}
