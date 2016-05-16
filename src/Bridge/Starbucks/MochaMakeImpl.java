package Bridge.Starbucks;

public class MochaMakeImpl extends CoffeImpl{
	Cupsize cupsize;
	Milk milk;
	Foam foam;
	
	MochaMakeImpl(Cupsize cupsize, Milk milk, Foam foam){
		this.cupsize = cupsize;
		this.milk = milk;
		this.foam = foam;
	}
	
	@Override
	public void putCup() {
		System.out.println("cupsize is " + cupsize.getName());
	}

	@Override
	public void putCoffe() {
		System.out.println("coffe is Mocha");
	}

	@Override
	public void putMilkAndFoam() {
		System.out.println("foam is " + foam.getName());
		System.out.println("milk is " + milk.getName());
	}

}
