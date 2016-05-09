package Proxy.DynamicAOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//InvocationHandler类可以让我们在JVM调用某个类的方法时动态的为这些方法做些什么事
public class DynamicProxyHello implements InvocationHandler{
	
	private Object delegate;//要处理的对象
	private Object proxy;//操作者
	
	//动态生成方法被处理过后的对象
	public Object bind(Object delegate, Object proxy){
		this.delegate = delegate;
		this.proxy = proxy;
		//Loader是类装载器
		//Interfaces是真实类所拥有的全部接口的数组
		//最后一个参数为handler
		return Proxy.newProxyInstance(
				this.delegate.getClass().getClassLoader(),
				this.delegate.getClass().getInterfaces(),
				this
				);
	}
	
	//要处理的对象中的每个方法都会被次方法送去JVM调用，也就是说，
	//要处理的对象的方法只能通过此方法调用
	//此方法是动态的，不需要手动调用
	//如果要针对某一个方法，可以在方法体内加上if，对传进来的method的名字进行判断，
	//判断的条件存在XML里面，这样我们就可以配置文件时进行解耦了。
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try{
			//反射得到操作者的实例
			Class<? extends Object> c = this.proxy.getClass();
			//反射得到操作者的Start方法
			Method start = c.getDeclaredMethod("start", new Class[] {Method.class});
			//反射执行start方法
			start.invoke(this.proxy, new Object[] {method});
			//执行要处理对象的原本方法
			result = method.invoke(this.delegate, args);
			//反射得到操作者的end方法
			Method end = c.getDeclaredMethod("end", new Class[] {Method.class});
			//反射执行end方法
			end.invoke(this.proxy, new Object[] {method});
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

}
