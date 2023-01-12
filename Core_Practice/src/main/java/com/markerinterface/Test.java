package com.markerinterface;

public class Test  {

	public static void main(String[] args) {
		Marker m1 = new Marker();
		String s = new String();
		Test t = new Test();
		
		delete(m1);
		delete(s);
		delete(t);

	}

	public static boolean delete(Object o) {
		if (o instanceof Deletable) {
			System.out.println("marker interface");
			return true;
		} else {

			System.out.println("not marker");
			return false;
		}
	}
}
