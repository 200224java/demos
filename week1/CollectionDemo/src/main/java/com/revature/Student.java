package com.revature;

import java.util.Objects;

public class Student extends Person {

	private String major;

	public Student() {
		super();
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(major);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(major, other.major);
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + getName() + ", age=" + getAge() + "]";
	}
}
