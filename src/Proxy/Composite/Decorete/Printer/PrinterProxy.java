package Proxy.Composite.Decorete.Printer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import Decorate.String.Display;

public class PrinterProxy implements Printable{

	private ArrayList<String> names;
	private ArrayList<Printer> printers = new ArrayList<Printer>();
	private Random random = new Random();
	private int index;
	
	public PrinterProxy(){}
	public PrinterProxy(ArrayList<String> names){
		this.names = names;
		Iterator it = names.iterator();
		while(it.hasNext()){
			printers.add(new Printer((String)it.next()));
		}
	}
	
	@Override
	public synchronized void setPrinterName(String name) {
		printers.add(new Printer(name));
		names.add(name);
	}

	@Override
	public String getPrinterName() {
		return names.get(index);
	}

	@Override
	public void print(Display display) {
		index = random.nextInt(3);
		System.out.println("------Printer " + getPrinterName() + "------");
		Printer p = (Printer) printers.get(index);
		p.print(display);
		System.out.println();
		//System.out.println("------Printer " + getPrinterName() + "------");
	}
	

}
