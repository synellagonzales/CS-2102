import java.util.LinkedList;

class Earthquake2 {
  Earthquake2(){}
      
  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }
 //gets a list of data and get the Max for each day of the month
  //if the extracted Month has data, it will get average
  //This program is done with a nested while Loop with an unstable value of i
  //Stores a MaxHzReport in a temporary object then put it into array
  //@param LinkedList<Double> data, int month
  //@return LinkedList<MaxHzReport>
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) {
	  Double[] reading = new Double[20];
	  LinkedList<MaxHzReport> var = new LinkedList<MaxHzReport>();
	  MaxHzReport mhr = new MaxHzReport(0,23);
	  reading[0] = 0.2;
	  int i = 0; 
	  int count1 = 0;
	  while(i< data.size()) {
		  if(isDate(data.get(i))) {
			  if(extractMonth(data.get(i)) == month) {
				  mhr.date = data.get(i);
				  mhr.maxReading = data.get(i+1);
				  count1 = i+2;
				  if(count1 <data.size()) {
				  while(!isDate(data.get(count1))) {
					  if(mhr.maxReading < data.get(count1)) {
						  mhr.maxReading = data.get(count1);
						  count1 +=1;				
					  }
				  }
			  }
				  var.add(mhr);
		  }
			  }
		  i++;
	  }
	  return var;
  }
}