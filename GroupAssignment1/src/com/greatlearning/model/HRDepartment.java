package com.greatlearning.model;

public class HRDepartment extends SuperDepartment{
	public String departmentName() {
		return "HR Department";
		}
	public String getTodaysWork() {
		return "Fill todays timesheet and mark your attendence";
		}
	public String getWorkDeadline() {
		return "Complete by EOD";
		}
	public String doActivity() {
		return "Team Lunch";}


}
