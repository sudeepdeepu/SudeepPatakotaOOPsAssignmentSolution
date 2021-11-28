package com.assignment1.main;

import com.assignment1.services.AdminDepartment;
import com.assignment1.services.HrDepartment;
import com.assignment1.services.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment adminDepartmentObj = new AdminDepartment();
		HrDepartment hrDepartmentObj = new HrDepartment();
		TechDepartment techDepartmentObj = new TechDepartment();
		adminDepartmentObj.departmentName();
		adminDepartmentObj.getTodaysWork();
		adminDepartmentObj.getWorkDeadline();
		adminDepartmentObj.isTodayAHoliday();
		hrDepartmentObj.departmentName();
		hrDepartmentObj.doActivity();
		hrDepartmentObj.getTodaysWork();
		hrDepartmentObj.getWorkDeadline();
		hrDepartmentObj.isTodayAHoliday();
		techDepartmentObj.departmentName();
		techDepartmentObj.getTodaysWork();
		techDepartmentObj.getWorkDeadline();
		techDepartmentObj.getTechStackInformation();
		techDepartmentObj.isTodayAHoliday();
	}

}
