package FactoryMethod.IDCard;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Echo");
		Product card2 = factory.create("Tom");
		Product card3 = factory.create("Zacard");
		card1.use();
		card2.use();
		card3.use();

	}

}
