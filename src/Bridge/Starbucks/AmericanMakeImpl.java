package Bridge.Starbucks;

public class AmericanMakeImpl extends CoffeImpl{
	
	AmericanMakeImpl(Cupsize cupsize, Milk milk, Foam foam){
		super(cupsize, milk, foam);
		name = "American";
	}

	@Override
	public void putMilkAndFoam() {
		System.out.println("milk:" + milk.getName());
		System.out.println("foam:" + foam.getName());
	}
}
