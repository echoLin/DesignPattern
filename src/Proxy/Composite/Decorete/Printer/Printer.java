package Proxy.Composite.Decorete.Printer;

import Decorate.String.Display;

public class Printer implements Printable{
	private String name;
	
	public Printer(String name){
		this.name = name;
	}
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(Display display) {
		display.show();
	}

}
