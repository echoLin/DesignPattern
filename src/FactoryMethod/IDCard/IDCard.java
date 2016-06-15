package FactoryMethod.IDCard;

public class IDCard extends Product{

	private String owner;
	
	public IDCard(String owner){
		System.out.println(owner + ", 创建一个新的IDCard");
		this.owner = owner;
	}
	@Override
	public void use() {
		System.out.println(owner + "，use");
	}
	
	public String getOwner(){
		return owner;
	}

}
