package com.revature;

public class MathStudent extends Student {
	
	private String favoriteSubject;

	public MathStudent() {
		super();
	}

	public MathStudent(String name, int age, String major) {
		super(name, age, major);
		this.favoriteSubject = "Linear Algebra";
	}

	public String getFavoriteSubject() {
		return favoriteSubject;
	}

	public void setFavoriteSubject(String favoriteSubject) {
		this.favoriteSubject = favoriteSubject;
	}

	@Override
	public String toString() {
		return "MathStudent [favoriteSubject=" + favoriteSubject + ", getMajor()=" + getMajor() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + "]";
	}
}
