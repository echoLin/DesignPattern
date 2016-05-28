package Bridge.Starbucks;

public class EspressoMakeImpl extends CoffeImpl{
	EspressoMakeImpl(Cupsize cupsize, Milk milk, Foam foam){
		super(cupsize, milk, foam);
		name = "Espresso";
	}

	@Override
	public void putMilkAndFoam() {
		System.out.println("milk:" + milk.getName());
		System.out.println("foam:" + foam.getName());
	}
}
