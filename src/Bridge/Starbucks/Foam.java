package Bridge.Starbucks;

public enum Foam {
	No_foam("No foam"), Light("Light"), Extra("Extra");
	String name;
	
	private Foam(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
