public abstract class AbsSki {
	double finishtime;
	int position;
	
	AbsSki (double finishtime, int position){
		this.finishtime = finishtime;
		this.position = position;
	}
	
	//returns the total points earned for the event
	public double pointsEarned() {
		return this.finishtime;
	}
}
