package com.example.demo.controller;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.clockInOut;
import com.example.demo.model.clockinfinal;
import com.example.demo.model.untitledc;
import com.example.demo.model.weeks;
import com.example.demo.repo.clockinfinalRepo;
import com.example.demo.repo.clockinrepo;
import com.example.demo.service.clockinservice;
@Controller
public class clockInOutc {
	@Autowired
	clockinrepo clockinrepo;
	@Autowired
	clockinservice clockinservice;
	@Autowired
	clockinfinalRepo clockinfinalRepo;
	
	
 	
	
	
	
	
		List<clockinfinal> clocks1=new  ArrayList<clockinfinal>();

	
	 List<clockInOut> clockInOut=new ArrayList<clockInOut>();
String start="";
String end="";
String timei="";
String timeo="";

	@RequestMapping(value = "/start")
	public String page(Model m) {
		
	 	List<weeks>  week	=clockinservice.weekclockin();
			m.addAttribute("week", week);
		
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
			  LocalTime in1 = LocalTime.parse("23:55:00");
		    LocalDate date = LocalDate.now();
 			 m.addAttribute("date", date.minusDays(1));
 			 m.addAttribute("date1", date.minusDays(1));
 			 m.addAttribute("time", in1.format(dtf));

 			 return"clockin";
	}
	@RequestMapping(value = "/table")
	public String table(Model m) {
		
 		m.addAttribute("clockInout", clocks1);


 			 return"pie";
	}
	
	
 
 	//@RequestMapping(value = "/clock")
 	@RequestMapping(value = "/clockin2", method = RequestMethod.POST)

