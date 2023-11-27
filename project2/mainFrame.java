package project2;

import java.awt.*;
import java.util.Date;

//import org.graalvm.compiler.replacements.amd64.AMD64ArrayIndexOf;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class mainFrame extends JFrame implements ActionListener, ItemListener {

	MuseumSystem museuemsystemobj = new MuseumSystem();
	Ticket visitorTicket=new Ticket();
	TicketType ticketType;
	String tT;
	int CounterDaily,ConterMonthly,ConterYearly;
	
	
	VisitorRecord visitorrecordobj=new VisitorRecord();
	int topd=0;

	private JButton guideb;
	private JButton visitorb;
	private JButton mangeb;
	private JFrame mainFrame;
	private JPanel p1, p2, p3, mainpanel, gN, gW, tL, A, B, C, D;
	private FlowLayout layout = new FlowLayout();
	private JLabel lab1, lab2, lab3, lab4, labguidename, labguidworkingdays, labtourlang, a, b, c;
	private JTextField text1, text2, text3, text4, text5;
	private JButton searchNyName, listAvailabelGuide, listAllGuide;
	private JPanel d;
	private JTextArea guide_inf, visitorinf, manageinf;
	private JLabel guidelango;
//Arabic,English,French,Chinese,German,Japanese; 
	private JCheckBox Arab, Eng, Fren, Chin, Ger, Japa;
	private JPanel AEFCGJ;
	private int flag=0;


//visitor ::
	private JLabel LABEL1, LABEL2, LABEL3;
	private JCheckBox senior, reguler;
	private JRadioButton day, month, year;
	private JButton searchvisitorname;
	private JTextField tf1, tf2, tf3, tf4;
	private JPanel tNV, vTN, tNSV, vistorinfo, oP1, oP2;
///manegment
	private JLabel vname, vid, vdb, gname, gid, gdb, workday, visitorname, expvisit, tts, btfv, langua, availabguid;
	private JTextField textf1, textf2, textf3, textf4, textf5, textf6, textf7, textf8;
	private JCheckBox sun, mon, tues, wed, thers, fray, yes, sat;
	private JRadioButton re, se, da, mo, ye;
	private JComboBox<String> lana, lisa;
	private JPanel mom, dad, rama, roa, fayrooz, iyad, ana, manage;
	private JButton addvis, addgu, issutick;

