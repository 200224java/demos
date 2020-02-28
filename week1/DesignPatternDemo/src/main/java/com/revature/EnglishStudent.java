package com.revature;

public class EnglishStudent extends Student {

	private String favoriteBook;

	public EnglishStudent() {
		super();
	}

	public EnglishStudent(String name, int age, String major) {
		super(name, age, major);
		this.favoriteBook = "Wuthering Heights";
	}

	public String getFavoriteBook() {
		return favoriteBook;
	}

	public void setFavoriteBook(String favoriteBook) {
		this.favoriteBook = favoriteBook;
	}

	@Override
	public String toString() {
		return "EnglishStudent [favoriteBook=" + favoriteBook + ", getMajor()=" + getMajor() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + "]";
	}
}
