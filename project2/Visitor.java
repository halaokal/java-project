package project2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

abstract public class Visitor extends Person {
	
int record_id;
int visits_count;
 public Visitor() {
 }
	public Visitor(int id, String name, String dob) {
		super(id, name, dob);
		// TODO Auto-generated constructor stub
	}
	public int getRecord_id() {
		return record_id;
	}
public void setRecord_id(int r) {
	this.record_id=r;
}
public int getVisitsCount() {
	return visits_count;
}
public void setVisitsCount(int v) {
	this.visits_count=v;
}
public int getVID() {
	return id;
}
public void setVID(int vid) {
	this.id=vid;
}
public void bookTour() throws ParseException {
	
}
ArrayList<VisitorRecord>visitorRecord = new ArrayList<VisitorRecord>();
public void setVisitorRecord(ArrayList<VisitorRecord>VR) {
	this.visitorRecord=VR;
}
public ArrayList<VisitorRecord>getVisitorRecord(){return visitorRecord;}
}

