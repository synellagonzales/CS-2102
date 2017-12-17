import java.util.GregorianCalendar;
import java.util.LinkedList;

/*
 * Reminder: hackers have access to this object. They can access the fields within this object:
 * 	IWeather reports
 */

class WeatherMonitor {
	IWeather reports;
	
	WeatherMonitor(IWeather reports){
		this.reports = reports;
	}
	
	//returns the average high temp for the
	//entirety of the month specified
	double averageHighForMonth(int month, int year) {
		return reports.findAvgHigh(month, year);
	}
	
	//returns the average low temp for the
	//entirety of the month specified
	double averageLowForMonth(int month, int year) {
		return reports.findAvgLow(month, year);
	}
	
	//adds a DailyReport to the WeatherMonitor's list of reports
	public IWeather addDailyReport(GregorianCalendar date, LinkedList<Readings> readingsList) {
		//initiate time as 0;
		Time zero = new Time(0,0);
		//initiate readings as 0;
		Readings high = new Readings(zero, 0);
		Readings low = new Readings(zero, 0);
		//initiate to true to set variables
		//when looping begins
		boolean first = true;
		
		for(Readings x : readingsList) {
			if(first == true) {
				high = x;
				low = x;
				first = false;
			}
			else if(high.getTemp() < x.getTemp()) {
				high = x;
			}
			else if(low.getTemp() > x.getTemp()) {
				low = x;
			}
		}
		
		//adding the report with the inputed
		//date, record High, and record Low
		this.reports.addReport(date, low, high);

		return this.reports;
		
	}
}
