package project2;

import java.util.Date;
import java.text.*;

public class Employee extends Person {
private int employee_id;
private String hiredate;

public Employee() {}
	public Employee(int id, String name, String dob) {
		super(id, name, dob);
		
		// TODO Auto-generated constructor stub
	}
	public void seteid(int id) {
		this.employee_id=id;
	}
	public int geteid() {
		return employee_id;
	}
	public void setHireDate(String hd) {
		this.hiredate=hd;
	}
	public String getHireDate() {
		
		return hiredate;
	}
//public String toString() {
	
//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
	//Date myDate = sdf.parse("28/12/2013");
//	sdf.applyPattern("EEE, d MMM yyyy");
	//String sMyDate = sdf.format(hiredate);
	//String s="the hire date :"+sMyDate;
	
	
	
	//String s=(hiredate.getDay() + "/" + (hiredate.getMonth()+1) + "/" + hiredate.getYear());
//	return s;
	
//}
/*
public static Date printdate(Date d) {
	System.out.println(d.getDay() + "/" + (d.getMonth()+1) + "/" + d.getYear());
	
	return d; 
}*/

}
