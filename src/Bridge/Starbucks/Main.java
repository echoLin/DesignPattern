package Bridge.Starbucks;

public class Main {
	public static void main(String[] args){
		Make m1 = new Make(new MochaMakeImpl(Cupsize.Short, Milk.Low_fat, Foam.Extra));
		m1.make();
	}
}
