package edu.smg;

public class Student extends Person {
	public static final int FRESHMAN = 9;
	public static final int SOPHMORE = 10;
	public static final int JUNIOR = 11;
	public static final int SENIOR = 12;
	
	private int classStatus;

	public Student(int classStatus, String name, String address, String phoneNumber, String e_mail) {
		super(name, address, phoneNumber, e_mail);
		this.classStatus = classStatus;
	}
	
	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return super.toString() + "\nClass status: " + classStatus;
	}
}
