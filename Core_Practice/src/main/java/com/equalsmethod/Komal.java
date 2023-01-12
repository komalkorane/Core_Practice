package com.equalsmethod;

public class Komal {

	String name;
	int age;

	public Komal() {
		super();
	}

	public Komal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Komal [name=" + name + ", age=" + age + "]";
	}

  public boolean equals(Object o) {
	  if(o == null)
		  return false;
	  if(o == this)
		  return true;
	  if(o instanceof Komal) {
		  Komal kk =(Komal)o;
		  if(name.equals(kk.name)&& age==kk.age)
			  return true;
		  else 
			  return false;
	  }
	  else
	      return false;
  }

	public static void main(String[] args) {

		Komal k1 = new Komal("Komal", 25);
		Komal k2 = new Komal("Shree", 23);
		Komal k3 = new Komal("Komal", 25);
		Komal k4 = new Komal("Korane", 23);
		Komal k5 = new Komal(null,20);
		Komal k6=null;

		System.out.println(k1.equals(k4));
		System.out.println(k1.equals(k3));
		System.out.println(k6==k5); 
	}

}
