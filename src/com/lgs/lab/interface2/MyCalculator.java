package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.add(5, 4);
		myCalculator.substruct(5, 4);
		myCalculator.multiply(3, 5);
		myCalculator.divide(8, 4);
	}

	@Override
	public void add(double a, double b) {
		System.out.println("add " + a + "+" + b + " = " + (a+b));
	}

	@Override
	public void substruct(double a, double b) {
		System.out.println("substruct " + a + "-" + b + " = " + (a-b) );
	}

	@Override
	public void multiply(double a, double b) {
		System.out.println("multiply " + a + "*" + b + " = " + a*b);
	}

	@Override
	public void divide(double a, double b) {
		System.out.println("divide " + a + "/" + b + " = " + a/b);
	}

}
