package com.spring.training.flyweight;

public class ArithOp {
	private final char operator;

	public ArithOp(char operator) {
		super();
		this.operator = operator;
	}
	public int performCalculation(int operand1,int operand2)
	{
		int result=0;
		switch (operator) {
		case '+':
			result=operand1+operand2;
			break;
		case '-':
			result=operand1-operand2;
			break;
		case '*':
			result=operand1*operand2;
			break;
		case '/':
			result=operand1/operand2;
			break;
		default:
			break;
		}
		return result;
	}

}
