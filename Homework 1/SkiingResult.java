
public class SkiingResult implements IEvent{
	double time;
	int position;
	ShootingResult result;
	
	SkiingResult (double time, int position, ShootingResult result){
		this.time = time;
		this.position = position;
		this.result = result;
	}
	
	//calculates the total targets missed and 
	//adds appropriate values to final finishing time.
	double addShootingPenalties(ShootingResult results){
		double targetsHit = results.pointsEarned();
		
		double maxHits = 20; 
		
		double targetsMissed = maxHits - targetsHit;
		
		double finalTime = this.time + (targetsMissed * 20);
		
		return finalTime;
	}
	
	//calculates the TOTAL points earned, after subtracting
	//shooting penalties and awarding top 3 placers
	//time deductions.
	public double pointsEarned() {
		double finalTime = this.addShootingPenalties(this.result);
		if (this.position == 1) {
			finalTime = finalTime - 10;
		} else if (this.position == 2) {
			finalTime = finalTime - 7;
		} else if (this.position == 3) {
			finalTime = finalTime - 3;
		} else {
			return finalTime;
		}
		
		return finalTime;
	}
}
