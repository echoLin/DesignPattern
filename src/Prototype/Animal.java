package Prototype;

public interface Animal extends Cloneable{
	public abstract Animal createClone();
	public abstract void display();
}
