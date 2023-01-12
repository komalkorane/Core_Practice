package com.copyconstructor;

public class TestCopyConstructor {

	public static void main(String[] args) {
     Engine eng = new Engine("DI", 123245);
     Car c = new Car("Audi", 132.13f, eng);
     Car c1 = new Car(c);
     System.out.println(c);
     System.out.println(c1);
     c.getEng().setPrice(111111);
     System.out.println(c);
     System.out.println(c1);
		
	}

}
