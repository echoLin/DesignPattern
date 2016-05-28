package Interpreter.Money;

public class BillionNode extends Node{
	private Node hundred;
	private Node million;
	@Override
	public void parse(Context context) throws ParseException {
		while(context.hasNext()){
			if(context.currentToken().equals("billion") || context.currentToken().equals("million") || context.currentToken().equals("thousand"))
				break;
			context.nextToken();
		}
		if(context.currentToken().equals("billion")){
			context.preToken();
			hundred = new HundredNode();
			hundred.parse(context);
			while(!context.currentToken().equals("billion")){
				context.nextToken();
			}
			context.nextSkipToken("billion");
		}
		million = new MillionNode();
		million.parse(context);
	}
	
	public String toString(){
		String str = (hundred == null ? "000" : hundred.toString()) +  "," + million.toString();
		//return str.replaceFirst("^0+", "");
		return str.replaceFirst("^[0|,]+", "");
	}

}
