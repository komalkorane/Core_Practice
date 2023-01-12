package com.copyconstructor;

public class Car {

	String name;
	float km;
	Engine eng;
	public Car() {
		super();
	}
	public Car(Car c) {
		this.name=c.name;
		this.km=c.km;
		Engine en = new Engine(c.eng.getType(),c.eng.getPrice());
		this.eng=en;
	}
	public Car(String name, float km, Engine eng) {
		super();
		this.name = name;
		this.km = km;
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", km=" + km + ", eng=" + eng + "]";
	}
	
	
}
