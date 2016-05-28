package Interpreter.Money;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		try{
			BufferedReader reader = new BufferedReader(new FileReader("money.txt"));
			String text;
			while((text = reader.readLine()) != null){
				System.out.println("text = \"" + text + "\"");
				Node node = new BillionNode();
				node.parse(new Context(text));
				System.out.println("node = " + node);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
