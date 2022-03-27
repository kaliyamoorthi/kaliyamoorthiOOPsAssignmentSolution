package com.greatlearning.main;


	import com.greatlearning.module.AdminDepartment;
	import com.greatlearning.module.HRDepartment;
	import com.greatlearning.module.TechDepartment;

	public class Driverclass {
	    public static void main(String[] args) {
	        
	        AdminDepartment adm = new AdminDepartment();
	        System.out.println("Welcome to "+ adm.departmentName()+"\n"+adm.getTodaysWork()+"\n"+adm.getWorkDeadline()+"\n"+adm.isTodayAHoliday());
	        System.out.println("\n");

	        HRDepartment hr = new HRDepartment();
	        
	        System.out.println("Welcome to "+ hr.departmentName()+"\n"+hr.doActivity()+"\n"+hr.getTodaysWork()+"\n"+hr.getWorkDeadline()+"\n"+hr.isTodayAHoliday());
	        System.out.println("\n");
	        
	        TechDepartment tech = new TechDepartment();
	        
	        System.out.println("Welcome to "+tech.departmentName()+"\n"+tech.getTodaysWork()+"\n"+tech.getWorkDeadline()+"\n"+tech.getTechStackInformation()+"\n"+tech.isTodayAHoliday());
	        System.out.println("\n");
	    }


	}

