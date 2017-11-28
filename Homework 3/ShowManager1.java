import java.util.LinkedList;

class ShowManager1 {
	
	ShowManager1() {}

	//Consumes a list of Shows and produces a report containing
	//a report containing all of the daytime and primetime shows
	//in the list. 
	//The shows within each list should be in the same order
	//as in the original list. You may assume that no two shows
	//have the same name.
	
	//Subtasks:
	//	1) Get broadcastTime, find if its a daytime or primetime show
	//	3) Add to appropriate local list (day or night)
	//	2) Add to appropriate ShowSummary list that is returned
	public ShowSummary organizeShows(LinkedList<Show> shows) {
		
		LinkedList<Show> day = new LinkedList<Show>();
		LinkedList<Show> night = new LinkedList<Show>();
		
		ShowSummary report = new ShowSummary();
		
		for (Show s : shows) {
			if (s.broadcastTime < 1700) {
				day.add(s);
			}
			else if (s.broadcastTime > 1700) {
				night.add(s);
			}
			
		}
		
		for (Show s : day) {
			report.daytime.add(s);
		}
		
		for (Show s : night) {
			report.primetime.add(s);
		}
		
	return report;
	}
	
}
