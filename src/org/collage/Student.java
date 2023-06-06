package org.collage;

public class Student extends college{
	public void studentName() {
System.out.println("student name=kanmani");
	}
	private void studentDept() {
System.out.println("student dept=chemistry");
	}
private void studentId() {
System.out.println("student id=231");
}
public static void main(String[] args) {
	Student s=new Student();
	s.collageName();
	s.collagerank();
	s.collagecode();
	
	s.hostelName();
	s.studentName();
	s.studentDept();
	s.studentId();
	
			
}
}
