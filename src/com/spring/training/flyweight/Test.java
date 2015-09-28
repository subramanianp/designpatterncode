package com.spring.training.flyweight;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithOp op1=ArithOpFactory.createArithOp('+');
		ArithOp op2=ArithOpFactory.createArithOp('/');
		System.out.println(op1.performCalculation(10, 7));
		System.out.println(op2.performCalculation(10, 5));
		ArithOp op3=ArithOpFactory.createArithOp('+');
		System.out.println(op3.performCalculation(1,7));
		System.out.println(op1==op2);
		System.out.println(op1==op3);

	}

}