	public String clock1(clockInOut date, Model m)   {
		 System.out.println("hi");
  		//LocalDate date2 = LocalDate.now();
		 m.addAttribute("date", date.getTo());
		 m.addAttribute("datefrom", date.getFrom());
		 m.addAttribute("time", date.getLogout());

		  Set<String> emp = new  HashSet<String>();    
		  Set<String> noofemp = new  LinkedHashSet<String>();  
 try {
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
	  	start=from.toString();
end=to.toString();
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
					 
				   int status=0;

					 clockInOut clockInout = new clockInOut();

  		List<untitledc>untitledc3=clockinrepo.findAllByEmployeenumberAndLogondate(empno,dat.toString());
  		 LocalTime workinghour = LocalTime.of(00,00,01);  
				 LocalTime outtf = LocalTime.of(00,00,01);  
				 LocalTime intf = LocalTime.of(00,00,01);  
				 LocalTime condition3 = LocalTime.of(23,59,01);  
				 LocalTime logoutt = LocalTime.of(00,00,01);  
				 LocalDate logindate = dat;  
				 LocalDate logoutdate = dat;  

				String comments="";
	   String name="";
	   String date1="";
	   String time1="";
  		int status2=2;
 		for(untitledc untitledc4:untitledc3 )
 		{ 		 

 			 //System.out.println(untitledc4.getEmployeenumber()+"d"+untitledc4.getLogondate()+"l"+untitledc4.getLogoffdate());
 			if(!untitledc4.getEmployeenumber().isEmpty()) {
  			 	String ss=untitledc4.getLogoffdate()+"null";
  				if(ss.equals("nullnull"))// null space
			 	 {
 				 		name=empno;
				 	//	status=1;
  				 		date1=untitledc4.getLogondate();
				 		time1=untitledc4.getLogontime();
				 	//	noofemp.add(name);
			 	 }

 				//else {

  			DateTimeFormatter dtff = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			 LocalDate outd = LocalDate.parse(untitledc4.getLogoffdate(), dtff);
			 LocalDate ind= LocalDate.parse(untitledc4.getLogondate(), dtff);
			 String v1=untitledc4.getLogofftime()+"1";
			 String v2=untitledc4.getLogontime()+"2";
   			if( v1.equals("null1") || v2.equals("null2")) {
   				status=1;
  			}
 			else {
 				timei=untitledc4.getLogontime();
 				timeo=untitledc4.getLogontime();
 		 	DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");
 			 LocalTime outt = LocalTime.parse(untitledc4.getLogofftime(), dt);
 			 LocalTime intt= LocalTime.parse(untitledc4.getLogontime(), dt);
 			
 		//	 System.out.println(intt +"o"+outt);
				status=0;

 			//	  System.out.println(untitledc4.getEmployeenumber()+"emp"+untitledc4.getLogondate()+"t="+intt+"s"+untitledc4.getLogoffdate());
			 		name=empno;

				///	comments="Shift completed";

 				 
 					 LocalTime updatedTime = LocalTime.of(00,00,01);
 					 
 				 if(intt.isAfter(intf)) {
  			 
  				status2=1;
 				 
 					 
 					 if(ind.isEqual(dat)&& intt.getHour()<=condition3.getHour() && intt.getMinute()<condition3.getMinute()) {
	 						logindate=ind;
	 						condition3=intt;
 
	 						//inc=condition3;
	 					  }
 					 
 					 
 					if(outd.isEqual(dat)|| outt.getHour()>=condition3.getHour() && outt.getMinute()>condition3.getMinute()) {
 						logoutdate=outd;
 						outtf=outt;
 
  						//inc=condition3;
 					  }
 					 
 					 
 					 if(ind.equals(outd)) {
	 						 

 						  long hours=outt.getHour()-intt.getHour();
 						long min=outt.getMinute() -intt.getMinute();
 		 						 
		 					   if(hours<0){
		 						hours= Math.abs(hours);
		 						}
		 						if(min<0) {
		 							min= Math.abs(min); 

		 						} 
		 						 
		 						if(hours!=0) {
		 						   updatedTime=updatedTime.plusHours(hours);
		 						 
		 						 
		 						   updatedTime=updatedTime.minusMinutes(min);
		 						 
 
		 					 
 		 						}
 					

		 						else {
			 						   updatedTime=updatedTime.plusHours(hours);

				 						   updatedTime=updatedTime.plusMinutes(min);
 
			 						}
 
			 						updatedTime =updatedTime;
				 					 	workinghour=workinghour.plusHours(updatedTime.getHour());
				 					 workinghour=workinghour.plusMinutes(updatedTime.getMinute());
 
		 					  
				 	 					intf=intt;
		 					   
		 					  }
 					 
 					 if(outd.isAfter(ind)) {
	 						 
	 						 
	 						 
	 						 
	 						 
	 						 
 						  
						  long hours=24-intt.getHour();
						 hours=hours+outt.getHour();
						long min=outt.getMinute() -intt.getMinute();
 	 						 
	 						
	 					   if(hours<0){
	 						hours= Math.abs(hours);
	 						}
	 						if(min<0) {
	 							min= Math.abs(min); 

	 						} 
	 						 
	 							if(hours!=0) {
	 						   updatedTime=updatedTime.plusHours(hours);
	 						}
		 						 if(min!=0) {
	 						   updatedTime=updatedTime.plusMinutes(min);
	 						}
	 						 
	 	 					intf=intt;
 					 }
	 						updatedTime =updatedTime;
	 					 
			 					 	workinghour=workinghour.plusHours(updatedTime.getHour());
		 					 workinghour=workinghour.plusMinutes(updatedTime.getMinute());
 		 						

 						 
 					
 					
 					
 					
 					
 					
 					
 					
 					 }
 					
 					 
 
  					 
 				 }
 				
 				 
 				 
 				 
 				 
					//  }

 				 
 				 
 				 
 				 
 				 
 				 

		 		//  System.out.println(untitledc4.getLogoffdate()+"notnull");
 
 			 }
 		
 			
		   }
		   ///	LocalTime timea = LocalTime.parse(time1, dtf);
//System.out.println(timea);
 
     		if(status2==1) {
     		//	System.out.println("2");
     			// if(condition3.getHour()>=in1.getHour() && condition3.getMinute() >= in1.getMinute() && outtf.getHour() <= out.getHour() && outtf.getMinute() <= out.getMinute()) {
  //	 System.out.println(condition3+"tt"+outtf);
     			if(condition3.isAfter(in1) &&condition3.isBefore(out) &&outtf.isAfter(in1)&& outtf.isBefore(out)) {
      			
  	 	//	System.out.println("3");
			 		noofemp.add(name);

  		 clockInout.setEmplyeno(name);
 		//	System.out.println(name);
 		records++;
 	 		// System.out.println(logindate+"t"+condition3);
 	 	 	clockInout.setLogin(logindate+" "+" "+condition3.format(dtf));
 	 		//System.out.println(logoutdate+"t"+outtf);
 	 	 	clockInout.setLogout(logoutdate+" "+" "+outtf.format(dtf));
 	 	//	clockInout.setSno(records+"");


 			// System.out.println(workinghour+"working houres");
 			 clockInout.setHours(workinghour.toString());
 			// System.out.println(comments);
 			 clockInout.setComments("Shift done");
 			 clockInOut.add(clockInout);
    			}
 		  }
 		
 		if(status==1) {
 		//	if(timea.isAfter(in1)) {
 			records++;
 	 	//	System.out.println("3");

 	 		 clockInout.setEmplyeno(name);
 	 		noofemp.add(name);

 	 			//System.out.println(name);
 	 	//	clockInout.setSno(records+"");
 	 	 		// System.out.println(date1+"t"+time1);
 	 	 	 	clockInout.setLogin(date1+" "+" "+time1);
  	 	  	clockInout.setLogout("-:-");
 	 		

  	 			 clockInout.setHours("-");
 	 			// System.out.println(comments);
 	 			 clockInout.setComments("Shift not yet done..");
 	 		
 	 		 clockInOut.add(clockInout);
 	 		//}
 		}
	   }	
		   m.addAttribute("clockInout", clockInOut);
			 m.addAttribute("records", records);
			 m.addAttribute("noofemp", noofemp.size());
 	   }
	 
 
}
catch (Exception e) {
	// TODO: handle exception
}
 		 
	 
	 
 		return"clockin";
	}
	
	
	
	
	
	
 	 Date Datefroms1=Date.valueOf("1777-02-27");
	  Date Dateto1=Date.valueOf("1777-02-27");
			Time Timefrom1=Time.valueOf("00:00:00") ;
			Time Timeto1=Time.valueOf( "00:00:00");
	
 	
 	
 	  

 	String noemp="";
 	String statuss="2";

 	@RequestMapping(value = "/clockin", method = RequestMethod.POST)

	public String clock(clockInOut date, Model m) {
 	

	 		Set<Long> emp = new  HashSet<Long>();    
 	 		List<weeks>  week	=clockinservice.weekclockin();
 			m.addAttribute("week", week);
	 	 
	 			
 		
 		
  		
	 	 DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm");
		  Date Datefroms=Date.valueOf(date.getFrom().toString());
		  Datefroms1=Datefroms;
 			  Date Dateto=Date.valueOf(date.getTo().toString());
 			 Dateto1=Dateto;
 	 			Time Timefrom=Time.valueOf(date.getTimein()+":09") ;
 	 			Timefrom1=Timefrom;
 	 			Time Timeto=Time.valueOf(date.getTimeout()+":09");
 	 			Timeto1=Timeto;
 	 		 	date.setComments("1");
 	 		 	
	 		 	
 	 		 	
 	
   clocks1=clockinfinalRepo.findByLoginBetweenAndLogintimeBetween(Datefroms,Dateto,Timefrom,Timeto);
 	for(clockinfinal clockinfinal:clocks1) {
 			emp.add(clockinfinal.getEmplyeno());
 	}
 	statuss="1";
 	
 		
 		
 		 
 		
 		
 		
 		 
 		
 		
  	if(clocks1.isEmpty()) {
 			System.out.println("in");
 	List<clockInOut> clocks=clockinservice.clockservice(date, m);
 		for(clockInOut clockInOut:clocks) {
 	 		long empno1=Long.parseLong(clockInOut.getEmplyeno());  
 
 	 	emp.add(empno1);
 		 	Date Datefrom= Date.valueOf(clockInOut.getLogin());

 	 	List<clockinfinal> clockinfinal1=	clockinfinalRepo.findAllByEmplyenoAndLogin(empno1,Datefrom);
 	
   if(clockinfinal1.isEmpty()) {
  			clockinfinal clockinfinal=new clockinfinal();
 			clockinfinal.setComments(clockInOut.getComments());
		 		long empno=Long.parseLong(clockInOut.getEmplyeno());  

 			clockinfinal.setEmplyeno(empno);
 			clockinfinal.setHours(clockInOut.getHours());
 			  Date Datein=Date.valueOf(clockInOut.getLogin());
 		 	//Date Dateout= Date.valueOf("2022-10-01");
 		// 	System.out.println(Datein);
 			clockinfinal.setLogin(Datein);
 		 	if(clockInOut.getComments().equals("Shift done")) {

			  Date Dateout=Date.valueOf(clockInOut.getLogout());
	 			Time Timeout=Time.valueOf(clockInOut.getTimeout()+":09");
	 			clockinfinal.setLogouttime(Timeout);

 			clockinfinal.setLogout(Dateout);
 		 	}
 			String dat=clockInOut.getTimein()+":09";
 		  if(!dat.equals("null:09")) {  
 			Time Timein=Time.valueOf(clockInOut.getTimein()+":09") ;
  		//	System.out.println(Timein);
 			clockinfinal.setLogintime(Timein);}
  		//	System.out.println(Timeout);

 			clockinfinalRepo.save(clockinfinal);
 		 	clocks1=clockinfinalRepo.findByLoginBetweenAndLogintimeBetween(Datefroms,Dateto,Timefrom,Timeto);

 	 }
 		}
 		} 
	 m.addAttribute("datefrom", date.getFrom());
		 m.addAttribute("date1", date.getTo());
		 m.addAttribute("time", date.getTimeout());


	 	 
 		 LocalDate dates = LocalDate.now();
 		 dates=dates.minusDays(1);
 		 m.addAttribute("date", dates );

		 statuss="1";
	 		m.addAttribute("clockInout", clocks1);
	 		noemp=emp.size()+"";
  		m.addAttribute("clockInout", clocks1);
	 	 m.addAttribute("records", clocks1.size());
		  m.addAttribute("noofemp", emp.size());
	 	
 		return "clockin" ;
 	}

	
	
 	LocalTime datetime1=LocalTime.now();

 	
 	
 	
	
 	@RequestMapping(value = "/result")
	public String result(Model m)  {
 		clockInOut date= new clockInOut();
			DateTimeFormatter dtff = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
LocalDateTime datetime=LocalDateTime.now();
 
  // String str="2022-11-23";  
   long millis=System.currentTimeMillis();  
   Date Date1= new  Date(millis);
 //  Date Date1=  Date.valueOf(str);
        		   m.addAttribute("start", Date1);
        	 	date.setFrom(Date1);
        	 	date.setTo(Date1);
        		//date.setLoginIn(start);
           	//	date.setLogOut(end);
         	date.setLogout(datetime.toLocalDate().plusDays(1).format(dtff));
           		date.setTimeout(datetime.toLocalTime().format(dtf));
       		date.setTimein(datetime.toLocalTime().of(00,01).format(dtf));
       		date.setComments("1");
        		int minutesUnit = 30;
       		LocalTime startTime = LocalTime.of(1, 0);
       		LocalTime endTime = LocalTime.of(00, 0);
       		Duration duration = Duration.between(startTime, endTime);
       		long unitsCount = duration.toMinutes() / minutesUnit;
         		
       		
       //save 		clockservice2
 
       	 List<clockInOut> clocks=	clockinservice.clockservice(date, m); 	
 	 	m.addAttribute("clockInout", clocks);

 	 	
 	 	LocalDate dates = LocalDate.now();
 		dates=dates.minusDays(1);
		 m.addAttribute("date", dates);
 	 	
 	 	 
 	 	
 	 	
 	 	
 	 	
 	 	
 	 	
        	 	if(datetime.toLocalTime().getHour()>=datetime1.getHour() && datetime.toLocalTime().getMinute()>=datetime1.getMinute() ) {
         	       	// List<clockInOut> clocks=	clockinservice.clockservice(date, m); 	
 clockInOut date1= new clockInOut();
date1.setFrom(Date1);
date1.setTo(Date1);
//date.setLoginIn(start);
//	date.setLogOut(end);
 date1.setLogout(datetime.toLocalDate().plusDays(1).format(dtff));
date1.setTimeout(datetime.toLocalTime().format(dtf));
date1.setTimein(datetime.toLocalTime().of(00,01).format(dtf));
 date1.setComments("1");

	 List<clockInOut> clockss=	clockinservice.clockservice(date1, m); 	

        	  	for(clockInOut clocks1:clockss) {
      			  Date Datein=Date.valueOf(clocks1.getLogin());
  		 		long emp=Long.parseLong(clocks1.getEmplyeno());  

        	 		List<clockinfinal> clockinfinal1=	clockinfinalRepo.findAllByEmplyenoAndLogin(emp,Datein);
if(clockinfinal1.isEmpty()) {
          	  			clockinfinal clockinfinal=new clockinfinal();
        	 			clockinfinal.setComments(clocks1.getComments());
        		 		long empno1=Long.parseLong(clocks1.getEmplyeno());  

        	 			clockinfinal.setEmplyeno(empno1);
        	 			clockinfinal.setHours(clocks1.getHours());
            			  Date Dateind=Date.valueOf(clocks1.getLogin());
            			
        	 		 	clockinfinal.setLogin(Dateind);
         	 		 	if(clocks1.getComments().equals("Shift done")) {
          			  Date Dateout=Date.valueOf(clocks1.getLogout());
          			 
          			  String dat=clocks1.getTimeout()+":09";
          			  
           			  if(!dat.equals("null:09")) {
      	 			Time Timeout=Time.valueOf(clocks1.getTimeout()+":09");
      			  clockinfinal.setLogouttime(Timeout);
          			  }
         	 		 clockinfinal.setLogout(Dateout);
        	 		 	}
            			  String dat1=clocks1.getTimeout()+":09";
 
         	 		  if(!dat1.equals("null:09")) {
        	 			Time Timein=Time.valueOf(clocks1.getTimein()+":09");
        	 		 
        	 		  clockinfinal.setLogintime(Timein);
         	 		  }
        	 			clockinfinalRepo.save(clockinfinal);
 

}
else {
        	 			for (clockinfinal clockinfinals:clockinfinal1) {
 
        	 				clockinfinals.setComments(clocks1.getComments());
            		 		long empno1=Long.parseLong(clocks1.getEmplyeno());  

        	 				clockinfinals.setEmplyeno(empno1);
        	 				clockinfinals.setHours(clocks1.getHours());
        	 				
        	 				  Date Dateind=Date.valueOf(clocks1.getLogin());
                  			
        	 				 clockinfinals.setLogin(Dateind);
             	 		 	if(clocks1.getComments().equals("Shift done")) {

        	 				 Date Dateout=Date.valueOf(clocks1.getLogout());
        	 					Time Timeout=Time.valueOf(clocks1.getTimeout()+":09");
            	 			clockinfinals.setLogouttime(Timeout);

        	 				clockinfinals.setLogout(Dateout);
             	 		 	}
                	 		String datt=clocks1.getTimein()+":09";
               	 		if(!datt.equals("null:09")) {
                	 			Time Timein=Time.valueOf(clocks1.getTimein()+":09");

                	 		 
                	 			clockinfinals.setLogintime(Timein);
            	 	 	
               	 		}
               	 		
            	 	 	
            	 			clockinfinalRepo.save(clockinfinals);
 
}}
        	 	} 
        	  	datetime1=datetime1.plusMinutes(10);
        	 		System.out.println(datetime1);
        	 	} 


 		return"result";
	}



 
 	 

 	@RequestMapping(value = "/weeks")
	public String week(Model m )  {
 		
 		 List<weeks>  week	=clockinservice.weekclockin();
			m.addAttribute("week", week);
	return "clockin";
	
	 
 	}
 	
 	@RequestMapping(value = "/short/{shorting}" ,method =RequestMethod.GET)
	public String shorting( @PathVariable String shorting, Model m )  {
 		System.out.println(shorting);
 		 List<weeks>  week	=clockinservice.weekclockin();
			m.addAttribute("week", week);
		
 		List<clockinfinal> clocks1=new  ArrayList<clockinfinal>();
 		System.out.println(Datefroms1+"f"+Dateto1+"t"+Timefrom1+"f"+Timeto1);
 		 
 		
 	 

 	 		
 			clocks1= clockinfinalRepo.findAll();
 		 
 		

 		
 		 LocalDate dates = LocalDate.now();
 		 dates=dates.minusDays(1);
 		 m.addAttribute("date1",Dateto1);
 		 m.addAttribute("date", dates );

		 m.addAttribute("datefrom", Datefroms1);
		 m.addAttribute("time", Timefrom1);

	 		 
 		m.addAttribute("clockInout", clocks1);
	 	 m.addAttribute("records", clocks1.size());
		  m.addAttribute("noofemp",noemp);
 		
 	 
 	return "clockin";
	
	 
 	}
	
	 
	
	
	}
