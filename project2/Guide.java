package project2;

import java.text.SimpleDateFormat;
import java.util.*;

import java.util.ArrayList;

public class Guide extends Employee {
int toursPerDay;

public Guide() {}
	public Guide(int id, String name, String dob) {
		super(id, name, dob);
		// TODO Auto-generated constructor stub
	}
	
public int gettoursPerDay() {
	return toursPerDay;
}
public void settoursPerDay(int tpd) {
	this.toursPerDay=tpd;
}

ArrayList<Languages>guidelang= new ArrayList<Languages>();
public void setLanguages(ArrayList<Languages>guidelang) {
	this.guidelang=guidelang;
}
public ArrayList<Languages>getLanguages(){return guidelang;}


ArrayList<MuseumWorkingDays>guideworkingday= new ArrayList<MuseumWorkingDays>();
public void setdeworkingday(ArrayList<MuseumWorkingDays>guideworkingday) {
	this.guideworkingday=guideworkingday;
}
public ArrayList<MuseumWorkingDays>getdeworkingday(){return guideworkingday;}



public String toString() {
	SimpleDateFormat om= new SimpleDateFormat("dd/mm/yyyy");

	String s=System.lineSeparator()+"name is:   "+getName()
	+System.lineSeparator()+"id is:   "+getId()
	+System.lineSeparator()+"date of birth  is:   "+ om.format(getDob()) 
	+System.lineSeparator()+"date of hire is:  "+om.format(getHireDate())
	+System.lineSeparator()+"languge is:  "+getLanguages()
	+System.lineSeparator()+System.lineSeparator();
	return s;
}

}


