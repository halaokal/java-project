package project2;

import java.util.Date;
import java.text.*;
public class Person {
	int id;
	String name;
	String Dob;
	public Person() {
		
	}
	public Person(int id,String name,String dob) {
		this.name=name;
		this.id=id;
		this.Dob=dob;		
	}
public String getName() {
	return name;	
}
public void setName(String Name) {
		this.name=Name;
}
public int getId() {
	return id;	
}
public void setID(int ID) {
	this.id=ID;	
}
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	this.Dob=dob;	
}





public String toString() {
	SimpleDateFormat hala= new SimpleDateFormat("dd/mm/yyyy");
	String s=System.lineSeparator()+"Name is  :"+getName()+System.lineSeparator()+"id :"+getId()+System.lineSeparator()+"birth date is :"+hala.format(getDob())  +System.lineSeparator()+System.lineSeparator();
	//String s=(Dob.getDay() + "/" + (Dob.getMonth()+1) + "/" + Dob.getYear());
	return s;
} 

}

