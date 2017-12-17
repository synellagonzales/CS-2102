/*
 * HW 5 - Gia Ly Hill (glhill) and Synella Gonzales (sgonzales)
 */

import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Examples {

	public Examples(){}

	//times - hrs, minutes
	Time morning = new Time(3, 52);
	Time noon = new Time(12, 45);
	Time night = new Time(7, 9); //7:09
	
	//readings of times, temps
	Readings reading1 = new Readings(morning, 50);
	Readings reading2 = new Readings(noon, 68);
	Readings reading3 = new Readings(night, 60);
	
	Readings reading4 = new Readings(morning, 20);
	Readings reading5 = new Readings(noon, 30);
	Readings reading6 = new Readings(night, 40);
	
	//dates
	GregorianCalendar d1 = new GregorianCalendar(2017, 10, 12);
	GregorianCalendar d2 = new GregorianCalendar(2017, 11, 24);
	GregorianCalendar d3 = new GregorianCalendar(2017, 11, 25);
	GregorianCalendar d4 = new GregorianCalendar(2017, 11, 26);
	GregorianCalendar d5 = new GregorianCalendar(2017, 11, 27);
	GregorianCalendar d6 = new GregorianCalendar(2017, 11, 27);
	GregorianCalendar d7 = new GregorianCalendar(2016, 10, 15);

	//readings
	LinkedList<Readings> readingsList = new LinkedList<Readings>();
	LinkedList<Readings> readingsList2 = new LinkedList<Readings>();
	LinkedList<Readings> novemberReadings = new LinkedList<Readings>();
	
	//initiating Weather Monitor objects
	WeatherMonitor m1 = new WeatherMonitor(new ReportsList());
	WeatherMonitor m2 = new WeatherMonitor(new ReportsList());
	WeatherMonitor m3 = new WeatherMonitor(new ReportsList());
	
	@Before
	public void Setup() {
		
		/*
		 * readingsList is as follows:
		 * 	50 < High
		 * 	20 < Low
		 * 	30
		 * 	40
		 */
		readingsList.add(reading1);
		readingsList.add(reading4);
		readingsList.add(reading5);
		readingsList.add(reading6);
		
		/*
		 * readingsList2 is as follows:
		 * 	68 < High
		 * 	60
		 * 	20 < Low 
		 * 
		 */
		readingsList2.add(reading2);
		readingsList2.add(reading3);
		readingsList2.add(reading4);
		
		/*
		 * novemberReadings is as follows:
		 * 	20 < Low
		 * 	30
		 * 	40 < High
		 * 	20
		 * 	30
		 * 	40 

		 */
		novemberReadings.add(reading4);
		novemberReadings.add(reading5);
		novemberReadings.add(reading6);
		novemberReadings.add(reading4);
		novemberReadings.add(reading5);
		novemberReadings.add(reading6);

		/*
		 * m1 is a WeatherMonitor
		 * that only monitored one day:
		 * 10-12-2017
		 * and only has the readings:
		 * 	from readingList:
		 * 	50
		 * 	20 < Low
		 * 	30
		 * 	40
		 * 	68 < High
		 * 	60
		 * 	20
		 * 
		 */
		m1.addDailyReport(d1, readingsList);
		m1.addDailyReport(d1, readingsList2);
		
		/*
		 * m2 is a WeatherMonitor
		 * that monitored
		 * 	10-12-2017 had the readings:
		 * 		50 < High
		 * 		20 < Low
		 * 		30
		 * 		40
		 * 			
		 * 10-12-2016 had the readings:
		 * 		68 < High
		 * 		60
		 * 		20 < Low
		 */
		m2.addDailyReport(d1, readingsList);
		m2.addDailyReport(d7, readingsList2);
		
		/*
		 * m3 is a WeatherMonitor
		 * that monitored
		 * 	d1 10-12-2017 had the readings:
		 * 		50 < High
		 * 		20 < Low
		 * 		30
		 * 		40
		 * 		
		 * 	d2 11-24-2017 had the readings:
		 * 		20 < Low
		 * 		30
		 * 		40 < High
		 * 		20
		 * 		30
		 * 		40
		 * 
		 *  d3 11-25-2017 had the readings:
		 * 		50 < High
		 * 		20 < Low
		 * 		30
		 * 		40
		 *  
		 *  d4 11-26-2017 had the readings:
		 *	 	20 < Low
		 * 		30
		 * 		40 < High
		 * 		20
		 * 		30
		 * 		40 
		 * 
		 *  d5 & d6 11-27-2017 had the same readings:
		 * 		68 < High
		 * 		60
		 * 		20 < Low
		 * 
		 * High for nov should be: (40 + 50 + 40 + 68 + 68)/5 = 53
		 * Low for nov should be: (20 + 20 + 20 + 20 + 20)/5 = 20
		 *
		 */
		
		m3.addDailyReport(d1, readingsList);
		m3.addDailyReport(d2, novemberReadings);
		m3.addDailyReport(d3, readingsList);
		m3.addDailyReport(d4, novemberReadings);
		m3.addDailyReport(d5, readingsList2);
		m3.addDailyReport(d6, readingsList2);

	}
	
	/*
	 * Testing averageHighForMonth()
	 * Should average the readings for 10/2017
	 * Testing for the same month, same day
	 */
	@Test
	public void testHighSameMonth() {
		assertEquals(59.0, m1.averageHighForMonth(10, 2017), 0.01);
	}
	
	/*
	 * Testing averageHighForMonth()
	 * Should average the readings for 10/2017
	 * Testing for the same month
	 * but different years
	 * Should only try to average the readings for 10/2017,
	 * resulting in 50
	 */
	@Test
	public void testHighDiffYear() {
		assertEquals(50, m2.averageHighForMonth(10, 2017), 0.1);
	}
	
	/*
	 * Testing averageHighForMonth()
	 * Should average the readings for 11/2017
	 * Testing for the same month
	 */
	@Test
	public void testHighNov() {
		assertEquals(53.0, m3.averageHighForMonth(11, 2017), 0.1);
	}
	
	/*
	 * Testing averageHighForMonth()
	 * Should average the readings for 10/2017
	 * Testing for the same month, same day
	 */
	@Test
	public void testLowSameMonth() {
		assertEquals(20, m1.averageLowForMonth(10, 2017), 0.1);
	}
	
	/*
	 * Testing averageLowForMonth()
	 * Should average the readings for 10/2017
	 * Testing for the same month
	 * but different years
	 * Should only try to average the readings for 10/2017,
	 * resulting in 20
	 */
	@Test
	public void testLowDiffYear() {
		assertEquals(20, m2.averageLowForMonth(10, 2017), 0.1);
	}
	
	/*
	 * Testing averageLowForMonth()
	 * Should average the readings for 11/2017
	 * Testing for the same month
	 * resulting in 20
	 */
	@Test
	public void testLowNov() {
		assertEquals(20, m3.averageLowForMonth(11, 2017), 0.1);
	}
	
	/* ===========================================================
	 * NOTE: Here is where we /would/ have checked for
	 * cases where the month/year/etc. being searched for
	 * do not exist in the list, however this gives a 
	 * divide by zero error, which makes it hard to test for
	 * ===========================================================
	 */
}
