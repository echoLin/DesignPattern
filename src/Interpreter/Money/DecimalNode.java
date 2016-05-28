package Interpreter.Money;

import java.util.Hashtable;


public class DecimalNode extends Node{
	static Hashtable<String, Integer> map = null;
	Integer num = 0;
	Node node = null;
	@Override
	public void parse(Context context) throws ParseException {
		if(isDecimal(context.currentToken())){
			num += map.get(context.currentToken());
			if(context.hasNext()){
				context.nextToken();
				if(AppendNode.isAppend(context.currentToken())){
					//System.out.println(context.currentToken());
					node = new AppendNode();
					node.parse(context);
				}
			}
		}else if(AppendNode.isAppend(context.currentToken())){
			node = new AppendNode();
			node.parse(context);
		}else{
			System.out.println(map.size());
			throw new ParseException(context.currentToken() + " is error in DecimalNode");
		}
	}
	
	public static boolean isDecimal(String str){
		if(map == null){
			map = new Hashtable<String, Integer>();
			map.put("twenty", 20);
			map.put("thirty", 30);
			map.put("forty", 40);
			map.put("fifty", 50);
			map.put("sixty", 60);
			map.put("seventy", 70);
			map.put("eighty", 80);
			map.put("ninety", 90);
		}
		if(map.containsKey(str))
			return true;
		return false;
	}
	
	public String toString(){
		if(num == 0)
			return "0" + node.toString();
		if(node != null)
			num += Integer.parseInt(node.toString());
		return String.valueOf(num);
	}
}
