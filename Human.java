package com.gmail.ps.allllll;
import java.io.Serializable;

public class Human implements Serializable{
	private String name;
	private String surname;
	private int age;
	private boolean sex;

	public Human(String name, String surname, int age, boolean sex) {
		super();
		this.name = name;
		this.surname = surname;
		if (age > 0 && age < 145) {
			this.age = age;
		} else {
			System.out.println("This age is NOT correct!");
		}
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Input name!");
		}
		if (surname != null) {
			this.surname = surname;
		} else {
			System.out.println("Input surname!");
		}
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Input name!");
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		if (surname != null) {

			this.surname = surname;
		} else {
			System.out.println("Input surname!");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 145)
			this.age = age;
		else

			System.out.println("This age is NOT correct!");
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "\n\nname:" + name + "|surname:" + surname + "| age:" + age + " sex:" + sex;
	}

}
