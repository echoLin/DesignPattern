package Interpreter.Money;

import java.util.Hashtable;

public class SingleNode extends Node{
	static Hashtable<String, Integer> map = null;
	Integer num = null;
	@Override
	public void parse(Context context) throws ParseException {
		if(map.containsKey(context.currentToken()))
			num = map.get(context.currentToken());
		else
			throw new ParseException(context.currentToken() +" is error in simgleNode");
	}
	
	public static boolean isSingle(String str){
		if(map == null){
			map = new Hashtable<String, Integer>();
			map.put("ten", 10);
			map.put("eleven", 11);
			map.put("twelve", 12);
			map.put("thriteen", 13);
			map.put("fourteen", 14);
			map.put("fifteen", 15);
			map.put("sixteen", 16);
			map.put("seventeen", 17);
			map.put("eighteen", 18);
			map.put("ninteen", 19);
		}
		if(map.containsKey(str))
			return true;
		return false;
	}
	
	public String toString(){
		return String.valueOf(num);
	}

}
