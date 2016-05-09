package Proxy.DynamicAOP;

import java.lang.reflect.Method;

public class LoggerOperation implements IOperation{

	@Override
	public void start(Method method) {
		Logger.logging(Level.DEBUGE, method.getName() + " Method start .");
	}

	@Override
	public void end(Method method) {
		Logger.logging(Level.INFO, method.getName() + " Method end .");
	}

}
