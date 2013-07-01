package com.sun.impl;

import java.util.Date;

import com.sun.ITask;
import com.sun.ITimeSheetEntry;
import com.sun.IUser;

public class TimeSheetEntry implements ITimeSheetEntry {

	private IUser user;
	private ITask task;
	private double noOfHoursLogged;
	private Date timeSheetEntryDate;

	public IUser getUserInfo() {
		return user;
	}

	public ITask getTaskInfo() {
		return task;
	}

	public double getNoOfHoursLogged() {
		return noOfHoursLogged;
	}

	public Date getTimeSheetEntryDate() {
		return timeSheetEntryDate;
	}

}
