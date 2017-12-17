
class Readings {
	private Time time;
	private int temp; // in Fahrenheit
	
	Readings(Time time, int temp){
		this.time = time;
		this.temp = temp;
	}
	
	//getter method to access the private field "temp"
	public int getTemp() {
		return this.temp;
	}
}
