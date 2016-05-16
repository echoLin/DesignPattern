package Bridge.Starbucks;

public enum Cupsize {
	Short("Short"),Tall("Tall"),Grande("Grande"),Venti("Venti");
	String name;
	
	private Cupsize(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
