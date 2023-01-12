package com.custom.exception;

public class ValideUser {

	public static void main(String[] args) throws InvalideuserException {

		System.out.println("Main method");

		Customer customer = new Customer("Shree", "123456", "BKID0928", "Kop");

		isValideUser(customer);
		String res = isValideUser(customer) ? "valid user" : "Invalid user";

		System.out.println(customer.getName() + " is a " + res);

	}

	public static boolean isValideUser(Customer obj) throws InvalideuserException {

		if (obj.getAcc_no() != null && obj.getAcc_no().length() < 14)
			return true;

		else
			throw new InvalideuserException();
	}

}
