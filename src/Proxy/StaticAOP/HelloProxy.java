package Proxy.StaticAOP;

public class HelloProxy implements IHello{
	
	private IHello hello;
	
	public HelloProxy(IHello hello){
		this.hello = hello;
	}
	
	@Override
	public void sayHello(String name) {
		Logger.logging(Level.DEBUGE, "sayHello method start...");
		hello.sayHello(name);
		Logger.logging(Level.INFO, "sayHello method end...");
	}

}
