package com.encapsulation;

import java.util.ArrayList;

public class Demo extends Thread {

	int roll;
	String name;

	public Demo(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Demo [roll=" + roll + ", name=" + name + "]";
	}

	public void run() {
		
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	}

}
