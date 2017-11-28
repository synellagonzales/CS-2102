
public class ShootingResult implements IEvent{
	ShootingRound round1;
	ShootingRound round2;
	ShootingRound round3;
	ShootingRound round4;
	
	ShootingResult (ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4){
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.round4 = round4;
	}
	
	public double pointsEarned() {
		int pointsR1 = this.round1.targetsHit;
		int pointsR2 = this.round2.targetsHit;
		int pointsR3 = this.round3.targetsHit;
		int pointsR4 = this.round4.targetsHit;
				
		int totalPoints = pointsR1+pointsR2+pointsR3+pointsR4;
		
		return totalPoints;
	}
	
}
