package Interpreter.Money;

public class ThousandNode extends Node{
	private Node hundred;
	private Node next;
	@Override
	public void parse(Context context) throws ParseException {
		while(context.hasNext()){
			if(context.currentToken().equals("thousand") || context.currentToken().equals("and"))
				break;
			context.nextToken();
		}
		if(context.currentToken().equals("thousand")){
			context.preToken();
			hundred = new HundredNode();
			hundred.parse(context);
			while(!context.currentToken().equals("thousand")){
				context.nextToken();
			}
			context.nextSkipToken("thousand");
			while(!context.currentToken().equals("and")){
				context.nextToken();
			}
		}
		next = new HundredNode();
		next.parse(context);
	}
	
	public String toString(){
		return (hundred == null ? "000" : hundred.toString()) + "," + next.toString();
	}
}
