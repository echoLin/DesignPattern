package Bridge.Starbucks;

public class CappuccionMakeImpl extends CoffeImpl{
	CappuccionMakeImpl(Cupsize cupsize, Milk milk, Foam foam){
		super(cupsize, milk, foam);
		name = "Cappuccion";
	}

	@Override
	public void putMilkAndFoam() {
		System.out.println("milk:" + milk.getName());
		System.out.println("foam:" + foam.getName());
	}
}
