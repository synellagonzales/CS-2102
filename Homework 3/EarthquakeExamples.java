import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  Earthquake2 E2 = new Earthquake2();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();  
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  
  public EarthquakeExamples() {
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
    NovReports.add(new MaxHzReport(20151101.0,6.0));
  }

  @Test
  public void instructorTestEQ() { 
    assertEquals(NovReports, 
                 E2.dailyMaxForMonth(threeDates, 11));
  }
  
  //testing an empty case
  @Test
  public void emptyTestEQ() {
	  LinkedList<MaxHzReport> empty = new LinkedList<MaxHzReport>();
	  assertEquals(empty, E1.dailyMaxForMonth(noData, 11));
  }

  /* For Earthquake1
   * 
   * Subtasks:
   *		1) Go through input list and determine if 
   *		   element is even a valid datum
   *		2) Extract month and check against input month
   *		3) Check subsequent data against a 
   *	   "max" variable to determine the true maximum value
   *		4) If it is, add the max value and date to the
   *	   MazHzReport.
   *
   */	
  
  /* For Earthquake2
   * 
   * gets a list of data and get the Max for each day of the month
   * if the extracted Month has data, it will get average
   * This program is done with a nested while Loop with an unstable value of i
   * Stores a MaxHzReport in a temporary object then put it into array
   * @param LinkedList<Double> data, int month
   * @return LinkedList<MaxHzReport>
   * 
   * Subtasks:
   * 	1) loop through the i and check if it's a date 
   * 	2) If it is a date, check for the right month
   * 	3) If it's the right month, loop through the variable until its the next date
   *    4) Get the Maximum value for that day and the loop inside breaks to the outer loop
   *    5) Keep on going until the whole list is done
   */

}
