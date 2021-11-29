package com.greatlearning.model;

public abstract class SuperDepartment {
	@SuppressWarnings("unused")
	public String deparmentName() {
		String message="Super Department";
		return message;
		}
	
	@SuppressWarnings("unused")
	public String getTodaysWork() {
		String message="No Work as of now";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String getWorkDeadLine()
	{
		String message="nil";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String isTodayAHoliday()
	{
		String message="Today is not a holiday";
		return message;
	}
	
	public abstract String doActivity();
	
	public abstract String getTechStackInformation();
	
	
}
