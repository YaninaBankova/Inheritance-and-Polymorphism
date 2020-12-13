package edu.smg;


public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	public Faculty(String officeHours, String rank, String office, double salary, 
			String name, String address, String phoneNumber, String e_mail) {
		super(office, salary,  name, address, phoneNumber, e_mail);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getHour() {
		return rank;
	}
	public void setHour(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
	}
}
