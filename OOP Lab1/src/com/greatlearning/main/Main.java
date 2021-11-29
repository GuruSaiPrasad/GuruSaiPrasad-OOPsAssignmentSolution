package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;
import com.greatlearning.service.printService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printService printService=new printService();
		
		SuperDepartment admin=new AdminDepartment();
		printService.printingStatement(admin.deparmentName());
		printService.printingStatement(admin.getTodaysWork());
		printService.printingStatement(admin.getWorkDeadLine());
		printService.printingStatement(admin.isTodayAHoliday());
		
		System.out.println();
		
		SuperDepartment hr=new HrDepartment();
		printService.printingStatement(hr.deparmentName());
		printService.printingStatement(hr.doActivity());
		printService.printingStatement(hr.getTodaysWork());
		printService.printingStatement(hr.getWorkDeadLine());
		printService.printingStatement(hr.isTodayAHoliday());
		
		System.out.println();
 
		SuperDepartment techie=new TechDepartment();
		printService.printingStatement(techie.deparmentName());
		printService.printingStatement(techie.getTechStackInformation());
		printService.printingStatement(techie.getTodaysWork());
		printService.printingStatement(techie.getWorkDeadLine());
		printService.printingStatement(techie.getTechStackInformation());
		printService.printingStatement(techie.isTodayAHoliday());
		
	}

}
