package tests.gameboard;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import code.model.GameBoard;

public class RandomDegreeTests {

	//Tests that two calls to randomDegree returns, on average different values
	//A large N of 100,000 allows us to be sure that the results of the boolean 
	//actual being true means the function is random
	@Test public void testThatTwoCallsReturnDifferentValuesOverLargeN(){
		GameBoard gb = new GameBoard(1);
		int count_true = 0;
		int count_false = 0;
		for(int i = 0; i < 1000000; i++){
			int random1 = gb.randomDegree();
			int random2 = gb.randomDegree();
			if(random1==random2){
				count_true++;
			}
			else{count_false++;}
		}
		boolean actual = false;
		if(count_false > count_true){
			actual = true;
		}
		boolean expected = true;  //true that the function is random
		assertTrue("",expected==actual);	
	}
}
