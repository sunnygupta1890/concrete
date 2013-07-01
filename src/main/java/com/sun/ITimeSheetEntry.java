package com.sun;

import java.util.Date;

public interface ITimeSheetEntry {

	/**
	 * To get the User Information who logged this time sheet entry
	 * 
	 * @return
	 */
	public IUser getUserInfo();

	/**
	 * To get the Task Information against which the time sheet is filled
	 * 
	 * @return
	 */
	public ITask getTaskInfo();

	/**
	 * No of Hours filled against a task
	 * 
	 * @return
	 */
	public double getNoOfHoursLogged();

	/**
	 * To get the Time Sheet Entry Date
	 * 
	 * @return
	 */
	public Date getTimeSheetEntryDate();
}
