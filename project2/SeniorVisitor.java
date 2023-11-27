package project2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.Scanner;

public class SeniorVisitor extends Visitor {
private double discountRate;
public SeniorVisitor(MuseumSystem s){
	to=s;
}


MuseumSystem to=new MuseumSystem();


public SeniorVisitor() {}
	public SeniorVisitor(int id, String name, String dob) {
		super(id, name, dob);
		// TODO Auto-generated constructor stub
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double dCR) {
	this.discountRate=dCR;	
	}
	//public double makediscount(double disc,double pri) {
		//pri=pri-(pri*disc)/100;
		//System.out.print(pri);
		//return pri;
		
//	}
	
	String sto;
	Date dto;
	int sg;
	Guide j=new Guide();
	@Override
	public void bookTour() throws ParseException {
		Scanner input = new Scanner(System.in);
		
		int y;
		int tid;
		Ticket ticket=new Ticket();
		
		
		Receptioniest rT=new Receptioniest();
		System.out.println("      Welcome      ");
		System.out.println("do you want the toor :");
		System.out.println("1. With Guide ");
		System.out.println("2. Without Guide ");
	//	System.out.println("please enter your choice ");
		y=input.nextInt();
		
 		 				
 			if(y==1)
 			
 			{
 				int r;
 				
 	 			System.out.println("please enter The Date you want ");
 	 			sto=input.next();
 	 			 dto= new SimpleDateFormat("dd/mm/yyyy").parse(sto);
 	 			to.getAvailableGuides(dto);
 	 			System.out.println(to.guide);
 	 			System.out.println("Enter id for the guide you want him/her");
 	 			sg=input.nextInt(); 	
 	 			
 	 			rT.issueTicket();
 	 			System.out.println(" Enter your Ticket id ");
 	 			tid=input.nextInt();
 	 			if(tid==1111) {
 	 				ticket.setprice(50);
 	 				System.out.println("You booked a toor with guide ");
 	 				System.out.println("and with Dayly Ticket ");
 	 				System.out.println("with price"+ticket.getprice());


 	 			}
 	 			else if(tid==2222) {
 	 				ticket.setprice(400);
 	 				System.out.println("You booked a toor with guide ");
 	 				System.out.println("and with Monthly Ticket ");
 	 				System.out.println("with price="+ticket.getprice());
 	 				
 	 			}
 	 			else if(tid==3333) {
 	 				
 	 				ticket.setprice(2200);
 	 				System.out.println("You booked a toor with guide ");
 	 				System.out.println("and with Yearly Ticket ");
 	 				System.out.println("with price"+ticket.getprice());

 	 			}
 	 			else if (tid==1234) {
 	 				ticket.setprice(30); 	
 	 				System.out.println("You booked a toor with guide ");
 	 				System.out.println("and with One time Ticket ");
 	 				System.out.println("with price"+ticket.getprice());
 	 			}
 	 		
                }
 			if(y==2)
 			{
 				rT.issueTicket();
 	 			System.out.println(" Enter your Ticket id ");
 	 			tid=input.nextInt();
 	 			if(tid==1111) {
 	 				ticket.setprice(40);
 	 				System.out.println("You booked a toor with Dayly Ticket ");
 	 				System.out.println("with price"+ticket.getprice());


 	 			}
 	 			else if(tid==2222) {
 	 				ticket.setprice(200);
 	 				System.out.println("You booked a toor with Monthly Ticket  ");
 	 				System.out.println("with price="+ticket.getprice());
 	 				
 	 			}
 	 			else if(tid==3333) {
 	 				
 	 				ticket.setprice(1500);
 	 				System.out.println("You booked a toor with Yearly Ticket"); 				
 	 				System.out.println("with price"+ticket.getprice());

 	 			}
 	 			else if (tid==1234) {
 	 				ticket.setprice(20); 
 	 				System.out.println("You booked a toor One time Ticket");
 	 				System.out.println("with price"+ticket.getprice());
 	 			}
 				
 				
 				
 			}
 			
                

                return;
 			
 			
 			}
 			
 			
 			
 			
 			
 			
		
	}
	//}


