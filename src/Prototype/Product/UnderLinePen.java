package Prototype.Product;

public class UnderLinePen implements Product{
	
	private char uchar;
	public UnderLinePen(char uchar){
		super();
		this.uchar = uchar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for(int i = 0; i < length; i++)
			System.out.print(uchar);
		System.out.println();
	}

	@Override
	public Product createClone() {
		Product p = null;
		try{
			p = (Product)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}

}
