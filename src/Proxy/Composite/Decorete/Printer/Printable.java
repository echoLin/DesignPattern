package Proxy.Composite.Decorete.Printer;

import Decorate.String.Display;

public interface Printable {
	public abstract void setPrinterName(String name);
	public abstract String getPrinterName();
	public abstract void print(Display display);
}
