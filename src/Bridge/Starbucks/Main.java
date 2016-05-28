package Bridge.Starbucks;

public class Main {
	public static void main(String[] args){
		Make m1 = new Make(new MochaMakeImpl(Cupsize.Short, Milk.Low_fat, Foam.Extra));
		m1.make();
		Make m2 = new Make(new EspressoMakeImpl(Cupsize.Grande, Milk.Nomilk, Foam.Light));
		m2.make();
		Make m3 = new Make(new AmericanMakeImpl(Cupsize.Venti, Milk.Soy, Foam.No_foam));
		m3.make();
		Make m4 = new Make(new CappuccionMakeImpl(Cupsize.Tall, Milk.Nomilk, Foam.Light));
		m4.make();
	}
}
