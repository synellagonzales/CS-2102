import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}
  
  //Creating the triples from the list of shows
  //I created a new class for triples to make this easier
  public LinkedList<ShowTriples> makeTriples(LinkedList<Show> shows){
	  LinkedList<ShowTriples> showTriples = new LinkedList<ShowTriples>();
	  
	  
	  for (int i= 0; i < shows.size()-2; i++) {
		  //Creating an instance of ShowTriples
		  //and adding the three shows to it
		  ShowTriples triple = new ShowTriples (shows.get(i),
	    		   									shows.get(i+1),
	    		   									shows.get(i+2));
	      //adding the triples to the list 
		  showTriples.add(triple);
	     }
	   
	  //returning the triples into a list that
	  //the dataSmooth method can parse
	  return(showTriples);
  }
  
  //Averaging the triples and returning the list of smoothed data
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows){	  
	  double sum = 0;
	  int count = 0;
	  double avg = 0;
	  
	  //breaking down the list of shows into triples
	  LinkedList<ShowTriples> triples = new LinkedList<ShowTriples>();
	  this.makeTriples(shows);
	  
	  //initiating a return list
	  LinkedList<Double> smooth = new LinkedList<Double>();
	  
	  //going through the list of triples, 
	  //averaging their avgLengths,
	  //putting them in a list,
	  //and returning that list
	  for (ShowTriples t : triples) {
		  if (sum != 0 && count != 0) {
			  sum = sum + (t.a.avgLength + t.b.avgLength + t.c.avgLength);
			  count++;
			  avg = sum/count;  
		  }
		  else {
			  return smooth;
		  }
	  }
	  return smooth;
	}
  }