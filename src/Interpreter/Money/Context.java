package Interpreter.Money;

public class Context {
	private String[] tokenizer;
	private String currentToken;
	private Integer currentIndex;
	public Context(String text){
		tokenizer = text.split(" ");
		currentIndex = -1;
		nextToken();
	}
	
	public boolean hasNext(){
		if(currentIndex+1 >= tokenizer.length)
			return false;
		return true;
	}
	
	public boolean hasPre(){
		if(currentIndex-1 < 0)
			return false;
		return true;
	}
	
	public String nextToken(){
		if(currentIndex+1 >= tokenizer.length)
			currentToken = null;
		else
			currentToken = tokenizer[++currentIndex];
		return currentToken;
	}
	
	public String preToken(){
		if(currentIndex-1 < 0)
			currentToken = null;
		else
			currentToken = tokenizer[--currentIndex];
		return currentToken;
	}
	
	public String currentToken(){
		return currentToken;
	}
	
	public void nextSkipToken(String token) throws ParseException{
		if(!token.equals(currentToken)){
			throw new ParseException("Warning:" + token + " is expected, but " + currentToken + " is found.");
		}
		nextToken();
	}
	
	public void preSkipToken(String token) throws ParseException{
		if(!token.equals(currentToken)){
			throw new ParseException("Warning:" + token + " is expected, but " + currentToken + " is found.");
		}
		preToken();
	}
}
