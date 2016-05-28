package Interpreter.Money;

import java.util.Hashtable;

public class AppendNode extends Node{
	static Hashtable<String, Integer> map = null;
	
	Integer num = 0;
	
	public static boolean isAppend(String str){
		if(map == null){
			map = new Hashtable<String, Integer>();
			map.put("one", 1);
			map.put("two", 2);
			map.put("three", 3);
			map.put("four", 4);
			map.put("five", 5);
			map.put("six", 6);
			map.put("seven", 7);
			map.put("eight", 8);
			map.put("nine", 9);
		}
		if(map.containsKey(str))
			return true;
		return false;
	}

	@Override
	public void parse(Context context) throws ParseException {
		if(isAppend(context.currentToken()))
			num = map.get(context.currentToken());
		else{
			throw new ParseException(context.currentToken() + " is undifiend in AppendNodeMap");
		}
	}
	
	public String toString(){
		return String.valueOf(num);
	}

}
