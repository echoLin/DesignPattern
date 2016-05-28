package Interpreter.Money;

public class MillionNode extends Node{
	private Node hundred;
	private Node thousand;
	@Override
	public void parse(Context context) throws ParseException {
		while(context.hasNext()){
			if(context.currentToken().equals("million") || context.currentToken().equals("thousand"))
				break;
			context.nextToken();
		}
		if(context.currentToken().equals("million")){
			context.preToken();
			hundred = new HundredNode();
			hundred.parse(context);
			while(!context.currentToken().equals("million")){
				context.nextToken();
			}
			context.nextSkipToken("million");
		}
		thousand = new ThousandNode();
		thousand.parse(context);
	}
	
	public String toString(){
		return (hundred == null ? "000" : hundred.toString()) + "," + thousand.toString();
	}

}
