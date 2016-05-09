package Proxy.StaticAOP;

public class Main {

	public static void main(String[] args) {
		IHello hello = new HelloProxy(new Hello());
		hello.sayHello("Echo");
	}

}
