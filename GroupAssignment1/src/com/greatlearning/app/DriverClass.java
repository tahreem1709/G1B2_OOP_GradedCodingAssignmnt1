package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;



public class DriverClass {

	public static void main(String[] args) {

		int choice = 0;
		Scanner in = new Scanner(System.in);
		SuperDepartment s1 = new SuperDepartment();
		AdminDepartment a1 = new AdminDepartment();
		HRDepartment h1 = new HRDepartment();
		TechDepartment t1 = new TechDepartment();

		System.out.println("1.Admin Department");
		System.out.println("2.HR Department");
		System.out.println("3.Tech Department");

		System.out.println("Enter Your Department Name!");

		choice = in.nextInt();

		switch (choice) {

		
		case 1:
			System.out.println(a1.departmentName());
			System.out.println(a1.getTodaysWork());
			System.out.println(a1.getWorkDeadline());
			System.out.println(a1.isTodayAHoliday());
			break;

		case 2:
			System.out.println(h1.departmentName());
			System.out.println(h1.doActivity());
			System.out.println(h1.getTodaysWork());
			System.out.println(h1.getWorkDeadline());
			System.out.println(h1.isTodayAHoliday());
			break;

		case 3:
			System.out.println(t1.departmentName());
			System.out.println(t1.getTodaysWork());
			System.out.println(t1.getWorkDeadline());
			System.out.println(t1.getTechStackInformation());
			System.out.println(t1.isTodayAHoliday());
			break;

		default:
			System.out.println(s1.departmentName());
			System.out.println(s1.getTodaysWork());
			System.out.println(s1.getWorkDeadline());
			System.out.println(s1.isTodayAHoliday());
			System.out.println("Please enter a valid department!");
			break;

		}

	}

}
