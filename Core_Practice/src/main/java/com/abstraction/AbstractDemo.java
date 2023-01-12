package com.abstraction;

public abstract class AbstractDemo {

	int roll;
	String name;
	
	public AbstractDemo(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public AbstractDemo() {
		super();
	}

	public abstract void m1();
}

class Test extends AbstractDemo{

	int a;
	String b;

	public Test(int roll, String name, int a, String b) {
		super(roll, name);
		this.a = a;
		this.b = b;
	}

	@Override
	public void m1() {

		System.out.println("Abstract ");
	}
	
}
