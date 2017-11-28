public class Athlete {
	ShootingResult shoot;
	SkiingResult ski;
	
	Athlete (ShootingResult shoot, SkiingResult ski){
		this.shoot = shoot;
		this.ski = ski;
	}
	
	//Returns the athlete that has the shorter ski time
	public Athlete betterSkiier(Athlete other) {
		if (other.ski.time < this.ski.time) {
			return other;
		}
		else {
			return this;
		}
	}
	
	//Returns true if the athlete being passed in 
	public boolean hasBeaten(Athlete other) {
		if ((this.betterSkiier(other) == other) || (this.ski.pointsEarned() > other.ski.pointsEarned())){
			return false;
		} else {
			return true;
		}
	
	}
}

