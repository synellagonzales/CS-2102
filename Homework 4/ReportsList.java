import java.util.GregorianCalendar;
import java.util.LinkedList;

class ReportsList implements IWeather {
	private LinkedList<DailyWeatherReport> reports;
	
	ReportsList(){
		this.reports = new LinkedList<DailyWeatherReport>();
	}
	
	/*finds the average high by iterating through the
	 * list of DailyWeatherReports
	 * checking the dates
	 * accessing the high temperatures for each element
	 * and averaging them out
	 */
	public double findAvgHigh(int month, int year) {
		int days = 0;
		int total = 0;
		
		for(DailyWeatherReport x : reports) {

			if(x.getMonth() == month){
				if (x.getYear() == year) {
					days++;
					total = total + x.getHigh();
				}
			}
		}
		return (total/days);
	}
	
	/*finds the average low by iterating through the
	 * list of DailyWeatherReports
	 * checking the dates
	 * accessing the low temperatures for each element
	 * and averaging them out
	 */
	public double findAvgLow(int month, int year) {
		int days = 0;
		int total = 0;
		
		for(DailyWeatherReport x : reports) {
			if(x.getMonth() == month && x.getYear() == year) {
				days++;
				total = total + x.getLow();
			}
		}
		
		return (total/days);
	}
	

	//method to add a report to a this's list of DailyWeatherReports
	public LinkedList<DailyWeatherReport> addReport(GregorianCalendar date, Readings low, Readings high) {
		DailyWeatherReport newReport = new DailyWeatherReport(date, low, high);
		
		//adding newReport to the field
		//LinkedList<DailyWeatherReport> reports
		this.reports.add(newReport);
		
		return this.reports;
	}
	
}
