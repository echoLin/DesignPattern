package Bridge.Starbucks;

public enum Milk {
	Nomilk("Nomilk"), Low_fat("Low fat"), Soy("Soy");
	String name;
	
	private Milk(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
