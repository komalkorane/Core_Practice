package com.immutableclass;

public final class Student {

	private final String name;
	private final int roll;
	private final Address add;
	
	public Student(String name, int roll, Address add) {
		super();
		this.name = name;
		this.roll = roll;
		Address ad =(Address)add;
		this.add=ad;
	}
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public Address getAdd() {
		Address ad =(Address)add;
		return ad;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", add=" + add + "]";
	}

	public static void main(String[] args) {

		Address add = new Address("Kop", 123);
		Student s = new Student("Komal", 10, add);
		System.out.println(s);
	    s.getAdd().setCity("Pune");
		System.out.println(s);
	}
	
}
