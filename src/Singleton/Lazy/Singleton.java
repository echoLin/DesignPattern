package Singleton.Lazy;

/**
 * 单例模式-懒汉模式
 * 加载类的时候比较快，但是运行时获取对象的速度比较慢，因为运行的时候可能会需要创建实例。线程不安全
 * @author echo
 * */
public class Singleton {
	public static Singleton singleton;
	public static Singleton getInstance(){
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
}
