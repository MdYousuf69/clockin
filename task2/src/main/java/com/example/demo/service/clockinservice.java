package com.example.demo.service;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.model.clockInOut;
import com.example.demo.model.clockinfinal;
import com.example.demo.model.untitledc;
import com.example.demo.model.weeks;
import com.example.demo.repo.clockinfinalRepo;
import com.example.demo.repo.clockinrepo;

@Service
public class clockinservice {
	
	@Autowired
	clockinrepo clockinrepo;
	
	@Autowired
	clockinfinalRepo clockinfinalRepo;

	public List<clockInOut> clockservice(clockInOut date, Model m)   {
  		LocalDate date2 = LocalDate.now();
 		 List<clockInOut> clockInOut=new ArrayList<clockInOut>();
try {
		 m.addAttribute("date", date2);
		  Set<String> emp = new  HashSet<String>();    
		  Set<String> noofemp = new  LinkedHashSet<String>();  
 
		List<untitledc>untitledc=clockinrepo.findAll();
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		  LocalTime in1 = LocalTime.parse(date.getTimein(), dtf);
		  LocalTime out= LocalTime.parse(date.getTimeout(), dtf);
		  
		  in1=in1.plusMinutes(1);
		  out=out.plusMinutes(1);
		  int records=0;
	 for(untitledc untitledc1:untitledc) {
			emp.add(untitledc1.getEmployeenumber());
	 }
	// String no="8485";
	 	LocalDate from = date.getFrom().toLocalDate(); 
	  	LocalDate to =  date.getTo().toLocalDate();  
 
		    LocalDate to1 = to.plusDays(1);
		   LocalDate from1 = from.minusDays(1);
int days= (int) Math.abs(Duration.between(to1.atStartOfDay(), from1.atStartOfDay()).toDays()); // another option


days=days-1;
 


		 
	   for(String empno:emp) {
			 LocalDate dat = from;// LocalDate.parse("2022-10-07");
		   for(int l=0;l<days;l++) {
				  if(l>=1) {
				 dat= dat.plusDays(1);
						}	
			// System.out.println(dat);
				  ArrayList<String> time = new ArrayList<String>();
 				  ArrayList<String> out1 = new ArrayList<String>();

				   int status=0;
				 	DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");

					 clockInOut clockInout = new clockInOut();

 		List<untitledc> untitledc3 =clockinrepo.findAllByEmployeenumberAndLogondate(empno,dat.toString());
 		
 
 		LocalTime workinghour = LocalTime.of(00,00,01);  
				 LocalTime outtf = LocalTime.of(00,00,01);  
				 LocalTime intf = LocalTime.of(23,58,01);  
				 LocalTime condition3 = LocalTime.of(23,58,01);
				 LocalTime condition2 = LocalTime.of(00,00,01);

				 LocalTime logoutt = LocalTime.of(00,00,01);  
				 LocalDate logindate = dat;  
				 LocalDate logoutdate = dat;  
 				String comments="";
	   String name="";
	   String date1="";
	   String time1="";
 		int status2=0;
		for(untitledc untitledc4:untitledc3 )
		{ 		  


 			if(!untitledc4.getEmployeenumber().isEmpty()) {
 			 	String ss=untitledc4.getLogoffdate()+"null";
 
 				if(ss.equals("nullnull"))// null space
			 	 {
 					String comment="1"+date.getComments();
  					 if(comment.equals("11")) {
 					  status2=2;
 					
				 		name=empno;
 				 		date1=untitledc4.getLogondate();
  				 		String n=untitledc4.getLogontime()+"1";
  if(!n.equals("null1")) {
		time1=untitledc4.getLogontime().formatted(dtf);

}  
 					 }
				 	//	noofemp.add(name);
			 	 }
 				else {
 			DateTimeFormatter dtff = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			 LocalDate outd = LocalDate.parse(untitledc4.getLogoffdate(), dtff);
			 LocalDate ind= LocalDate.parse(untitledc4.getLogondate(), dtff);
			 String v1=untitledc4.getLogofftime()+"1";
			 String v2=untitledc4.getLogontime()+"2";
   			if( v1.equals("null1") || v2.equals("null2")) {
  			 	//status2=2;
System.out.println(v2);
   			}
			else {
				status=0;
 
			 
		 //	DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");
			 LocalTime outt = LocalTime.parse(untitledc4.getLogofftime(), dt);
			 LocalTime intt= LocalTime.parse(untitledc4.getLogontime(), dt);
			
 			 
 			 		name=empno;

 				 
					 LocalTime updatedTime = LocalTime.of(00,00,01);
					 
					 
 
					 time.add(intt.toString());
					 out1.add(outt.toString());
					/// System.out.println(empno);
					// System.out.println(intt);
					// System.out.println(outt);
   if(intt.isBefore(condition3)) {
	  status2=1;
 	 condition3=intt;
 
 }
								  if(ind.isEqual(dat)) {
 

                                   logindate=ind;
 				 					  }
 
 									 if(outt.isAfter(outtf) ) {
				 						outtf=outt;
				 
 				 					  }
								 
								  if(outd.isEqual(dat)||outd.isAfter(dat)) {
									  logoutdate=outd;
								  }
 
			 					 
							 }
 
  				 }
						 }
 			
 			
 			
 			
 					   }
		long hourss=0;
	//  System.out.println(empno);
	  Collections.sort(time);
	  Collections.sort(out1);
		 // System.out.println(time);
   //    System.out.println(out1);
		 LocalTime intime1 = LocalTime.of(00,00,01);
		 LocalTime intime = LocalTime.of(00,00,01);

		 LocalTime outtime = LocalTime.of(00,00,01);
		 LocalTime hours = LocalTime.of(00,00,01);
// System.out.println(name);
		  for(int i=0;i<time.size();i++) {
			  LocalTime intime2 = LocalTime.parse(time.get(i), dtf);
			  LocalTime outtime2= LocalTime.parse(out1.get(i), dtf);
			//  System.out.println(intime+"in");
 			 if(intime2.getHour() >= intime.getHour()) {
 				// System.out.println(intime2+"intime");
 				// System.out.println(intime2+"inuot"+outtime2);
				// System.out.println(outtime2.getHour()+" time"+intime2.getHour());
				 hourss=outtime2.getHour()-intime2.getHour();
				 long min=outtime2.getMinute()-intime2.getMinute();
				 intime=intime.of(outtime2.getHour(), outtime2.getMinute());
				// System.out.println(intime +"outtime");
			 intime1= intime1.plusHours(hourss);
			 	 intime1=intime1.plusMinutes(min);
			//	 System.out.println(hourss);

			//	 System.out.println(intime1+"fi");
			 }else {
				
			}
 		 } 
 		// System.out.println(intime1+"timeend");
		 

		if(status2==1) {
		 
			if(condition3.isAfter(in1) &&condition3.isBefore(out) &&outtf.isAfter(in1)&& outtf.isBefore(out)) {
 			
 		 		noofemp.add(name);
 		 		//workinghour=outtf;
 		 	//	workinghour=workinghour.minusHours(condition3.getHour());
 			//	 workinghour=workinghour.minusMinutes(condition3.getMinute());
		 clockInout.setEmplyeno(name);
 	records++;

  	 	clockInout.setLogin(logindate.toString());
  	 	clockInout.setTimein(condition3.format(dtf));
  	 	clockInout.setLogout(logoutdate.toString());
  	 	clockInout.setTimeout(outtf.format(dtf));
 	//	clockInout.setSno(records+"");
 		

 		 clockInout.setHours(intime1.format(dt));
 		 clockInout.setComments("Shift done");
		 clockInOut.add(clockInout);
			}
	  }
	if(status2==2) {
 		records++;
 
 		 clockInout.setEmplyeno(name);
 		noofemp.add(name);

  	//	clockInout.setSno(records+"time1");
  	 	 	clockInout.setLogin(date1);
  	 	  if(!condition3.equals(intf)) {
   	  	 	clockInout.setTimein(condition3.format(dtf));
  		 	System.out.println(name);
  	 	  }
	 	  	 //clockInout.setLogout();
  	  	 	System.out.println(condition3);


	 			 clockInout.setHours("-");
  			 clockInout.setComments("Shift not yet done..");
 		
 		 clockInOut.add(clockInout);
 		//}
	}
 				   }	
					//   m.addAttribute("clockInout", clockInOut);
						// m.addAttribute("records", records);
						// m.addAttribute("noofemp", noofemp.size());
				   }
				 
}catch (Exception e) {
	// TODO: handle exception
	System.out.println("null");
}
			  
				 
					return clockInOut;
				}
				
					 


	
	
	
	
	 
	public List<untitledc> clockservice2(clockInOut date, Model m)   {
		  Set<String> emp = new  HashSet<String>();    

		
		List<untitledc>untitledc=clockinrepo.findAll();
		for(untitledc untitledc1:untitledc) {
			emp.add(untitledc1.getEmployeenumber());
	 }
 		List<untitledc> untitledc3=new ArrayList<untitledc>();  
		for(String empno:emp) {
 		 untitledc3=clockinrepo.findAllByEmployeenumberAndLogondate(empno,date.getFrom().toString());
		
		}
	 
	 
		return untitledc3;
	}
	
	
	 
