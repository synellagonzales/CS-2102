import java.util.GregorianCalendar;
import java.util.LinkedList;

interface IWeather {
	//method that finds the average high temperature of a list of reports
	//for the given month and year
	double findAvgHigh(int month, int year);
	
	//method that finds the average low temperature of a list of reports
	//for the given month and year
	double findAvgLow(int month, int year);
	
	//method to add reports to a list of reports
	LinkedList<DailyWeatherReport> addReport(GregorianCalendar date, Readings low, Readings high);
}
