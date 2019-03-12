package com.cts.model;



public class Employee {
private byte sysNo;
private short roomNo;
private int id;
private String name;
private double salary;
private char gender;
private long mobileNo;
private String maritalStatus;
Account account;
public byte getSysNo() {
	return sysNo;
}
public void setSysNo(byte sysNo) {
	this.sysNo = sysNo;
}
public short getRoomNo() {
	return roomNo;
}
public void setRoomNo(short roomNo) {
	this.roomNo = roomNo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String isMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}

}
