package Prototype;

public class Main {
	public static void main(String[] args){
		Sheep mary = new Sheep("Mary", "female", "white");
		Sheep dolly = (Sheep) mary.createClone();
		dolly.setName("Dolly");
		mary.display();
		dolly.display();
	}
}
