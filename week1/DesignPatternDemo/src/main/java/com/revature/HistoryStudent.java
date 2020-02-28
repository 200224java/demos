package com.revature;

public class HistoryStudent extends Student {

	private String favoriteEra;

	public HistoryStudent() {
		super();
	}

	public HistoryStudent(String name, int age, String major) {
		super(name, age, major);
		this.favoriteEra = "Roaring 20s";
	}

	public String getFavoriteEra() {
		return favoriteEra;
	}

	public void setFavoriteEra(String favoriteEra) {
		this.favoriteEra = favoriteEra;
	}

	@Override
	public String toString() {
		return "HistoryStudent [favoriteEra=" + favoriteEra + ", getMajor()=" + getMajor() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + "]";
	}
}
