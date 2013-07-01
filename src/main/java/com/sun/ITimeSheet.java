package com.sun;

import java.util.Date;
import java.util.List;

public interface ITimeSheet {

	/**
	 * Method will be called to save time sheet entry for a user, for specific
	 * task and for how many hours he wants to book under that task.
	 * 
	 * @param user
	 * @param task
	 * @param noOfHours
	 * @param date
	 */
	public void fillTImeSheet(final IUser user, final ITask task,
			double noOfHours, final Date date);

	/**
	 * This method is used for retrieving the time sheet entries for a
	 * particular user within the given dates
	 * 
	 * @param userId
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public List<ITimeSheetEntry> retrieveTimeSheetEntryAgainstUser(
			final String userId, final Date fromDate, final Date toDate);

	/**
	 * This method is used for retrieving the time sheet entries for against
	 * particular task within the given dates
	 * 
	 * @param taskId
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public List<ITimeSheetEntry> retrieveTimeSheetEntriesAgainstTask(
			final String taskId, final Date fromDate, final Date toDate);

}
