package Singleton.Eager;

/**
 * 单例模式-饿汉模式
 * 加载类的时候比较慢,因为在加载类的时候会创建实例，但是在运行时获取对象的速度比较快。线程安全
 * @author echo
 * */
public class Singleton {
	private static Singleton singleton = new Singleton();;
	public static Singleton getInstance(){
		return singleton;
	}
}
