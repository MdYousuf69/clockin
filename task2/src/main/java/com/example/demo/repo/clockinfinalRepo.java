package com.example.demo.repo;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.clockinfinal;

@Repository
public interface clockinfinalRepo extends JpaRepository<clockinfinal, Long>{

 
 
 

	//List<clockinfinal> findAllByLoginAndLogout(String string, String string2);




	//List<clockinfinal> findAllByEmplyenoAndLogin(String emplyeno, Date datefrom);
	
   // @Query("SELECT * FROM clockin.clockinfinal WHERE login BETWEEN  :datefroms and  :dateto and logintime BETWEEN :timefrom and :timeto")

  //  List<clockinfinal> findAllByFromAndToDateAndTime(
	//		  @Param("datefroms") Date datefroms, @Param("dateto") Date dateto,@Param("timefrom") Time timefrom ,@Param("timeto")Time timeto );
 
 
/*	    @Query("SELECT * FROM clockin.clockinfinal WHERE login BETWEEN  :datefroms and  :dateto")

	    List<clockinfinal> findAllByLoginAndLogout(
	    		 		  @Param("datefroms") Date datefroms, @Param("dateto") Date dateto);
	    	 */
    List<clockinfinal> findByLoginBetween(Date start, Date end);

   // List<clockinfinal> findByLoginBetweenAndLogouttimeBetweenAndLogintimeBetween(Date start, Date end,Time tstart,Time tend,Time tistart,Time tiend );

	 
	List<clockinfinal> findByLoginBetweenAndLogintimeBetween(Date datefroms, Date dateto, Time timefrom, Time timeto);

	List<clockinfinal> findByLogin(Date datefroms);

	List<clockinfinal> findByLoginBetweenAndLogintimeBetweenOrderByEmplyenoAsc(Date datefroms, Date dateto,
			Time timefrom, Time timeto);

	List<clockinfinal> findAllByEmplyenoAndLogin(long empno1, Date datefrom);

	List<clockinfinal> findByLoginBetweenAndLogintimeBetweenOrderByLoginAsc(Date datefroms1, Date dateto1,
			Time timefrom1, Time timeto1);

 
}





