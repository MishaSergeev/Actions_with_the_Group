package com.gmail.ps.allllll;

import java.util.Arrays;
import java.util.Scanner;
import java.io.Serializable;
import java.io.*;

public class Group implements Voenkom, Serializable {
	private Student[] list = new Student[10];
	private String quantity;

	public Group(Student[] list) {
		super();
		this.list = list;
		this.quantity = quantity;

	}

	public Group() {
		super();
	}

	public Student[] getList() {
		return list;
	}

	public void setList(Student[] list) {
		this.list = list;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void addInteractive() throws OverfullGroupExeption {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name:");
		String name = sc.nextLine();

		System.out.println("Input surname:");
		String surname = sc.nextLine();

		System.out.println("Input age:");
		int age = sc.nextInt();

		System.out.println("Input sex:");
		boolean sex = sc.nextBoolean();

		System.out.println("Input numberZ:");
		int numberZ = sc.nextInt();

		System.out.println("Input absence:");
		int absence = sc.nextInt();

		System.out.println("Input  course:");
		int course = sc.nextInt();

		System.out.println("Input group:");
		String group = sc.nextLine();

		Student st = new Student(name, surname, age, sex, numberZ, absence, course, group);

		this.addStudent(st); // добавляем введенного студента в массив студентов.
	}

	public void addStudent(Student st) throws OverfullGroupExeption { // добавление
		if (st == null) {
			throw new IllegalArgumentException("No students");
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				list[i] = st;
				st.setGroup(this.quantity);
				return;

			}

		}
		throw new OverfullGroupExeption();
	}

	

	public void deleteStudent(Student number) { // удаление
		for (int j = 0; j < list.length; j++) {
			if (list[j] == null) {
				System.out.println("It is impossible to delete something that does not exist!");

			}
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] == number && list[i] != null) {
				list[i] = null;
				System.out.println("The student" + " " + number.getSurname() + " " + "deleted from Group" + " "
						+ number.getGroup());

			}

		}

	}

	public Student rearchSurnameOfStudent(String surname) { // поиск по фамилии

		for (int i = 0; i < list.length; i++) {
			if ((list[i] != null) && list[i].getSurname().equals(surname)) {
				return list[i];
			}

		}
		return null;

	}

	public void abcSort() {                // сортировка по фамилии
		for (int j = 0; j < list.length - 1; j++) {
			for (int i = j + 1; i < list.length; i++) {
				if ((sortStudents(list[j], list[i])) > 0) {
					Student a = list[j];
					list[j] = list[i];
					list[i] = a;
				}
			}

		}
	}
	


	private int sortStudents(Student a, Student b) {
		if (a != null && b == null) {
			return -1;
		}
		if (a == null && b != null) {
			return 1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getSurname().compareTo(b.getSurname());
	}
	
	   
	public void sortByAge() {
		Arrays.sort(list, (one, two) -> {
			if (one == null) {
				return -1;
			}
			if (two == null) {
				return 1;
			}
			if (one == null || one.getAge() < two.getAge()) {
				return -1;
			}
			if (two == null || one.getAge() > two.getAge()) {
				return 1;
			}

			return 0;
		});
	}
		
	public Student [] forVoenkom() {
	Student[] VoenkomOk = new Student[list.length];
	int count = 0;
	for(int i=0;i< 10; i++) {
		if(list [i]==null) {
			continue;
		}
		if(list[i].getAge()>=18 && list[i].isSex() == false)
		{VoenkomOk[count] = list[i] ;
		count += 1;}
		
		else {continue;};
}
	return VoenkomOk;
	}

	@Override
	public String toString() {
		return Arrays.toString(list);

	}
//	public void printgroup(){
//		for(Human k:list){
//		System.out.println(k);
//		}
//		}
	
}
