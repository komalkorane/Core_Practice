package com.copyconstructor;

public class Engine {

	String type;
	int price;
	public Engine(Engine e) {
		this.type=e.type;
		this.price=e.price;
	}
	
	public Engine(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", price=" + price + "]";
	}
	
}
