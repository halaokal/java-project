package project2;

import java.util.Date;
public class Ticket {
	public Ticket() {
		
	}
	Date issueDate=new Date();
	int price;
	Ticket(Date d,int p){
		this.issueDate=d;
		this.price=p;
	}
	public Date getissueDate() {		
		return issueDate;
	}
	public void setissueDate(Date is) {
		this.issueDate=is;		
	}
	public int getprice() {
		return price;
	}
	public void setprice(int pr) {
		this.price=pr;
	}
	Visitor vI;
	public Visitor getVisitor() {
		return vI;
	}
	public void setVisitor(Visitor vis) {
		vI=vis;
	}
	
}

