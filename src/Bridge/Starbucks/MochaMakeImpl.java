package Bridge.Starbucks;

public class MochaMakeImpl extends CoffeImpl{

	MochaMakeImpl(Cupsize cupsize, Milk milk, Foam foam){
		super(cupsize, milk, foam);
		name = "Mocha";
	}

	@Override
	public void putMilkAndFoam() {
		System.out.println("foam:" + foam.getName());
		System.out.println("milk:" + milk.getName());
	}

}
