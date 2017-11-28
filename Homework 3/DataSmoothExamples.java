import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples 
{  
  LinkedList<Show> shows = new LinkedList<Show>();
  LinkedList<Show> emptyshow = new LinkedList<Show>();
  LinkedList<Double> showResults = new LinkedList<Double>();
  DataSmooth2 D1 = new DataSmooth2();
  
  public DataSmoothExamples() 
  {
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		shows.add(new Show("Star Trek", 1800, eps1));
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2));
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3));
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4));

	    showResults.add(60.0);
	    showResults.add(29.75);
	    showResults.add(29.08333);
	    showResults.add(58.0);
  }
  
  @Test
  public void instructorTestDS() 
  {
	  LinkedList<Double> runtimes = D1.dataSmooth(shows);
	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(runtimes.get(i), showResults.get(i), .01);
	  }
  }

  //testing an empty case
  @Test
  public void testEmpty() {
	  LinkedList<Double> empty = new LinkedList<Double>();
	  DataSmooth2 d2 = new DataSmooth2();
	  assertEquals(empty, d2.dataSmooth(emptyshow));
  }
  
  /*For DataSmooth1:
   * 
   * Subtasks:
		1) Create triples as a new class of triples
	 	2) Keep count of total and # of iterations (to know
	 		how many to divide by)
	 	3) Average these triples
	 	4) Return list of these averaged values
   */	

  
  /*For DataSmooth2:
   * get the average value of shows and return the smoothed Double
   * @param LinkedList<Show> shows
   * @return LinkedList<Double> smoothed
   * 
   * Subtasks:
		1) The first for loop is to clean the data by calling getAvgRT and make a list of double
		2) Get the raw array of averages and does the averaging of the three (if its not first or last position) and add to smoothed
		3) Return the smoothed array. 
   */
  
}