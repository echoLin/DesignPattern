package Memento.Gamer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Memento implements Serializable{
	int money;
	ArrayList<String> fruits;
	public int getMoney(){
		return money;
	}
	Memento(int money){
		this.money = money;
		this.fruits = new ArrayList<String>();
	}
	public void addFruit(String fruit){
		fruits.add(fruit);
	}
	@SuppressWarnings("unchecked")
	public List<String> getFruits(){
		return (List<String>)fruits.clone();
	}
}
