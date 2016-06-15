package FactoryMethod.IDCard;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class IDCardFactory extends Factory{
	private ArrayList owners = new ArrayList();
	@Override
	protected Product createProduct(String owner){
		return new IDCard(owner);
	}
	@Override@SuppressWarnings("unchecked")
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product));
	}
	
	public ArrayList getOwners(){
		return owners;
	}
}
