package com.gmail.ps.allllll;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student one = new Student("�����", "���������", 24, false, 1, 50, 5, "��-22");
		Student two = new Student("����", "�������", 17, false, 2, 5, 5, "��-22");
		Student three = new Student("�����", "�����", 23, false, 3, 10, 5, "��-22");
		Student four = new Student("����", "����������", 23, false, 4, 0, 5, "��-22");
		Student five = new Student("������", "�����", 24, true, 5, 6, 5, "��-22");
		Student six = new Student("����", "���������", 24, true, 6, 6, 5, "��-22");
		Student seven = new Student("��������", "���������", 23, true, 7, 85, 5, "��-22");
		Student eight = new Student("��������", "�������", 24, true, 8, 11, 1, "��-22");
		Student nine = new Student("�����", "��������", 23, true, 9, 0, 1, "��-22");
		Student ten = new Student("������", "�������", 24, false, 10, 10, 5, "��-22");
		Student eleven = new Student("����", "����������", 23, false, 11, 852, 4, "��-22");

		Group dp = new Group();
		try {
			dp.addStudent(one);
			dp.addStudent(two);
			dp.addStudent(three);
			dp.addStudent(four);
			dp.addStudent(five);
			dp.addStudent(six);
			dp.addStudent(seven);
			dp.addStudent(eight);
			dp.addStudent(nine);
			dp.addStudent(ten);
			dp.addStudent(eleven);
		} catch (OverfullGroupExeption e) {
			System.out.println(e.getMessage());
		}

		dp.rearchSurnameOfStudent("��������");
		dp.deleteStudent(one);
		dp.abcSort();
		dp.sortByAge();
		dp.forVoenkom();
		try {
			dp.addInteractive(); 
		} catch (OverfullGroupExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(dp);

		File group = new File("group.txt");

		
		 System.out.println("STUDENTS FOR VOENCOM :" +
		 Arrays.toString(dp.forVoenkom()));
		 System.out.println();
		 System.out.println("����� ������ ���������� �������");
		 System.out.println();

		try {
			Serializable.seveGroupToFile(group, dp);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Group readdp = null;

		try {
			readdp = Serializable.readGroupFromFile(group);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		System.out.println("List students from saved lile:"+readdp);
	}
}