import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
	public Examples() {}
		
		//Examples of ShootingRounds
		ShootingRound round1 = new ShootingRound(1);
		ShootingRound round2 = new ShootingRound(2);
		ShootingRound round3 = new ShootingRound(3);
		ShootingRound round4 = new ShootingRound(5);
		
		//Examples of ShootingResults
		ShootingResult tomShots = new ShootingResult(round4, round4, round4, round4);
		ShootingResult nicoleShots = new ShootingResult(round1, round1, round1, round1);
		
		//Examples of SkiingResults
		SkiingResult tomSki = new SkiingResult(69.42, 1, tomShots);
		SkiingResult nicoleSki = new SkiingResult(100, 4, nicoleShots);
		
		//Examples of Athletes
		Athlete tom = new Athlete(tomShots, tomSki);
		Athlete nicole = new Athlete(nicoleShots, nicoleSki);
		
		//Testing pointsEarned for ShootingResult
		//Expects 20.0 since tom did not miss a shot
		@Test
		public void checkPointsShootTom() {
			assertEquals(20.0,tomShots.pointsEarned(), .1);
		}
		
		//Testing pointsEarned for SkiingResult
		//Expects 59.42 since tom got a -10 time deduction for being first
		//and received no additional time since he did not miss a shot
		@Test
		public void checkPointsSkiTom() {
			assertEquals(59.42, tomSki.pointsEarned(), .1);
		}

		//Testing pointsEarned for ShootingResult
		//Expects 4 since nicole only hit 4 targets
		@Test
		public void checkPointsShootNic() {
			assertEquals(4,nicoleShots.pointsEarned(), .1);
		}
				
		//Testing pointsEarned for SkiingResult
		//Expects 420.0 since nicole received a 320 second time addition
		//for missing 16 targets, and received no time deductions since
		//she was in 4th place (not top 3)
		@Test
		public void checkPointsSkiNic() {
			assertEquals(420.0, nicoleSki.pointsEarned(), .1);
		}
		
		//Test case for addShootingPenalties
		@Test
	    public void checkPenalties() {
			assertEquals(69.42, tomSki.addShootingPenalties(tomShots), .0);
	    }
		
		//Test case for betterSkiier method. This one should pass, since tom
		//is the better skiier and the test case expects tom.
		@Test
		public void checkBetterSkiierPASS() {
			assertEquals(tom, tom.betterSkiier(nicole));
		}
		
		//This one should fail, since nicole is not the better skiier,
		//but the test case is expecting her.
		@Test
		public void checkBetterSkiierFAIL() {
			assertEquals(tom, tom.betterSkiier(nicole));
		}
		
		//Test case for hasBeaten method. This passes since it expects
		//true, and it is true that tom beat nicole.
		@Test
		public void checkWinnerPASS() {
			assertTrue(tom.hasBeaten(nicole));
		}
		
		//This should pass, since it expects true but nicole
		//did not beat tom.
		@Test
		public void checkWinnerFAIL() {
			assertFalse(nicole.hasBeaten(tom));
		}

}
