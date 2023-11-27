package project2;

import java.util.*;
import java.text.*;

public class MuseumSystem {
	public ArrayList<Guide> guideee=new ArrayList<>();
	 
	public MuseumSystem(){	
		Guide sami=new Guide();
		sami.setName("Sami");
		sami.seteid(1111);
		sami.setDob("7/2/1999");
		sami.setHireDate("4/4/2014");
		sami.guidelang.add(Languages.Arabic);
		sami.guidelang.add(Languages.English);
		sami.guidelang.add(Languages.German);
		sami.guideworkingday.add(MuseumWorkingDays.Monday);
		sami.guideworkingday.add(MuseumWorkingDays.Tuseday);
		sami.setHireDate("2/5/2019");
		guide.add(sami);
		Guide jamal=new Guide();
		jamal.setName("jamal");
		jamal.seteid(3333);
		jamal.setDob("27/3/2000");
		jamal.setHireDate("4/5/20018");
		jamal.guidelang.add(Languages.Arabic);
		jamal.guidelang.add(Languages.English);
		jamal.guidelang.add(Languages.French);
		//jamal.guideworkingday.add(MuseumWorkingDays.Wednesday);
		jamal.guideworkingday.add(MuseumWorkingDays.Tuseday);
		jamal.guideworkingday.add(MuseumWorkingDays.Saturday);
		jamal.setHireDate("4/8/2018");
		guide.add(jamal);
		
		
		
		
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", java.util.Locale.ENGLISH);
		//Date myDate = sdf.parse("28/12/2013");
//		sdf.applyPattern("EEE, d MMM yyyy");
		Guide ahmad=new Guide();
		 ahmad.setName("Ahmad");
		 Date dahmad=new Date(27/12/2021);	
		
	//	 dahmad.getMonth();

		 Date hahmade=new Date(20/2/2021);
/*		 ahmad.setDob(dahmad);
		 ahmad.setID(445536);
		 
		 ahmad.setHireDate(hahmade);
		 ahmad.guidelang.add ((Languages.Arabic));
		 ahmad.guidelang.add ((Languages.German));
		 ahmad.guideworkingday.add(MuseumWorkingDays.Saturday);
		 ahmad.guideworkingday.add(MuseumWorkingDays.Sunday);
		 
		 Guide hala=new Guide();
		 Date d2=new Date("4/4/2008");
		 hala.setDob(d2);	
		 hala.setHireDate(new Date("4/5/2019"));
		 hala.setID(445533);
		 hala.setName("Hala kamal");
		 hala.guidelang.add ((Languages.French));
		 hala.guidelang.add ((Languages.Chinese));
		 hala.guidelang.add ((Languages.Chinese));
		 hala.guideworkingday.add(MuseumWorkingDays.Saturday);
		 hala.guideworkingday.add(MuseumWorkingDays.Tuseday);
		 guide.add(ahmad);
		 guide.add(hala);

	*/		
	}
	
	
	ArrayList <Guide> Guidinformationselectedday= new ArrayList<Guide>();
	ArrayList <Guide> Guidinformationselectedlangua= new ArrayList<Guide>();
	
	
	ArrayList <Visitor> visitor= new ArrayList<Visitor>();
	 public void setVisitor (ArrayList <Visitor> v) {
		 this.visitor=v; 
		 }
	 public ArrayList <Visitor> getVisitor(){ 
		 return visitor; 
		 }	 
	 
	 ///***********SENIOR & REGULAR ARRAYLIST**************///
	 
	 ArrayList <RegularVisitor> RegularVisitorList= new ArrayList<RegularVisitor>();
	 public void setregVisitor (ArrayList <RegularVisitor> regvi) {
		 this.RegularVisitorList=regvi; 
		 }
	 public ArrayList <RegularVisitor> getRegularVisitorList(){ 
		 return RegularVisitorList; 
		 }	
	 
	 
	 ArrayList <SeniorVisitor> SeniorVisitorList= new ArrayList<SeniorVisitor>();
	 public void setseniVisitor (ArrayList <SeniorVisitor> senv) {
		 this.SeniorVisitorList=senv; 
		 }
	 public ArrayList <SeniorVisitor> getseniVisitor(){ 
		 return SeniorVisitorList; 
		 }	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /////////////////////////////////
	 
	 
	 
	 
	
