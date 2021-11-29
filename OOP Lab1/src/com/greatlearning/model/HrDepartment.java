package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
	@SuppressWarnings("unused")
	public String deparmentName() {
		String message= "Welcome to Hr Department";
		return message;
		}
	
	@SuppressWarnings("unused")
	public String getTodaysWork() {
		String message="Fill today’s timesheet and mark your attendance";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String getWorkDeadLine()
	{
		String message="Complete by EOD";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String doActivity() {
		String message="Team Lunch";
		return message;
	}

	@Override
	public String getTechStackInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}
