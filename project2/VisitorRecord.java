package project2;

import java.util.Date;
public class VisitorRecord {
	VisitorRecord(){
		
	};
Date enteringDate=new Date();
Date enteringtime=new Date();
private String dateenteringstr;
public String getdateenteringstr() {
	return dateenteringstr;
}
public void setdateenteringstr(String ed) {
	this.dateenteringstr=ed;	
}
VisitorRecord(Date d,Date t,String s){
	this.enteringDate=d;
	this.enteringtime=t;
	
}
}
