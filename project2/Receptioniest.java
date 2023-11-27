package project2;

import java.text.ParseException;
import java.util.*;

public class Receptioniest extends Employee {
	 MuseumSystem regsub=new MuseumSystem();
	public Receptioniest( MuseumSystem a) {
		// TODO Auto-generated constructor stub
		regsub=a;
	}
	public Receptioniest( ) {
		// TODO Auto-generated constructor stub
	}
	

	public Receptioniest(int id, String name, String dob) {
		super(id, name, dob);
		// TODO Auto-generated constructor stub
	}

	/*public void rigistersubs() throws ParseException{
		
		
		regsub.addVisitor();
	}*/
	
	public void deletesub(){
		   Scanner input = new Scanner(System.in);
		  System.out.printf("  Enter Visitr id to delete him :"); 
		  int o=input.nextInt();
		  for (int i = 0; i < regsub.visitor.size(); i++) 
		  	 {
		      if(regsub.visitor.get(i).getVID()==o)
		       {
		  		    System.out.println("The visitor deleted Succesfuly");
		  		  regsub.visitor.remove(regsub.visitor.get(i));
		  			}
		  			else
		  			{
		  			System.out.println("Sorry,you cant delete ID that doesnt exist");
		  			
		  			}
		  	 }
		  	  
		  }
	
	public void issueTicket() {
		
		Scanner input = new Scanner(System.in);
		MultiTimeTicket multiTimeTicket=new MultiTimeTicket();
	int r;
		System.out.println("what the Tickit you want ?? ");
			System.out.println("1. One Time Ticket ");
			System.out.println("2. Multi Time Ticket ");
			r=input.nextInt();
			if (r == 1) {
				System.out.println("Your Ticket type is One Time Ticket");
        		System.out.println("Your Ticket id is 1234");
				OneTimeTicket oneTimeTicket=new OneTimeTicket();
				return;	
			}
			else if (r==2) {
				int n;
        	System.out.println("  what the Tickit Type ?? ");
        	System.out.println("1.  Daily");
        	System.out.println("1.  Monthly");
        	System.out.println("1.  Yearly");
        	n=input.nextInt();
        	if (n==1) {
        		
        		System.out.println("Your Ticket type is Daily");
        		System.out.println("Your Ticket id is 1111");

        		multiTimeTicket.setprice(30);
        		System.out.print("Your Ticket price" + multiTimeTicket.getprice());
        	//TicketType.DAILY();
        		
        		
      		//setDiscountRate(0.25);
        	//	TicketType.DAILY;
        	
        		return;
        	}
        	else if(n==2) {
        		
        		System.out.println("Your Ticket type is Monthly");
        		System.out.println("Your Ticket id is 2222");

        		multiTimeTicket.setprice(200);
        		System.out.print("Your Ticket price" + multiTimeTicket.getprice());
        		
        	//	setDiscountRate(0.30);
        	//	TicketType.MONTHLY;
        		return;
        	}
        	else if (n==3) {
        		System.out.println("Your Ticket type is Yearly");
        		System.out.println("Your Ticket id is 3333");

        		multiTimeTicket.setprice(2200);
        		System.out.print("Your Ticket price" + multiTimeTicket.getprice());
        	//	setDiscountRate(0.35);
        	//	TicketType.YEARLY;
        		return;	
        	}
        	
        	
	}
	}
	
	
}
