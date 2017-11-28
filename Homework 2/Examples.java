import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class Examples {

    public Examples(){}
    
    //Initiating the linked lists for Athletes
    LinkedList<Athlete> athletes1 = new LinkedList<Athlete>();
    LinkedList<Athlete> athletes2 = new LinkedList<Athlete>();
    LinkedList<Athlete> athletesBad = new LinkedList<Athlete>();
    LinkedList<Athlete> athletesGood = new LinkedList<Athlete>();
    LinkedList<Athlete> athleteComplete = new LinkedList<Athlete>();
    LinkedList<Athlete> athleteIncomp = new LinkedList<Athlete>();
    LinkedList<Athlete> athleteReverse = new LinkedList<Athlete>();

    
    //Initiating the ShootingRounds for 5 different rounds
    //with 5 different results for targetsHit field
    ShootingRound round1 = new ShootingRound(1);
	ShootingRound round2 = new ShootingRound(2);
	ShootingRound round3 = new ShootingRound(3);
	ShootingRound round4 = new ShootingRound(4);
	ShootingRound round5 = new ShootingRound(5);
	
	//Initiating the linked lists for ShootingRounds
	LinkedList<ShootingRound> sr1 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> sr2 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> sr3 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> sr4 = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> srGood = new LinkedList<ShootingRound>();
	LinkedList<ShootingRound> srBad = new LinkedList<ShootingRound>();


	//Initiating the ShootingResults
	ShootingResult st1;
	ShootingResult st2;
	ShootingResult st3;
	ShootingResult st4;
	ShootingResult stBad;
	ShootingResult stGood;
	
	//Initiating the SkiingResults
	SkiingResult sk1;
	SkiingResult sk2;
	SkiingResult sk3;
	SkiingResult skBad;
	SkiingResult skGood;
	
	//Initiating the Athletes
	Athlete ath1;
	Athlete ath2;
	Athlete ath3;
	Athlete athBad;
	Athlete athGood;
	Athlete betterSteve;
	Athlete worseSteve;
	Athlete john;
	
	//Initiating the Competitions
	Competition c1;
	Competition c2;
	Competition cBad;
	Competition cGood;
	Competition cComplete;
	Competition cIncomplete;
	Competition cReverse;
	
	//A helper function that
	//adds the rounds to the linked list of ShootingRounds
	public LinkedList<ShootingRound> addRound(LinkedList<ShootingRound> s , ShootingRound b) {
		s.add(b);
		return s;
	}
	
	@Before
	public void Setup() {
		//Adding the rounds 1 through 5 to the ShootingRound list sr1
		addRound(sr1, round1);
		addRound(sr1, round2);
		addRound(sr1, round3);
		addRound(sr1, round4);
		addRound(sr1, round5);
		
		//Adding the rounds 5 through 1 to the ShootingRound list sr2
		sr2.add(round5);
		sr2.add(round4);
		sr2.add(round3);
		sr2.add(round2);
		sr2.add(round1);
		
		//Adding the rounds 5 through 2 to the ShootingRound list sr3
		sr3.add(round5);
		sr3.add(round4);
		sr3.add(round3);
		sr3.add(round2);
		
		//Adding the rounds 5 through 1 to the ShootingRound list sr2
		sr4.add(round5);
		sr4.add(round5);
		sr4.add(round3);
		sr4.add(round2);
		
		//Adding 5 rounds of sr1 to the list srBad
		srBad.add(round1);
		srBad.add(round1);
		srBad.add(round1);
		srBad.add(round1);
		srBad.add(round1);
		
		//Adding 5 rounds of sr5 to the list srGood
		srGood.add(round5);
		srGood.add(round5);
		srGood.add(round5);
		srGood.add(round5);
		srGood.add(round5);
		
		//Initiating the ShootingResults using the
		//ShootingRounds we just created
		st1 = new ShootingResult(sr1);
		st2 = new ShootingResult(sr2);
		st3 = new ShootingResult(sr3);
		st4 = new ShootingResult(sr4);
		stBad = new ShootingResult(srBad);
		stGood = new ShootingResult(srGood);
		
		//Initiating the SkiingResults
		sk1 = new SkiingResult(100.0,1,st1);
		sk2 = new SkiingResult(90, 2, st2);
		sk3 = new SkiingResult(80,3,st3);
		skBad = new SkiingResult(999.9, 10, stBad);
		skGood = new SkiingResult(60.0, 1, stGood);
		
		/*=========================
		 * Initiating the Athletes
		 * ========================
		 */
		
		/*
		 *Steve is an Athlete who:
		 *shot 25/25 targets
		 *finished after 100units 
		 *and was in 1st place
		 */
		ath1 = new Athlete(st1,sk1,"Steve");
		
		/*
		 *Mark is an Athlete who:
		 *shot 15/25 targets
		 *finished after 90units
		 *and was in 2nd place
		 */
		ath2 = new Athlete(st2,sk2,"Mark");
		
		/*
		*Random is an Athlete who:
		 *shot 14/20 targets
		 *finished after 80 units
		 *and was in 3rd place 
		 */
		ath3 = new Athlete(st3,sk3,"Random");
		
		/*
		 *athBad is an Athlete who:
		 *shot 5/25 targets
		 *finished after 999.9 units
		 *and was in 10th place 
		 */
		athBad = new Athlete(stBad,skBad,"athBad");
		
		/*
		 *athGood is an Athlete who:
		 *shot 25/25 targets
		 *finished after 60.0 units
		 *and was in 1st place 
		 */
		athGood = new Athlete(stGood,skGood,"athGood");
		
		/*
		 *betterSteve is an Athlete who:
		 *shot 25/25 targets
		 *finished after 60.0 units
		 *and was in 1st place 
		 */
		betterSteve = new Athlete(stGood,skGood,"Steve");

		/*
		 *worseSteve is an Athlete who:
		 *shot 5/25 targets
		 *finished after 999.9 units
		 *and was in 10th place 
		 */
		worseSteve = new Athlete(stBad,skBad,"Steve");
		
		/*
		 *John is an Athlete who:
		 *did not finish his shooting event
		 */
		john = new Athlete(st4, skBad, "John");
		
		//Adding the Athletes to the list athletes1
		athletes1.add(ath1);	//steve
		athletes1.add(ath2);	//mark
		athletes1.add(ath3);	//random
		
		//adding the Athletes to the list athletes2
		athletes2.add(ath3); //random
		athletes2.add(ath2); //mark
		athletes2.add(ath1); //steve
		
		//adding the Athletes to the list athletesBad
		athletesBad.add(athBad);		//athBad
		athletesBad.add(ath3);		//random
		athletesBad.add(worseSteve); //worseSteve
		
		//adding the Athletes to the list athletesGood
		athletesGood.add(athBad);		//athBad
		athletesGood.add(betterSteve);	//betterSteve
		athletesGood.add(ath3); 			//random
		
		//creating a list of athletes who
		//fully completed their competitions
		athleteComplete.add(athGood);
		athleteComplete.add(athGood);
		athleteComplete.add(athGood);
		
		//creating a list of athletes who
		//did not fully complete the comp.
		athleteIncomp.add(john); //john 4/5 rounds
		athleteIncomp.add(ath3); //random 4/5 rounds
		athleteIncomp.add(ath1); //steve 5/5 rounds
		
		//creating a list of athletes who
		//did not fully complete the comp.
		//reversing john and random
		//to show the function prints correctly.
		athleteReverse.add(ath3); //random 4/5 rounds
		athleteReverse.add(john); //john 4/5 rounds
		athleteReverse.add(ath1); //steve 5/5 rounds
		
		//Initializing the new Competitions 
		c1 = new Competition(5,athletes1);
		c2 = new Competition(5,athletes2);
		cBad = new Competition(5,athletesBad);
		cGood = new Competition(5,athletesGood);
		cComplete = new Competition (5, athleteComplete);
		cIncomplete = new Competition (5, athleteIncomp);
		cReverse = new Competition (5, athleteReverse);
		
	}
	/* ============================
	 * TESTING bestRound() METHOD.
	 * ============================
	 */
	
	/*
	 * Should return round5 since the 
	 * 5th round
	 * was the best round shot by Steve
	 */
	@Test
	public void testbestRound() {
		assertEquals(round5, st1.bestRound());
	}

	/*
	 * Should return round1 since the 
	 * rounds are all the same
	 * so it doesn't matter
	 */
	@Test
	public void testbestRound2() {
		assertEquals(round1, stBad.bestRound());
	}
	
	/*
	 * Should return round5 since the 
	 * that was the best round shot,
	 * and as a duplicate it doesn't matter
	 * which one is returned.
	 */
	@Test
	public void testbestRound3() {
		assertEquals(round5, st4.bestRound());
	}
	
	
	/* =======================================
	 * TESTING shootingDNF() METHOD.
	 * =======================================
	 */
	
	/*Should return a list containing only
	 * one element, String "Random",
	 * after running shootDNF on c1
	 */
	@Test
	public void testShootingDNF() {
		LinkedList<String> dnf = new LinkedList<String>();
		dnf.add("Random");
		assertEquals(dnf, c1.shootingDNF());
	}
	
	/*Should return a list containing only
	 * 2 elements:
	 * 1ST String "John"
	 * 2ND String "Random" 
	 * after running shootDNF on cIncomplete
	 * They should be in that EXACT order.
	 */
	@Test
	public void testShootingDNF2() {
		LinkedList<String> dnf = new LinkedList<String>();
		dnf.add("John");
		dnf.add("Random");
		assertEquals(dnf, cIncomplete.shootingDNF());
	}
	
	/*Should return a list containing only
	 * 2 elements:
	 * 1ST String "Random"
	 * 2ND String "John" 
	 * after running shootDNF on cIncomplete
	 * They should be in that EXACT order.
	 */
	@Test
	public void testShootingDNF3() {
		LinkedList<String> dnf = new LinkedList<String>();
		dnf.add("Random");
		dnf.add("John");
		assertEquals(dnf, cReverse.shootingDNF());
	}
	
	/*Should return an empty list
	 * after running shootDNF
	 * on cComplete, since every
	 * athlete completed their events.
	 */
	@Test
	public void testemptyShootingDNF() {
		LinkedList<String> empty = new LinkedList<String>();
		assertEquals(empty, cComplete.shootingDNF());
	}
	
	
	
	/* =======================================
	 * TESTING skiingScoreForAthlete() METHOD.
	 * =======================================
	 */
	
	/*Should return 290 since Steve missed 
	 *15 out of 25 shots, resulting in a 200 unit penalty
	 *but received a -10 time deduction for coming in first
	 *Logic: 
	 *(100 - 10) time deduction = 90 +  200 target penalty = 
	 *290 final score
	 */
	@Test
    public void SkiScoreTestSteve() {
    		assertEquals(290, c1.skiingScoreForAthlete("Steve"), 0);
    }
	
    /*Should return 283 since Mark missed
     *15 out of 25 shots, resulting in a 200 unit penalty
     *but received a -7 time deduction for coming in 2nd
     *Logic:
     *(90 - 7) time deduction = 83 + 200 target penalty =
     *283 final score
	 */
    @Test
    public void SkiScoreTestMark() {
    		assertEquals(283, c1.skiingScoreForAthlete("Mark"), 0);
    }
    
    /*Should return 197 since Random missed
     * 6 out of 20 shots, resulting in a 120 unit penalty
  	 * but received a -3 time deduction for coming in 2nd
  	 * Logic:
  	 * (80 - 3) time deduction = 77 + 120 target penalty =
  	 * 197 final score
  	 */
    @Test
    public void SkiScoreTestRandom() {
    		assertEquals( 197, c1.skiingScoreForAthlete("Random"),0);
    }
    
    /* =======================================
	 * TESTING anySkiingImprovement() METHOD.
	 * =======================================
	 */
    
    /*Tests if any athletes in "this" (cGood) had a
     * Better Skiing score in "other" (cBad)
     * Should return False as cBad contains
     * worseSteve AKA Steve's worse score
    */
    @Test
    public void testSkiiImprovementEqual() {
    		assertEquals(false, cGood.anySkiingImprovement(cBad));
    }
    
    /*Tests if any athletes in "this" (cBad) had a
     * Better Skiing score in "other" (cGood)
     * Should return True as cBad contains
     * betterSteve AKA Steve's better score
     */
    @Test
    public void testImprovementSteve() {
    		assertEquals(true, cBad.anySkiingImprovement(cGood));
    }
    
    /*Tests if any athletes in "this" (c1) had a
     * Better Skiing score in "other" (c2)
     * Should return False as c2 contains the
     * same athletes results, just in a different order
     */
    @Test
    public void testSkiiImprovement() {
    		assertEquals(false, c1.anySkiingImprovement(c2));
    }
    
    /*Tests if any athletes in "this" (c1) had a
     * Better Skiing score in "other" (c1)
     * Should return False as they are the 
     * same exact competition, and the competitors 
     * performed the same, NOT better
    	 */
    @Test
    public void testImprovementSame() {
    		assertEquals(false, c1.anySkiingImprovement(c1));
    }
   
}