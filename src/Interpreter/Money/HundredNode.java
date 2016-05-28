package Interpreter.Money;

public class HundredNode extends Node{
	Integer nums = 0;
	Node append;
	Node decimal;
	@Override
	public void parse(Context context) throws ParseException {
		while(context.currentToken() != null){
			if(context.currentToken().equals("hundred"))
				break;
			if(context.currentToken().equals("billion") || context.currentToken().equals("million") || context.currentToken().equals("thousand")){
				context.nextToken();
				break;
			}
			if(!context.hasPre())
				break;
			context.preToken();
		}
		if(context.currentToken().equals("hundred")){
			context.preToken();
			append = new AppendNode();
			append.parse(context);
			context.nextToken();
			context.nextSkipToken("hundred");
		}
		if(SingleNode.isSingle(context.currentToken())){
			decimal = new SingleNode();
			decimal.parse(context);
		}else{
			if(context.currentToken().equals("billion") || context.currentToken().equals("million") || context.currentToken().equals("thousand"))
				decimal = null;
			else{
				decimal = new DecimalNode();
				decimal.parse(context);
			}
		}
	}
	public String toString(){
		String str = "";
		str += (append == null) ? "0" : append.toString();
		str += (decimal == null) ? "00" : decimal.toString();
		return str;
	}

}