////combox
	private JComboBox comboBoxguideworkingdays, comboxlang;

	private Container container = getContentPane();

	public mainFrame() {
		

		super("Muesuem Managment System");
		setSize(3000, 1000);
	//	setEditable(false);
		mainFrame = new JFrame();

		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		mainpanel = new JPanel();

		guideb = new JButton("Guide Information");

		// p1.add(guideb);

		visitorb = new JButton("Visitor Information");

		mangeb = new JButton("Managment Information");

		lab1 = new JLabel("Musueam Name is :Palestenian Musueam");
		lab2 = new JLabel("Tulkarem  Nablus Street");
		lab3 = new JLabel(" MuseumWorkingDays :");

		guideb.addActionListener(this);
		visitorb.addActionListener(this);
		mangeb.addActionListener(this);

		JPanel hala = new JPanel(new GridLayout(1, 3));
		p1.add(guideb);
		p1.add(visitorb);
		p1.add(mangeb);

		JPanel halaa = new JPanel(new GridLayout(3, 1));
		halaa.add(lab1);
		halaa.add(lab2);

		JPanel hOdays = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel hO = new JPanel(new GridLayout(3, 1));
		hO.add(p1);
		hO.add(halaa);
		hOdays.add(lab3);
		for (MuseumWorkingDays d : MuseumWorkingDays.values()) {
			String s = new String();
			s = d.toString();
			Label l = new Label(s);
			hOdays.add(l);
		}

		hO.add(hOdays);
		add(hO, BorderLayout.NORTH);

//	layout.setAlignment( FlowLayout.LEFT);
//	layout.layoutContainer( container );

		
		

		/////////////////////////// GUIDE INFORMAITION////////////////////////////
		JPanel findGuide = new JPanel(new GridLayout(6, 1));

		////////////////////////////////////
		p2 = new JPanel(new GridLayout(2, 1));
		// p2=new JPanel();
		///////////////////////////////////
		gN = new JPanel();
		labguidename = new JLabel("Guide's Name:");
		text1 = new JTextField(20);
		searchNyName = new JButton("Search Ny Name");
		searchNyName.addActionListener(this);
		gN.add(labguidename);
		gN.add(text1);
		gN.add(searchNyName);
		// add(gN);
		gW = new JPanel();
		labguidworkingdays = new JLabel("Guide's Working Days:");
		comboBoxguideworkingdays = new JComboBox(MuseumWorkingDays.values());
		comboBoxguideworkingdays.addActionListener(this);
		listAvailabelGuide = new JButton("List Available Guides");
		listAvailabelGuide.addActionListener(this);
		gW.add(labguidworkingdays);
		gW.add(comboBoxguideworkingdays);
		gW.add(listAvailabelGuide);
		// add (gW);
		tL = new JPanel();

		labtourlang = new JLabel("Tour's Language:");
		comboxlang = new JComboBox(Languages.values());
		comboxlang.addActionListener(this);
		listAllGuide = new JButton("List all Guides");
		listAllGuide.addActionListener(this);
		tL.add(labtourlang);
		tL.add(comboxlang);
		tL.add(listAllGuide);
		// add(tL);
		
		a = new JLabel("  ");

		b = new JLabel("  ");

		c = new JLabel("  ");

		// findGuide.add(a);
		// findGuide.add(b);
		// findGuide.add(c);

		findGuide.add(gN);
		findGuide.add(gW);
		findGuide.add(tL);

		p2.add(findGuide);

		/////////////////////////////// textarea
		JPanel d = new JPanel(new GridLayout(1, 3));
		Box box = Box.createHorizontalBox();
		Guide g = new Guide();
		SimpleDateFormat fformat = new SimpleDateFormat("dd/mm/yyyy");

		guide_inf = new JTextArea(" ", 40, 40);
		guide_inf.setEditable(false);
		box.add(new JScrollPane(guide_inf));
		d.add(box);
		// add(d,BorderLayout.CENTER);

		p2.add(d);

//   add(p2,BorderLayout.CENTER);

		/////////////////////////////// VOISITOR INFORMATION/////////////////////

		/*
		 * private JLabel LABEL1,LABEL2,LABEL3; private JCheckBox senior,reguler;
		 * private JRadioButton day,month,year; private JButton searchvisitorname;
		 * private JTextField tf1,tf2,tf3,tf4; private JPanel tNV,vTN,tNSV,vistorinfo;
		 */
		vistorinfo = new JPanel(new GridLayout(5, 1));
		tNV = new JPanel();
		LABEL1 = new JLabel("Total Number of Visitor:");
		senior = new JCheckBox("Senior Visitors");
		senior.addItemListener(this);
		reguler = new JCheckBox("Regular Visitors");
		reguler.addItemListener(this);

		tf1 = new JTextField(10);
		tf1.setEditable(false);
		tNV.add(LABEL1);
		tNV.add(reguler);
		tNV.add(senior);
		tNV.add(tf1);

		LABEL2 = new JLabel("Visitors Name:");
		tf2 = new JTextField(10);
		searchvisitorname = new JButton("Search Ny Name");
		searchvisitorname.addActionListener(this);
		vTN = new JPanel();
		vTN.add(LABEL2);
		vTN.add(tf2);
		vTN.add(searchvisitorname);

		LABEL3 = new JLabel("Total visits of Subscription/ Visits:");
		day = new JRadioButton("Daily", false);
		day.addItemListener(this);
		month = new JRadioButton("Monthly", false);
		month.addItemListener(this);
		year = new JRadioButton("Yearly", false);
		year.addItemListener(this);

		tf3 = new JTextField(10);
		tf3.setEditable(false);
		tNSV = new JPanel();

		tNSV.add(LABEL3);
		tNSV.add(day);
		tNSV.add(month);
		tNSV.add(year);
		tNSV.add(tf3);
		ButtonGroup group = new ButtonGroup();
		group.add(day);
		group.add(month);
		group.add(year);
		vistorinfo.add(tNV);
		vistorinfo.add(vTN);
		vistorinfo.add(tNSV);

		JPanel oP1 = new JPanel(new GridLayout(1, 3));
		Box boxv = Box.createHorizontalBox();

		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		/*
		 * String str = "Guide name: "+g.getName()+ " \n"+ "Age:  \n" +
		 * "Employment ID: "+g.getId()+"\n"+ //
		 * "Hire Date:  "+fformat.format(g.getHireDate())+"\n"+
		 * "Maximum Number Of Tours:  "+"\n"+
		 * "Spoken Language:  "+g.getLanguages()+"\n"+
		 * "Number of tours performed this week:   "+"\n";
		 */

		visitorinf = new JTextArea(" ", 40, 70);
		visitorinf.setEditable(false);
		boxv.add(new JScrollPane(visitorinf));
		oP1.add(boxv);
		oP2 = new JPanel(new GridLayout(2, 1));
		oP2.add(vistorinfo);
		oP2.add(oP1);
		add(oP2);
		// add(oP2,BorderLayout.CENTER);

		////////////////////// Mangment////////////////////////

		vname = new JLabel("Visitor's Name:");
		vid = new JLabel("Visitor's ID");
		vdb = new JLabel("Visitor's Date of Birth");
		re = new JRadioButton("Regular Visitor", true);
		addvis = new JButton("Add Visitor");

		guidelango = new JLabel("Guides Languages");
		gname = new JLabel("Guide's Name");
		gid = new JLabel("Guide's ID");
		gdb = new JLabel("Guide's Date of birth");
		workday = new JLabel("Working Days");

		// Arabic,English,French,Chinese,German,Japanese;
		// private JCheckBox Arab,Eng,Fren,Chin,Ger,Japa;
		// private JPanel AEFCGJ;

		addgu = new JButton("Add Guide");
		addgu.addActionListener(this);
		visitorname = new JLabel("Visitor ID");
		expvisit = new JLabel("Expected Visit Day");
		tts = new JLabel("Ticket's Type/Subsicription ");
		btfv = new JLabel("Book a Tour for this visit?");
		issutick = new JButton("issue Ticket");
		issutick.addActionListener(this);
		rama = new JPanel(new GridLayout(17, 1));
		rama.add(vname);
		rama.add(vid);
		rama.add(vdb);

		rama.add(re);
		rama.add(addvis);
		rama.add(gname);
		rama.add(gid);
		rama.add(gdb);
		rama.add(workday);
		rama.add(guidelango);
		rama.add(addgu);
		rama.add(visitorname);
		rama.add(expvisit);
		rama.add(tts);
		rama.add(btfv);
		rama.add(issutick);
		// add(rama);
		/*
		 * private JLabel
		 * vname,vid,vdb,gname,gid,gdb,workday,visitorname,expvisit,tts,btfv,langua,
		 * availabguid; private JTextField
		 * textf1,textf2,textf3,textf4,textf5,textf6,textf7,textf8; private JCheckBox
		 * sun,mon,tues,wed,thers,fray,yes,sat; private JRadioButton re,se,da,mo,ye;
		 * private JComboBox lana,lisa; private JPanel mom,dad,rama,roa,fayrooz,iyad;
		 * private JButton addvis,addgu,issutick;
		 */
		textf1 = new JTextField(20);
		textf2 = new JTextField(20);
		textf3 = new JTextField(20);
		se = new JRadioButton("Senior Visitor", false);
		ButtonGroup groupsere = new ButtonGroup();
		groupsere.add(re);
		groupsere.add(se);
		textf4 = new JTextField(20);
		textf5 = new JTextField(20);
		textf6 = new JTextField(20);
		iyad = new JPanel();
		sun = new JCheckBox("Sun");

		mon = new JCheckBox("Mon");
		tues = new JCheckBox("Tue");
		wed = new JCheckBox("Wed");
		thers = new JCheckBox("thu");
		fray = new JCheckBox("fri");
		sat = new JCheckBox("sat");

		// iyad.add(sun);
		iyad.add(mon);
		iyad.add(tues);
		iyad.add(wed);
		// iyad.add(thers);iyad.add(fray);
		iyad.add(sat);
		textf7 = new JTextField(20);
		textf8 = new JTextField(20);
		da = new JRadioButton("Daily");
		mo = new JRadioButton("Monthly");
		ye = new JRadioButton("Yearly");

		dad = new JPanel();
		dad.add(da);
		dad.add(mo);
		dad.add(ye);
		ButtonGroup groupdmy = new ButtonGroup();
		groupdmy.add(da);
		groupdmy.add(mo);
		groupdmy.add(ye);
		// Arabic,English,French,Chinese,German,Japanese;
		// private JCheckBox Arab,Eng,Fren,Chin,Ger,Japa;
		// private JPanel AEFCGJ;
		Arab = new JCheckBox("Arabic");
		Eng = new JCheckBox("English");
		Fren = new JCheckBox("French");
		Chin = new JCheckBox("Chinese");
		Ger = new JCheckBox("German");
		Japa = new JCheckBox("Japanese");
		AEFCGJ = new JPanel();
		AEFCGJ.add(Arab);
		AEFCGJ.add(Eng);
		AEFCGJ.add(Fren);
		AEFCGJ.add(Chin);
		AEFCGJ.add(Ger);
		AEFCGJ.add(Japa);
		yes = new JCheckBox("Yes");
		yes.addItemListener(this);
		langua = new JLabel("Language");
		lana = new JComboBox(Languages.values());
		lana.addItemListener(this);
		availabguid = new JLabel("Availabel Guides");
		lisa = new JComboBox();
		lisa.addItemListener(this);
		fayrooz = new JPanel();

		fayrooz.add(yes);
		fayrooz.add(lana);
		fayrooz.add(availabguid);
		fayrooz.add(lisa);

		roa = new JPanel(new GridLayout(17, 1));

		// Box boxman = Box.createHorizontalBox();
		manageinf = new JTextArea(" ", 10, 10);
		manageinf.setEditable(false);
		manage = new JPanel(new GridLayout(2, 1));
		oP1.add(boxv);
		roa.add(textf1);
		roa.add(textf2);
		roa.add(textf3);
		roa.add(se);
		roa.add(a);
		roa.add(textf4);
		roa.add(textf5);
		roa.add(textf6);
		roa.add(iyad);
		roa.add(AEFCGJ);
		roa.add(b);

		roa.add(textf7);
		roa.add(textf8);
		roa.add(dad);

		roa.add(fayrooz);
		add(roa);
		ana = new JPanel(new GridLayout(1, 2));
		ana.add(rama);
		ana.add(roa);
		manage.add(ana);
		// manage.add(manageinf);

		// add(ana);

		addvis.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Container contpane = getContentPane();
		// TODO Auto-generated method stub
		if (e.getSource() == guideb) {

			add(p2, BorderLayout.CENTER);
			p2.setVisible(true);
			oP2.setVisible(false);
			ana.setVisible(false);
			manageinf.setVisible(false);

		} 
		else if (e.getSource() == visitorb) {
			add(oP2, BorderLayout.CENTER);
			oP2.setVisible(true);
			p2.setVisible(false);
			ana.setVisible(false);
			manageinf.setVisible(false);

		}

		else if (e.getSource() == mangeb) {

			add(ana, BorderLayout.CENTER);
			add(manageinf, BorderLayout.SOUTH);
			oP2.setVisible(false);
			p2.setVisible(false);
			ana.setVisible(true);
			manageinf.setVisible(true);

		}
		if (e.getSource() == addvis) {

			SeniorVisitor seniorVisitorobj = new SeniorVisitor();
			RegularVisitor regularVisitorobj = new RegularVisitor();

			String namev;
			int visitorid;
			String visitordate, guidedate;
			if (textf1.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Visitor Name and try again");
				return;
			} else if (textf2.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Visitor ID and try again");
				return;
			} else if (textf2.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Visitor Birth Date and try again");
				return;
			}

			else
				namev = String.format(textf1.getText());
			visitorid = Integer.parseInt(textf2.getText());
			visitordate = String.format(textf3.getText());
			for (int i = 0; i < museuemsystemobj.SeniorVisitorList.size(); i++) {
				if (visitorid == museuemsystemobj.SeniorVisitorList.get(i).getVID()) {
					manageinf.setText(
							"this Visitor(how have this id) is already existed" + "\n" + "Try again using another id");
					return;
				}
			}
			for (int i = 0; i < museuemsystemobj.RegularVisitorList.size(); i++) {
				if (visitorid == museuemsystemobj.RegularVisitorList.get(i).getVID()) {
					manageinf.setText(
							"this Visitor(how have this id) is already existed" + "\n" + "Try again using another id");
					return;
				}
			}

			if (re.isSelected()) {
				regularVisitorobj.setName(namev);
				regularVisitorobj.setVID(visitorid);
				regularVisitorobj.setDob(visitordate);
				museuemsystemobj.RegularVisitorList.add(regularVisitorobj);
				/*
				 * manageinf.setText("Visitor Regular "+namev+" is add Successfully"
				 * +"\n Date of birth :"+visitordate+ "\n id :"+visitorid);
				 */
			} else if (se.isSelected()) {
				seniorVisitorobj.setName(namev);
				seniorVisitorobj.setVID(visitorid);
				seniorVisitorobj.setDob(visitordate);
				museuemsystemobj.SeniorVisitorList.add(seniorVisitorobj);
				/*
				 * manageinf.setText("Visitor Senior "+namev+" is add Successfully"
				 * +"\n Date of birth :"+visitordate+ "\n id :"+visitorid);
				 */

			}

			manageinf.setText("Visitor " + namev + " is add Successfully");

		}
		////////////////////////// ADDGUIDE//////////////////////
		if (e.getSource() == addgu) {

			Guide guideobj = new Guide();
			String nameg;
			DateTimeFormatter datatimeform = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		    LocalDate localDate = LocalDate.now();
		    String datestring=(datatimeform.format(localDate));
			int guideid;
			String visitordate, guidedate;
			if (textf4.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Guide Name and try again");
				return;
			} else if (textf5.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Guide ID and try again");
				return;
			} else if (textf6.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Guide Birth Date and try again");
				return;
			} else if (!(mon.isSelected()) && !(sat.isSelected()) && !(tues.isSelected()) && !(wed.isSelected())) {
				manageinf.setText("Please Select Working Days");
				return;

			}
			// private JCheckBox Arab,Eng,Fren,Chin,Ger,Japa;
			else if (!(Arab.isSelected()) && !(Eng.isSelected()) && !(Fren.isSelected()) && !(Chin.isSelected())
					&& !(Ger.isSelected()) && !(Japa.isSelected())) {
				manageinf.setText(" Select one Language at Least");
				return;

			} else
				nameg = String.format(textf4.getText());
			guideid = Integer.parseInt(textf5.getText());
			guidedate = String.format(textf6.getText());

			if (sat.isSelected()) {
				guideobj.guideworkingday.add(MuseumWorkingDays.Saturday);
			}
			if (mon.isSelected()) {
				guideobj.guideworkingday.add(MuseumWorkingDays.Monday);
			}
			if (tues.isSelected()) {
				guideobj.guideworkingday.add(MuseumWorkingDays.Tuseday);

			}
			if (wed.isSelected()) {
				guideobj.guideworkingday.add(MuseumWorkingDays.Wednesday);
			}
/////////////////////////langu
			// Arabic,English,French,Chinese,German,Japanese;
			// private JCheckBox Arab,Eng,Fren,Chin,Ger,Japa;
			// private JPanel AEFCGJ;
			if (Arab.isSelected()) {
				guideobj.guidelang.add(Languages.Arabic);
			}
			if (Eng.isSelected()) {
				guideobj.guidelang.add(Languages.English);
			}
			if (Fren.isSelected()) {
				guideobj.guidelang.add(Languages.French);

			}
			if (Chin.isSelected()) {
				guideobj.guidelang.add(Languages.Chinese);
			}
			if (Ger.isSelected()) {
				guideobj.guidelang.add(Languages.German);
			}
			if (Japa.isSelected()) {
				guideobj.guidelang.add(Languages.Japanese);
			}
			// manageinf.setText(" "+nameg+" "+guideid+" "+guidedate);
			/*
			 * for(int i=0;i<guideobj.guideworkingday.size();i++) { manageinf.setText("  "+
			 * guideobj.guideworkingday.toString());
			 * 
			 * 
			 * }
			 */
	//		LocalDateTime localDate = LocalDateTime .now();
	//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
			for (int i = 0; i < museuemsystemobj.guide.size(); i++) {
				if (guideid == museuemsystemobj.guide.get(i).geteid()) {
					manageinf.setText(
							"this Guide(how have this id) is already existed" + "\n" + "Try again using another id");
					return;
				}
			}
			guideobj.setName(nameg);
			guideobj.seteid(guideid);
			guideobj.setDob(guidedate);
			guideobj.setHireDate(datestring);
			museuemsystemobj.guide.add(guideobj);

			manageinf.setText("The Guide " + nameg + " is add Successfully");

		}

		if (e.getSource() == searchvisitorname) {
			String searchvname, nyname;
			int cv = 0;
			String hc;
			DateTimeFormatter datatimeform = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		    LocalDate localDate = LocalDate.now();
		    String datestring=(datatimeform.format(localDate));
			searchvname = tf2.getText();
			for (int i = 0; i < museuemsystemobj.SeniorVisitorList.size(); i++) {
				if (searchvname.equalsIgnoreCase(museuemsystemobj.SeniorVisitorList.get(i).getName())) {
					SeniorVisitor obj = new SeniorVisitor();
					obj.setName(museuemsystemobj.SeniorVisitorList.get(i).getName());
					obj.setVID(museuemsystemobj.SeniorVisitorList.get(i).getVID());
					obj.setDob(museuemsystemobj.SeniorVisitorList.get(i).getDob());
					museuemsystemobj.visitor.add(obj);
				}
			}
			for (int i = 0; i < museuemsystemobj.RegularVisitorList.size(); i++) {
				if (searchvname.equalsIgnoreCase(museuemsystemobj.RegularVisitorList.get(i).getName())) {
					SeniorVisitor obj1 = new SeniorVisitor();
					obj1.setName(museuemsystemobj.RegularVisitorList.get(i).getName());
					obj1.setVID(museuemsystemobj.RegularVisitorList.get(i).getVID());
					obj1.setDob(museuemsystemobj.RegularVisitorList.get(i).getDob());
					museuemsystemobj.visitor.add(obj1);
				}
			}
			if (museuemsystemobj.visitor.isEmpty()) {
				visitorinf.setText("Ther is not visitor have this name");
				return;
			}
			else
				visitorinf.setText("");
			for (Visitor a : museuemsystemobj.visitor) {

				visitorinf.append("inromation on Visitor  :\n"
				+"Visitor Name: " + a.getName() + "\n" 
						+ "Visitor Id  :" + a.getVID() + "\n"
						+ "Visitor Birth date  :" + a.getDob() + "\n"+"Visits Hestory :\n"+"Record One :"+
						datestring+
						"\n\n");////////
				// visitorinf.setText("hala");

			}
			museuemsystemobj.visitor.removeAll(museuemsystemobj.visitor);

		}

		//////////////////////////////////////// guidinformation actionlistner
		if (e.getSource() == searchNyName) {
			String gS = "";
			gS = text1.getText();
			for (int i = 0; i < museuemsystemobj.guide.size(); i++) {
				if (gS.equalsIgnoreCase(museuemsystemobj.guide.get(i).getName())) {
					museuemsystemobj.guidesearch.add(museuemsystemobj.guide.get(i));

				}
			}
			if (museuemsystemobj.guidesearch.isEmpty()) {
				guide_inf.setText("Ther is not Guide have this name");
				return;
			}
			else
				guide_inf.setText("");
			for (Guide a : museuemsystemobj.guidesearch) {

				guide_inf.append("Guide Name :" + a.getName() + "\n" + "Guide Id :" + a.geteid() + "\n" + "Guide Birth date :"
						+ a.getDob() + "\n"+
						"Guide Hire Date "+a.getHireDate()+"\n"+
						"Maximum Number of Tour is : 9\n"+
						"Number of tours Performed This weak :"+a.gettoursPerDay()+
						"\n\n");
				// visitorinf.setText("hala");

			}
			museuemsystemobj.guidesearch.removeAll(museuemsystemobj.guidesearch);
			
		}
	//	listAvailabelGuide
	//	listAllGuide
		
		if(e.getSource()==listAvailabelGuide) {
			String daysel;
			MuseumWorkingDays enumday;
			daysel=comboBoxguideworkingdays.getSelectedItem().toString();
			enumday=MuseumWorkingDays.valueOf(daysel);
			for(int y=0;y<museuemsystemobj.guide.size();y++) {
				if(museuemsystemobj.guide.get(y).guideworkingday.contains(enumday)) {
					museuemsystemobj.Guidinformationselectedday.add(museuemsystemobj.guide.get(y));
				}
				
			}
			if (museuemsystemobj.Guidinformationselectedday.isEmpty()) {
				guide_inf.setText("Ther is not Guide Working this Day");
				return;
			}
			else
				guide_inf.setText("");
			guide_inf.append("a list of available Guide on "+daysel+" are :\n");
			for (Guide a : museuemsystemobj.Guidinformationselectedday) {

				guide_inf.append( a.name +" ," + a.geteid() +"\n"
						);
				// visitorinf.setText("hala");

			}
museuemsystemobj.Guidinformationselectedday.removeAll(museuemsystemobj.Guidinformationselectedday);
		}
		if(e.getSource()==listAllGuide) {
			String langsel;
			Languages enumlang;
			langsel=comboxlang.getSelectedItem().toString();
			enumlang=Languages.valueOf(langsel);
			for(int y=0;y<museuemsystemobj.guide.size();y++) {
				if(museuemsystemobj.guide.get(y).guidelang.contains(enumlang)) {
					museuemsystemobj.Guidinformationselectedlangua.add(museuemsystemobj.guide.get(y));
				}
				
			}
			if (museuemsystemobj.Guidinformationselectedlangua.isEmpty()) {
				guide_inf.setText("Ther is not Guide Talking This Language");
				return;
			}
			else
				guide_inf.setText("");
			guide_inf.append("a list of guide whose speak "+langsel +" is :\n");
			for (Guide a : museuemsystemobj.Guidinformationselectedlangua) {

				guide_inf.append(
				a.name + " ," + a.geteid() + "\n"  );
				// visitorinf.setText("hala");

			}
			museuemsystemobj.Guidinformationselectedlangua.removeAll(museuemsystemobj.Guidinformationselectedlangua);
		}
		
		
		if (e.getSource() == issutick) {
			int visitornu=0;
			String hala="";
			MuseumWorkingDays halaworkday;
			String visiname="";
			if (textf7.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Visitor ID ");
				return;
			}
			if (textf8.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Expected Visit Day ( Just from Musueam working Days) ");
				return;
			}
			else 
				visitornu=Integer.parseInt(textf7.getText());
			
			hala=textf8.getText();
			halaworkday=MuseumWorkingDays.valueOf(hala);
			if ((!da.isSelected())&&(!mo.isSelected())&&(!ye.isSelected())) {
				manageinf.setText("Pleas Select Ticket Type (Daily ,Monthly ,or yearly)");
				return;			
			}
			
			if(da.isSelected()) {
				
			 tT=ticketType.DAILY.toString();
			 ticketType=TicketType.valueOf(tT);
			for (int u=0;u<museuemsystemobj.SeniorVisitorList.size();u++) {
			if (visitornu==museuemsystemobj.SeniorVisitorList.get(u).getVID()) {
				visiname=museuemsystemobj.SeniorVisitorList.get(u).getName();
			
				
				
				visitorTicket.setprice(20);	
				
			}
			}
			for (int k=0;k<museuemsystemobj.RegularVisitorList.size();k++) {
				if( visitornu==museuemsystemobj.RegularVisitorList.get(k).getVID()) {
					visiname=museuemsystemobj.RegularVisitorList.get(k).getName();			
					visitorTicket.setprice(50);
					
				}
			}
				
			CounterDaily++;	
			}
			if(mo.isSelected()) {
				
				 tT=ticketType.MONTHLY.toString();
				 ticketType=TicketType.valueOf(tT);
					for (int u=0;u<museuemsystemobj.SeniorVisitorList.size();u++) {
					if (visitornu==museuemsystemobj.SeniorVisitorList.get(u).getVID()) {
						
						visiname=museuemsystemobj.SeniorVisitorList.get(u).getName();
						visitorTicket.setprice(100);
					}
					}
					for (int k=0;k<museuemsystemobj.RegularVisitorList.size();k++) {
						if( visitornu==museuemsystemobj.RegularVisitorList.get(k).getVID()) {
							
							visiname=museuemsystemobj.RegularVisitorList.get(k).getName();
							visitorTicket.setprice(150);
						}
					}
						
					
				
				
				
					ConterMonthly++;	
			}
			if(ye.isSelected()) {
				
				 tT=ticketType.YEARLY.toString();
				 ticketType=TicketType.valueOf(tT);
					for (int u=0;u<museuemsystemobj.SeniorVisitorList.size();u++) {
					if (visitornu==museuemsystemobj.SeniorVisitorList.get(u).getVID()) {
						
						visiname=museuemsystemobj.SeniorVisitorList.get(u).getName();
						visitorTicket.setprice(500);
					}
					}
					for (int k=0;k<museuemsystemobj.RegularVisitorList.size();k++) {
						if( visitornu==museuemsystemobj.RegularVisitorList.get(k).getVID()) {
							visiname=museuemsystemobj.RegularVisitorList.get(k).getName();
							visitorTicket.setprice(800);
							
						}
					}
						
					
					ConterYearly++;
			}
			if(yes.isSelected()) {
				String lanase;
				int pricewithguid;
				
				
				pricewithguid=visitorTicket.getprice()+70;
				String guidName;
				Languages la;
				lanase =lana.getSelectedItem().toString();
				guidName=lisa.getSelectedItem().toString();
				la=Languages.valueOf(lanase);
				for(int i=0;i<museuemsystemobj.guide.size();i++) {
					if(guidName.equalsIgnoreCase(museuemsystemobj.guide.get(i).getName())) {
						topd++;
						museuemsystemobj.guide.get(i).settoursPerDay(topd);
						
					}
				}
			 String sTR="Ticket information :\n"+"Visitor Name :"+visiname+"\n"+"Visits Day :"+hala
					 +"\n"+"With Guide "+guidName+" Whose Talking "+lanase+" Language \n"+"Ticket  Type :"+tT+"\n"+"Price :"+pricewithguid;
			 manageinf.setText(sTR);
			}
			else if (!yes.isSelected())
			{
			String sTR2="Ticket information :\n"+"Visitor Name :"+visiname+"\n"+"Visits Day :"+hala+"\n"
					 +""
					 + "Ticket  Type :"+tT+"\n"+"Price :"+visitorTicket.getprice();
			 manageinf.setText(sTR2);
			}
			
			if(visiname.equals("")) {
				manageinf.setText("This user is not exist in VisitorList ,Pleas add (him-her) then try again");
				
			}
		}
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int seniorcounter = 0;
		int regularcounter = 0;
		int bothcounter = 0;
		String cbstr = "";
		String sencstr = "";
		String regcstr = "";
		String stringday="";
		String stringmonth="";
		String stringyear="";
		// TODO Auto-generated method stub
		if (senior.isSelected() && reguler.isSelected()) {
			for (int i = 0; i < museuemsystemobj.SeniorVisitorList.size(); i++) {
				seniorcounter++;
			}
			for (int i = 0; i < museuemsystemobj.RegularVisitorList.size(); i++) {
				regularcounter++;
			}
			bothcounter = seniorcounter + regularcounter;
			cbstr = String.valueOf(bothcounter);
			tf1.setText(cbstr);
			// tf1.setText("10");
		} else if (senior.isSelected()) {
			for (int i = 0; i < museuemsystemobj.SeniorVisitorList.size(); i++) {
				seniorcounter++;
			}
			sencstr = String.valueOf(seniorcounter);
			tf1.setText(sencstr);
			// tf1.setText("4");
		}

		else if (reguler.isSelected()) {
			for (int i = 0; i < museuemsystemobj.RegularVisitorList.size(); i++) {
				regularcounter++;
			}
			regcstr = String.valueOf(regularcounter);
			tf1.setText(regcstr);
			// tf1.setText("6");
		}
		if (day.isSelected()) {
			stringday=String.valueOf(CounterDaily);
			tf3.setText(stringday);
		} else if (month.isSelected()) {
			stringmonth=String.valueOf(ConterMonthly);
			tf3.setText(stringmonth);
		
		} else if (year.isSelected()) {
			stringyear=String.valueOf(ConterYearly);
			tf3.setText(stringyear);
		}
//	 lisa.removeAllItems();
		else if (yes.isSelected()) {
			
			String op = "";
			MuseumWorkingDays muwoday;
			
			String guidlangu;
			Languages enumguid;
			guidlangu = lana.getSelectedItem().toString();
			enumguid = Languages.valueOf(guidlangu);
			ArrayList<String> a1 = new ArrayList<String>();
			if (textf8.getText().trim().isEmpty()) {
				manageinf.setText("Please Enter Expected Visit Day ( Just from Musueam working Days) ");
				return;
			}
			
			else 
				op = textf8.getText();
			muwoday = MuseumWorkingDays.valueOf(op);
//		 manageinf.setText(guidlangu);
if(flag==0) {
			for (int i = 0; i < museuemsystemobj.guide.size();i++) {
				if ((museuemsystemobj.guide.get(i).guideworkingday.contains(muwoday))
						&& (museuemsystemobj.guide.get(i).guidelang.contains(enumguid))) {
					a1.add(museuemsystemobj.guide.get(i).getName());
						
				
				}
			}
 for (String string : a1) {
	 flag=1;
	 lisa.addItem(string);
	
}
		}
		}
	}

	public static void main(String args[]) throws ParseException {
		mainFrame mf = new mainFrame();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mf.setVisible(true);

	}
}