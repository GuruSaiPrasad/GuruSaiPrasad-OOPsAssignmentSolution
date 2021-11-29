package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	@SuppressWarnings("unused")
	public String deparmentName() {
		String message="Welcome to Admin Department";
		return message;
		}
	
	@SuppressWarnings("unused")
	public String getTodaysWork() {
		String message="Complete your documents submission";
		return message;
	}
	
	@SuppressWarnings("unused")
	public String getWorkDeadLine()
	{
		String message="Complete by EOD";
		return message;
	}

	@Override
	public String doActivity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTechStackInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
