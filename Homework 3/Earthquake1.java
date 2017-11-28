import java.util.LinkedList;

class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { 
	  return (int)anum > 10000000; 
	  }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { 
	  return ((int)dateNum % 10000) / 100; 
	  }
 
  //consumes a list of sensor data and a month
  //and produces a list of maxHzReports indicating the
  //highest frequency reading for each day in that month
  //ignores data for months except the given month
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) {
	  LinkedList<MaxHzReport> result = new LinkedList<MaxHzReport>();
	  double date = 0;
	  double reading = 0;
	  double max = 0;
	  
	  for (int i = 0; i < data.size(); i++) {
		if (isDate(data.get(i)) == true){ // element i is a date, not a reading
			date = data.get(i);
			if (extractMonth(date) == month) { //if the data is for the correct month, 
				if(data.get(i+1) > max) {
					date = data.get(i);
					reading = data.get(i+1);
					result.add(new MaxHzReport(date,reading));
			}
		  }
		}
		else if (isDate(data.get(i)) == false) { //element i is a reading, not a date
			if (extractMonth(data.get(i)) == month) { //if the data is for the correct month
				if(data.get(i) > max) {
					date = data.get(i-1);	
					reading = data.get(i);
					result.add(new MaxHzReport(date,reading));

				}
			}
		}
		else {
			return null;
		}
	  }
	  return result;
  }
}

