package com.spring.training.strategy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStrategy strategy=new QuickSort();
		SearchEngine engine=new SearchEngine(strategy);
		engine.search();

	}

}
