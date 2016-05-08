package Prototype;

public class Sheep implements Animal{
	
	private String name;
	private String sex;
	private String color;

	public Sheep(String name, String sex, String color) {
		super();
		this.name = name;
		this.sex = sex;
		this.color = color;
	}

	@Override
	public Animal createClone() {
		Animal a = null;
		try {
			a = (Animal)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return a;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("name:" + name + " sex:" + sex + " color:" + color);
	}

}
