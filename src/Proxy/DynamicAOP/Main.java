package Proxy.DynamicAOP;

public class Main {

	public static void main(String[] args) {
		IHello hello = (IHello)new DynamicProxyHello().bind(new Hello(), new LoggerOperation());
		//只能代理接口
		//Hello hello = (Hello)new DynamicProxyHello().bind(new Hello(), new LoggerOperation());
		//Exception in thread "main" java.lang.ClassCastException: com.sun.proxy.$Proxy0 cannot be cast to Proxy.DynamicAOP.Hello		
		hello.sayGoodbye("echo");
		hello.sayHello("echo");
	}

}
