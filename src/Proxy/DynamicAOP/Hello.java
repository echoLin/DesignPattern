package Proxy.DynamicAOP;

public class Hello implements IHello{
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("Goodbye " + name);
	}
	
}
