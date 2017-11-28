import java.awt.List;
import java.util.*;

public class Competition {
	LinkedList<Athlete> athletes = new LinkedList<Athlete>();
	int numRounds;
	
	Competition (int numRounds, LinkedList<Athlete> athletes){
		this.athletes = athletes;
		this.numRounds = numRounds;
	}
	
	//produces a list of athletes who did not finish the competition
	public LinkedList<String> shootingDNF() {
		LinkedList<String> names = new LinkedList<String> ();
		int n = 0;
		for (Athlete i : athletes) {
			if(i.shoot.shootingRounds.size() < this.numRounds) {
				names.add(n, i.name);
				n = n+1;
			}
		}
		return names;
	}
	
	//takes an athlete and returns the score
	//that the athlete earned in the skiing race
	public double skiingScoreForAthlete(String aName) {
		double s = 0;
		for(Athlete i : athletes) {
			if(aName.equals(i.name)) {
				s = i.ski.pointsEarned();
			}
		}
		return s;
	}
	
	//compares two competitions and returns
	//true if any athletes in "this" competition 
	//had a BETTER skiing score than the "other" competition
	public boolean anySkiingImprovement(Competition otherComp) {
		for(Athlete i : this.athletes) {
			for (Athlete j : otherComp.athletes) {
				if(i.name.equals(j.name)) {
					if(i.ski.pointsEarned() > j.ski.pointsEarned()) {
					return true;
					} else {
					break;
					}
				}
			}
		}
		return false;
	}

}

/* Question #10:
 * 
 * Looking back to our
 * skiingScoreForAthlete method, we're pretty satisfied
 * with the outcome of the code. It works and looks pretty straightforward to us.
 * 
 * Looking back to our
 * anySkiingImprovement method we could have added a 
 * helper function to make the code more understandable.
 * Right now it is structured in nested For/If loops, which
 * in hindsight, is hard to understand at first glance.
 * Instead of nesting the loops and if-statements, maybe
 * we could have had a helper function that
 * compared two single athletes,
 * then the anySkiingImprovement method could
 * call that helper function on each comparison.
 * 
 * */
