package Proxy.Composite.Decorete.Printer;

import java.util.ArrayList;

import Decorate.String.Display;
import Decorate.String.FullBorder;
import Decorate.String.SideBorder;
import Decorate.String.StringDisplay;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		Printable p = new PrinterProxy(names);
		Display b1 = new StringDisplay("Hello");
		Display b2 = new SideBorder(b1, '*');
		Display b3 = new FullBorder(b2);
		Display b4 = new SideBorder(b3, '#');
		p.print(b1);
		p.print(b2);
		p.print(b3);
		p.print(b4);
		
	}

}
