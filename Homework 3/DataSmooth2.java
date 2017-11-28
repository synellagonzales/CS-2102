import java.util.LinkedList;

class DataSmooth2 {
  DataSmooth2(){}
  
  //get the average value of shows and return the smoothed Double
  //@param LinkedList<Show> shows
  //@return LinkedList<Double> smoothed
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  double avg = 0;
	  LinkedList<Double> smoothed = new LinkedList<Double>();
	  LinkedList<Double> raw = new LinkedList<Double>();
	  for(int i =0; i<shows.size(); i++) {
		  raw.add(getAvgRT(shows.get(i)));
	  }
	  for(int i = 0; i<shows.size();i++) {
		  if(i>0 && (i<shows.size()-1)) {
			  avg = (raw.get(i-1)+raw.get(i)+raw.get(i+1))/3;
			  smoothed.add(avg);
		  }
		  else {
			  smoothed.add(raw.get(i));
		  }
	  }
	  return smoothed;
  }
  //takes each episode out
  //get the avg and return
  //@param Show s
  //@return double avg
  public double getAvgRT(Show s) {
	  double avg = 0;
	  int count = 0;
	  for(int i = 0; i<s.episodes.size();i++) {
		  avg += s.episodes.get(i).runTime;
		  count++;
	  }
	  return avg/count;
  }
}