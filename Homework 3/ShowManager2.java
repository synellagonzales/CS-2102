import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}
	//This method sorts shows between day and prime time, excludes night time
	//Gets all prime time in first loop
	//Gets all day time in second loop
	// added those two to show summary
	//return the show summary object
	//@param LinkedList<Show> shows
	//@return ShowSummary s
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> day = new LinkedList<Show> ();
		LinkedList<Show> prime = new LinkedList<Show>();
		for (int i = 0; i< shows.size(); i++) {
			if(shows.get(i).broadcastTime > 1700 && shows.get(i).broadcastTime < 2300) {
				prime.add(shows.get(i));
			}
		}
		for(int i = 0; i<shows.size(); i++) {
			if(shows.get(i).broadcastTime <1700 && shows.get(i).broadcastTime> 600) {
				day.add(shows.get(i));
			}
		}
		ShowSummary s = new ShowSummary(day,prime);
		return s;
	}
	
}
