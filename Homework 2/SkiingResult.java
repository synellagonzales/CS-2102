import java.util.LinkedList;

public class SkiingResult extends AbsSki implements IEvent{
	double time;
	int position;
	ShootingResult result;
	
	SkiingResult (double time, int position, ShootingResult result){
		super(time, position);
		this.result = result;
	}
	
	//calculates the total targets missed and 
	//adds appropriate values to final finishing time.	
	double addShootingPenalties(LinkedList<ShootingRound> results){
		double targetsHit = 0;
		 
		for(ShootingRound i : results) {
			 targetsHit = targetsHit + i.targetsHit;
		 }
		
		double maxHits = 5*results.size(); 
		double targetsMissed = maxHits - targetsHit;
		double finalTime = this.finishtime + targetsMissed * 20;
		
		return finalTime;
	}
	
	//calculates the TOTAL points earned, after subtracting
	//shooting penalties and awarding top 3 athletes
	//time deductions.
	public double pointsEarned() {
		
		double totalPoints = this.addShootingPenalties(this.result.shootingRounds);
		int position = super.position;
		
		if (position == 1) {
			return (totalPoints - 10);
		} else if (position == 2) {
			return (totalPoints - 7);
		} else if (position == 3) {
			return (totalPoints - 3);
		} else {
			return totalPoints;
		}

	}
}
