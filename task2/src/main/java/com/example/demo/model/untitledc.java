package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "untitledc")
public class untitledc {

	
	
	
private	String Facility;
private	String 	ItemNumber;
private	String 	MONumber;
private	String 	SequenceNumber;
private	String 	OperationDescription;
private	String 	Department;
private	String 	WorkCenter;
private	String 	ActivityStatus;
private	String 	ActivityCode;
private	String 	employeenumber;
private	String 	AssetNumber;
private	String 	QtyCompleted;
private	String 	logondate;
private	String 	logoffdate;
private	String	Hours;
private	String	HoursM3FormatPeriod;
private	String	Status;
@Id
private int  Id;
private	String	period ; 
private	String	APU_WC ;

private	String	logofftime ;


private	String	logontime ;










public String getLogofftime() {
	return logofftime;
}
public void setLogofftime(String logofftime) {
	this.logofftime = logofftime;
}
public String getLogontime() {
	return logontime;
}
public void setLogontime(String logontime) {
	this.logontime = logontime;
}
public String getFacility() {
	return Facility;
}
public void setFacility(String facility) {
	Facility = facility;
}
public String getItemNumber() {
	return ItemNumber;
}
public void setItemNumber(String itemNumber) {
	ItemNumber = itemNumber;
}
public String getMONumber() {
	return MONumber;
}
public void setMONumber(String mONumber) {
	MONumber = mONumber;
}
public String getSequenceNumber() {
	return SequenceNumber;
}
public void setSequenceNumber(String sequenceNumber) {
	SequenceNumber = sequenceNumber;
}
public String getOperationDescription() {
	return OperationDescription;
}
public void setOperationDescription(String operationDescription) {
	OperationDescription = operationDescription;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getWorkCenter() {
	return WorkCenter;
}
public void setWorkCenter(String workCenter) {
	WorkCenter = workCenter;
}
public String getActivityStatus() {
	return ActivityStatus;
}
public void setActivityStatus(String activityStatus) {
	ActivityStatus = activityStatus;
}
public String getActivityCode() {
	return ActivityCode;
}
public void setActivityCode(String activityCode) {
	ActivityCode = activityCode;
}
public String getEmployeenumber() {
	return employeenumber;
}
public void setEmployeenumber(String employeenumber) {
	this.employeenumber = employeenumber;
}
public String getAssetNumber() {
	return AssetNumber;
}
public void setAssetNumber(String assetNumber) {
	AssetNumber = assetNumber;
}
public String getQtyCompleted() {
	return QtyCompleted;
}
public void setQtyCompleted(String qtyCompleted) {
	QtyCompleted = qtyCompleted;
}
public String getLogondate() {
	return logondate;
}
public void setLogondate(String logondate) {
	this.logondate = logondate;
}
public String getLogoffdate() {
	return logoffdate;
}
public void setLogoffdate(String logoffdate) {
	this.logoffdate = logoffdate;
}
public String getHours() {
	return Hours;
}
public void setHours(String hours) {
	Hours = hours;
}
public String getHoursM3FormatPeriod() {
	return HoursM3FormatPeriod;
}
public void setHoursM3FormatPeriod(String hoursM3FormatPeriod) {
	HoursM3FormatPeriod = hoursM3FormatPeriod;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getPeriod() {
	return period;
}
public void setPeriod(String period) {
	this.period = period;
}
public String getAPU_WC() {
	return APU_WC;
}
public void setAPU_WC(String aPU_WC) {
	APU_WC = aPU_WC;
}
 
public untitledc(String facility, String itemNumber, String mONumber, String sequenceNumber,
		String operationDescription, String department, String workCenter, String activityStatus, String activityCode,
		String employeenumber, String assetNumber, String qtyCompleted, String logondate, String logoffdate,
		String hours, String hoursM3FormatPeriod, String status, int id, String period, String aPU_WC,
		String logofftime, String logontime) {
	super();
	Facility = facility;
	ItemNumber = itemNumber;
	MONumber = mONumber;
	SequenceNumber = sequenceNumber;
	OperationDescription = operationDescription;
	Department = department;
	WorkCenter = workCenter;
	ActivityStatus = activityStatus;
	ActivityCode = activityCode;
	this.employeenumber = employeenumber;
	AssetNumber = assetNumber;
	QtyCompleted = qtyCompleted;
	this.logondate = logondate;
	this.logoffdate = logoffdate;
	Hours = hours;
	HoursM3FormatPeriod = hoursM3FormatPeriod;
	Status = status;
	Id = id;
	this.period = period;
	APU_WC = aPU_WC;
	this.logofftime = logofftime;
	this.logontime = logontime;
}
public untitledc() {
	super();
}
@Override
public String toString() {
	return "untitledc [Facility=" + Facility + ", ItemNumber=" + ItemNumber + ", MONumber=" + MONumber
			+ ", SequenceNumber=" + SequenceNumber + ", OperationDescription=" + OperationDescription + ", Department="
			+ Department + ", WorkCenter=" + WorkCenter + ", ActivityStatus=" + ActivityStatus + ", ActivityCode="
			+ ActivityCode + ", employeenumber=" + employeenumber + ", AssetNumber=" + AssetNumber + ", QtyCompleted="
			+ QtyCompleted + ", logondate=" + logondate + ", logoffdate=" + logoffdate + ", Hours=" + Hours
			+ ", HoursM3FormatPeriod=" + HoursM3FormatPeriod + ", Status=" + Status + ", Id=" + Id + ", period="
			+ period + ", APU_WC=" + APU_WC + ", logofftime=" + logofftime + ", logontime=" + logontime + "]";
}
 
	
	
	
	
	
	
	
	
	
	
	
}
