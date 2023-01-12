package com.cloning;

public class Student implements Cloneable{

	int roll;
	String name;
	Address add;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
			Address ad=new Address("Kop",123);
			Student s1=new Student(10,"Komal",ad);
			System.out.println("before clone "+s1);
			Student s2=(Student)s1.clone();
			s1.add.setCity("Pune");
			System.out.println("before clone "+s2);
	}
	
	
}
