package com.spring.training.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArithOpFactory {
	private static Map<Character, ArithOp> cache=new HashMap<>();
	
	public static ArithOp createArithOp(char operator)
	{
		ArithOp op=null;
		if(cache.containsKey(operator)){
			op=cache.get(operator);
		}
		else{
			op=new ArithOp(operator);
			cache.put(operator, op);
		}
		return op;
	}

}
