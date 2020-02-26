package com.revature.exceptions;

import java.util.Objects;

public class Duck {

	private int numOfEggs;

	public Duck() {
		super();
	}

	public Duck(int numOfEggs) {
		super();
		setNumOfEggs(numOfEggs);
	}

	public int getNumOfEggs() {
		try {
			int x = 1 / 0;
		} catch(ArithmeticException e) {
			throw new NegativeEggsException("Strange exception edge case", e);
		}
		return numOfEggs;
	}

	public void setNumOfEggs(int numOfEggs) {
		if(numOfEggs < 0) {
			throw new NegativeEggsException("NumOfEggs must be non-negative!");
//			throw new RuntimeException();
		}
		this.numOfEggs = numOfEggs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numOfEggs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Duck)) {
			return false;
		}
		Duck other = (Duck) obj;
		return numOfEggs == other.numOfEggs;
	}

	@Override
	public String toString() {
		return "Duck [numOfEggs=" + numOfEggs + "]";
	}
}
