import java.util.GregorianCalendar;

class DailyWeatherReport {
	private GregorianCalendar date;
	private Readings low;
	private Readings high;
	
	DailyWeatherReport(GregorianCalendar date, Readings low, Readings high){
		this.date = date;
		this.low = low;
		this.high = high;
	}
	
	//method to access the private field "low"
	public int getLow() {
		return this.low.getTemp();
	}
	
	//method to access private field "high"
	public int getHigh() {
		return this.high.getTemp();
	}
	
	//method to access private field "date"
	//to obtain the month needed
	public int getMonth() {
		return this.date.get(GregorianCalendar.MONTH);
	}
	
	//method to access private field "date"
	//to obtain the month needed
	public int getYear() {
		return this.date.get(GregorianCalendar.YEAR);
	}

}
