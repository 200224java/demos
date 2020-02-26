package com.revature.interfaces;

public class Duck implements EggLayable {

	@Override
	public void incubate(int numOfEggs, int seconds) {
		System.out.println(numOfEggs + " " + EggType.DUCK + " eggs have been incubated for " +
				seconds + " seconds");
	}

	@Override
	public int lay() {
		return 10;
	}
}
