package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {
	@SuppressWarnings("unused")
	public String deparmentName() {
		String message="Welcome to Tech Department";
		return message;
		}
	
	@SuppressWarnings("unused")
	public String getTodaysWork() {
		String message="Complete Coding of Module 1";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String getWorkDeadLine()
	{
		String message="Complete By EOD";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String getTechStackInformation()
	{
		String message="Core java";
		return message;
	}

	@Override
	public String doActivity() {
		// TODO Auto-generated method stub
		return null;
	}
}
