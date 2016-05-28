package Bridge.Starbucks;

public abstract class CoffeImpl {
	protected Cupsize cupsize;
	protected Milk milk;
	protected Foam foam;
	protected String name;
	public CoffeImpl(Cupsize cupsize, Milk milk, Foam foam){
		this.cupsize = cupsize;
		this.milk = milk;
		this.foam = foam;
	}
	public void putCup(){
		System.out.println("cupsize:" + cupsize.getName());
	}
	public void putCoffe(){
		System.out.println("coffe:" + name);
	}
	public abstract void putMilkAndFoam();
}