	public  List<weeks> weekclockin()   {
		  DateTimeFormatter dtff = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			 LocalDate outd = LocalDate.now();
		 
			   List<weeks> noofemployee = new ArrayList<weeks>();
			    String[] dayss= new String[7];
			    dayss[0]= "Monday"; 
			      
			    
			    dayss[1]= "Tuesday";  
			    dayss[2]= "Wednesday";  
			    dayss[3]= "Thursday";  
			    dayss[4]= "Friday";  
			    dayss[5]= "Saturday";  
			    dayss[6]= "Sunday";
			    
  			 long millis=System.currentTimeMillis();  
		  Date Datefroms= new  Date(millis);
			int day=  Datefroms.getDay();
 			long days=6+1+day;
			outd=outd.minusDays(days);
		// 	System.out.println(day+"day");
			
		///	System.out.println(days+"week");

// System.out.println(outd+"date");
 
 for(int i=0; i<7 ;i++) {
outd=outd.plusDays(1);
Date Datefrom=Date.valueOf(outd.toString());
	 
//System.out.println(Datefrom);
	  	List<clockinfinal> clocks1=clockinfinalRepo.findByLogin(Datefrom);
	  	//System.out.println(dayss[i]);
	  //	System.out.println(clocks1.size());
	  	
	  	
	  	weeks weeks=new weeks();
	  	weeks.setDays(dayss[i]);
	  	
	  	weeks.setNoofemploye(clocks1.size());
	  	noofemployee.add(weeks);
	  	 
 } 
		
 		
	
		 return noofemployee;
	}
	
	
	
	
	
	
	 
	
	
	
	
	

}
