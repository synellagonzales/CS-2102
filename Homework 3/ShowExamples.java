import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	ShowManager2 sm2 = new ShowManager2();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();
	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		Show s1 = new Show("Star Trek", 1800, eps1);
		shows.add(s1);
		report1.primetime.add(s1);
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2);
		shows.add(s2);
		report1.primetime.add(s2);
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3);
		shows.add(s3);
		report1.daytime.add(s3);
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4);
		shows.add(s4);
		report1.daytime.add(s4);
	}
	
	@Test
	public void instructorTestOrganizeShows() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
	/* For ShowManager1
	 * 
	 * Consumes a list of Shows and produces a report containing
	 * a report containing all of the daytime and primetime shows
	 * in the list. 
	 * The shows within each list should be in the same order
	 * as in the original list. You may assume that no two shows
	 * have the same name.
	 * 
	 * Subtasks:
	 * 	1) Get broadcastTime, find if its a daytime or primetime show
	 * 	2) Add to appropriate local list (day or night)
	 * 	3) Add to appropriate ShowSummary list that is returned
	 * 
	 */
		
	/* For ShowManager2
	 * 
	 * This method sorts shows between day and prime time, excludes night time
	 * Gets all prime time in first loop
	 * Gets all day time in second loop
	 * added those two to show summary
	 * return the show summary object
	 * @param LinkedList<Show> shows
	 * @return ShowSummary s
	 * 
	 * Subtasks:
	 * 	1) Get broadcastTime, find if its a daytime or primetime show
	 * 	2) Loop through to seperate out the day time shows
	 *  3) Loop through to seperate out the prime time shows
	 *  4) Return a ShowSummary with day time shows and prime time shows
	 */
		

}
