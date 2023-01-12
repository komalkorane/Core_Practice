package com.custom.exception;

public class Customer {

	String name;
	String acc_no;
	String ifsc;
	String branch;

	public Customer(String name, String acc_no, String ifsc, String branch) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public String getAcc_no() {
		return acc_no;
	}

	public String getIfsc() {
		return ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public String toString() {
		return "Customer [name=" + name + ", acc_no=" + acc_no + ", ifsc=" + ifsc + ", branch=" + branch + "]";
	}

}
