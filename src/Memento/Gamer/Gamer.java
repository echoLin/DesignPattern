package Memento.Gamer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class Gamer {
	private int money;
	private ArrayList<String> fruits = new ArrayList<String>();
	private Random random = new Random();
	private static String[] fruitsname = {"苹果", "西瓜", "草莓", "香蕉"};
	private static Memento memento;
	public Gamer(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	public void bet(){
		int dice = random.nextInt(6) + 1;
		if(dice == 1){
			money += 100;
			System.out.println("获得100金币");
		}else if(dice == 2){
			money /= 2;
			System.out.println("金币数量减半");
		}else if(dice == 6){
			String f = getFruit();
			System.out.println("获得水果：" + f + "！");
			fruits.add(f);
		}else{
			System.out.println("无效点数");
		}
	}
	
	public void createMemento(){
		memento = new Memento(money);
		java.util.Iterator<String> it = fruits.iterator();
		while(it.hasNext()){
			String f = (String)it.next();
			if(f.startsWith("my"))
				memento.addFruit(f);
		}
	}
	
	public void restoreMemento(){
		this.money = memento.getMoney();
		this.fruits = (ArrayList<String>) memento.getFruits();
	}
	
	public String toString(){
		return "[money = " + money + ", fruits = " + fruits + "]";
	}
	
	private String getFruit(){
		String prefix = "";
		if(random.nextBoolean()){
			prefix = "my";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
	
	public static void saveMemento(){
		ObjectOutput out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("memento.txt"));
			out.writeObject(memento);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void loadMemento(){
		try{
			ObjectInput in = new ObjectInputStream(new FileInputStream("memento.txt"));
			memento = (Memento)in.readObject();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static boolean isMementoNull(){
		if(memento == null)
			return true;
		return false;
	}
	
	public int getMementoMoney(){
		return memento.getMoney();
	}
	
	
}
