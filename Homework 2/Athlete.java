
public class Athlete {
	ShootingResult shoot;
	SkiingResult ski;
	String name;
	
	Athlete (ShootingResult shoot, SkiingResult ski, String name){
		this.shoot = shoot;
		this.ski = ski;
		this.name = name;
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
	
	//Returns true if the athlete being passed in has a worse ski time or
	//missed more targets.
	public boolean hasBeaten(Athlete other) {
		if ((this.betterSkiier(other) == other) || (this.ski.pointsEarned() > other.ski.pointsEarned())){
			return false;
		} else {
			return true;
		}
	
	}
}

