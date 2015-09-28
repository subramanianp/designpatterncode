package com.spring.training.strategy;

public class SearchEngine {
	private SortStrategy strategy;

	public SearchEngine(SortStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	public void search()
	{
		strategy.sort();
		System.out.println("Searching");
		//remaining searching logic
	}

}
