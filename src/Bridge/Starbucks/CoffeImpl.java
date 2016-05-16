package Bridge.Starbucks;

public abstract class CoffeImpl {
	protected Cupsize cupsize;
	protected Milk milk;
	protected Foam foam;
	public abstract void putCup();
	public abstract void putCoffe();
	public abstract void putMilkAndFoam();
}
