import java.util.LinkedList;

public class ShootingResult implements IEvent{
	LinkedList<ShootingRound> shootingRounds;
	
	ShootingResult (LinkedList<ShootingRound> shootingRounds){
		this.shootingRounds = shootingRounds;
	}
	
	//Returns the total points earned of the shooting rounds
	//adds up the total # targets hit for each round
	public double pointsEarned() {
		double totalPoints = 0;
		for(int i = 0; i< shootingRounds.size(); i++) {
			totalPoints += shootingRounds.get(i).targetsHit;
		}
		return totalPoints;
	}
	
	//returns the ShootingRound out of the
	//ShootingResult linked list that had
	//the highest score (most targets hit)
//	public ShootingRound bestRound() {
//		int bR = 0;
//		for(int i = 1; i < shootingRounds.size(); i++) {
//			if(shootingRounds.get(bR).targetsHit < shootingRounds.get(i).targetsHit) {
//				bR = i;
//			}
//		}
//		return shootingRounds.get(bR);
//	}
	
	public ShootingRound bestRound() {
		int bR = 0;
		int count = 0;
		for (ShootingRound i : shootingRounds ) {
			if (bR <= i.targetsHit) {
				bR = i.targetsHit;
				count++;
			}
		}
		
		return shootingRounds.get(count-1);
	}
	
}
 