	 String na;
	 Scanner input = new Scanner(System.in);
	 Date dao;
	
	
	
	 
	 ArrayList <Guide> guide= new ArrayList<Guide>( );
/*	 ArrayList <Guide> guide(){
		 return guide;
		 
	 }*/
	 public void setGuide(ArrayList <Guide> g) { 
		 this.guide=g;
		 }
	 public ArrayList <Guide> getGuide(){ 
		 return guide; 
		 }

	 //////**********************************************//////////
	 ArrayList <Guide> guidesearch= new ArrayList<Guide>( );
	
	 public void setguidesearch(ArrayList <Guide> gui) { 
		 this.guidesearch=gui;
		 }
	 public ArrayList <Guide> getguidesearch(){ 
		 return guidesearch; 
		 }
	
///////////////////////////////////////////////////////////////////////
	 ArrayList <Guide> guideselectday= new ArrayList<Guide>( );
	 ArrayList <Guide> guidesearch(){
		 return guidesearch;
		 
	 }
	 public void setguideselectday(ArrayList <Guide> guid) { 
		 this.guideselectday=guid;
		 }
	 public ArrayList <Guide> getguideselectday(){ 
		 return guideselectday; 
		 }
	 	
	////////*************************************************//////////////
	 //////////////////ADD VISITOR//////////////////////4
	 /*
	 public void addVisitor() throws ParseException {
		 
		 Visitor vi;
		 vi= new Visitor(){};
		 Date doob;
		 String doog;
		 int vid;
		 System.out.println("Enter your id");
		 vid=input.nextInt();
		 vi.setVID(vid);
		 System.out.println("Enter your name");
		 na=input.next();
		 vi.setName(na);
		 System.out.println("Enter your birth Date");
		 doog=input.next();
		 doob= new SimpleDateFormat("dd/mm/yy").parse(doog);
		 vi.setDob(doob);		
		   for (int i = 0; i < visitor.size(); i++) 
			 {
		    if(visitor.get(i).getVID()==vi.getVID()){
		        System.out.println("could not add person");
		        return;
		    }
		   }
		   visitor.add(vi);
		   
		 
		  ///////////////ADD GUIDE////////////////////
	  
	
}
		
*/
	 /*
	 	 
	 public void addGuide() throws ParseException {
		 Guide gu=new Guide();

		 int idd;
		 Date db;
		 String dg;
		 String lang;
		 Languages lan;
		 String gw;
		 MuseumWorkingDays mwd; 
		 System.out.println("Enter Guide Name"); 
		 na=input.next();
		 gu.setName(na);
		 System.out.println("Enter Guide id");
		 idd = input.nextInt();
		 gu.setID(idd);	 		 
		 System.out.println("Enter Guide language");
		 lang=input.next();
		 lan=Languages.valueOf(lang);
		 gu.guidelang.add(lan);
		 System.out.println("Enter Birth Date");
		
		 dg=input.next();
		 db= new SimpleDateFormat("dd/mm/yy").parse(dg);
		 gu.setDob(db);
		 
		 
		 
		 System.out.println("Enter Guide Working Days");
		 gw=input.next();
		 mwd=MuseumWorkingDays.valueOf(gw);
		 gu.guideworkingday.add(mwd);
		 guideee.add(gu);
		 
			 
		 }
		 */
	 public void print() {
	for (Guide g : guideee) {
		System.out.print(g.name+"\t"+g.id+"\t"+g.guidelang+"\t"+g.guideworkingday+"\n");
	}
		 
	 }
	 
	 

		///////////////////////////GETAVAILABELE_GUIDE//////////////////////////////////////	      	   
	 public ArrayList <Guide> getAvailableGuides(Date avgu){
		 boolean bol=false;

		 		// ArrayList <Guide> ka= new ArrayList<Guide>();
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
		 
		// Date myDate = sdf.format(avgu);
		 sdf.applyPattern("EEE");
		 String sMyDate = sdf.format(avgu);
		 String s="day is:"+sMyDate;
		// System.out.print(s);
		//return getAvailableGuides(avgu);
		 
			 
		 for (Guide gi :guide ) {
			 
			 for( MuseumWorkingDays mD : gi.getdeworkingday() ) {

				 String k = mD.name();
			
				if( sMyDate.equalsIgnoreCase(k))
				{
					bol = true;
				System.out.println(gi);
							
			}
			
			
          }
}
return guide;
}
}
		 
		 

	 
	 
	 
	 
	 
	 
	 
	 
