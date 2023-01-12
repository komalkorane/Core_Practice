package com.cloning;

public class Employee implements Cloneable {

	int id;
	String name;
	Address add;
	public Employee() {
		super();
	}
	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	public Object clone() {
		Address ad1 = new Address(add.getCity(),add.getPin());
		Employee em = new Employee(id, name, ad1);
		return em;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		Address ad = new Address("Kop",233);
		Employee e = new Employee(10, "Shree", ad);
		Employee emp = (Employee)e.clone();
		System.out.println("Before clone "+e);
		System.out.println("before clone "+emp);
		e.add.setCity("Pune");
		System.out.println("After clone "+e);
		System.out.println("After clone "+emp);
	}

	
}
