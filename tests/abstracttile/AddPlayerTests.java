package tests.abstracttile;

import code.model.AbstractTile;
import code.model.FixedTile;
import code.model.Player;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddPlayerTests {

	@Test
	public void addNullPlayer(){
		AbstractTile at = new FixedTile("T");
		Player p = null;
		boolean expected = false;
		boolean actual = at.addPlayer(p);
		assertTrue("We expected "+expected+" but got "+actual, expected==actual);
	}
	
	@Test
	public void addOnePlayer(){
		AbstractTile at = new FixedTile("T");
		Player p = new Player("Red");
		int sizeBefore = at.getPlayers().size();
		int expectedSize = sizeBefore + 1;
		boolean actual =  at.addPlayer(p);
		boolean expected = true;
		int actualSize = at.getPlayers().size();
		Player p1 = at.getPlayers().get(0); //p1 should be same player as p
		assertTrue("We expected "+expected+" but got "+actual+" and the expected size after adding"
				+ " was " +expectedSize+ " but we got " + actualSize+ " and it was " + (p==p1) + 
				"that the identity of the player being placed onto the tile was the same after"
				+ "being place", expected==actual && expectedSize==actualSize && p==p1);
	}
	
	@Test
	public void addTwoPlayers(){
		AbstractTile at = new FixedTile("T");
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		int sizeBefore = at.getPlayers().size();
		int expectedSize = sizeBefore + 2;
		boolean actual1 =  at.addPlayer(p1);
		boolean actual2 = at.addPlayer(p2);
		boolean expected = true;
		int actualSize = at.getPlayers().size();
		Player p3 = at.getPlayers().get(0); //p1 should be same player as p3
		Player p4 = at.getPlayers().get(1); //p2 should be same player as p4
		assertTrue("We expected "+expected+" in all cases but got "+actual1+" and "+actual2+
				" and the expected size after adding was " +expectedSize+ " but we got " + actualSize+ 
				" and it was " + (p1==p3) + "that the identity of the 1st player being placed onto the tile "
				+ "was the same after being placed, and it was " + (p2==p4) +" that the identity of "
				+ " the 2nd player was the same before and after being placed", expected==actual1 && 
				expected==actual2 && expectedSize==actualSize && p1==p3 && p2==p4);
	}

	@Test
	public void addThreePlayers(){
		AbstractTile at = new FixedTile("T");
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		Player p3 = new Player("Tan");
		int sizeBefore = at.getPlayers().size();
		int expectedSize = sizeBefore + 3;
		boolean a1 =  at.addPlayer(p1);
		boolean a2 = at.addPlayer(p2);
		boolean a3 = at.addPlayer(p3);
		boolean e = true;
		int actualSize = at.getPlayers().size();
		Player p4 = at.getPlayers().get(0); //p1 should be same player as p4
		Player p5 = at.getPlayers().get(1); //p2 should be same player as p5
		Player p6 = at.getPlayers().get(2); //p3 should be same player as p6
		assertTrue("It was " + (a1&&a2&&a3) + " that all players were added to the tile"
				+ " successfully. We expected the size after adding three players to be " + expectedSize+
				" but it was " + actualSize+ ". It was " + (p1==p4&&p2==p5&&p3==p6) + " that the identities of all players"+
				"going in was the same as after they were added to the tile", e==a1 && e==a2 && e==a3 
				&& p1==p4 && p2==p5 && p3==p6 && expectedSize==actualSize);
	}

	@Test
	public void addFourPlayers(){
		AbstractTile at = new FixedTile("T");
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		Player p3 = new Player("Tan");
		Player p4 = new Player("White");
		int sizeBefore = at.getPlayers().size();
		int expectedSize = sizeBefore + 4;
		boolean a1 =  at.addPlayer(p1);
		boolean a2 = at.addPlayer(p2);
		boolean a3 = at.addPlayer(p3);
		boolean a4 = at.addPlayer(p4);
		boolean e = true;
		int actualSize = at.getPlayers().size();
		Player p5 = at.getPlayers().get(0); //p1 should be same player as p5
		Player p6 = at.getPlayers().get(1); //p2 should be same player as p6
		Player p7 = at.getPlayers().get(2); //p3 should be same player as p7
		Player p8 = at.getPlayers().get(3); //p4 should be same player as p8
		assertTrue("It was " + (((a1&&a2)&&a3)&&a4) + " that all players were added to the tile"
				+ " successfully. We expected the size after adding three players to be " + expectedSize+
				" but it was " + actualSize+ ". It was " + (p1==p5&&p2==p6&&p3==p7&&p4==p8) + " that the identities of all players"+
				"going in was the same as after they were added to the tile", e==a1 && e==a2 && e==a3 
				&& e==a4 && p1==p5 && p2==p6 && p3==p7 && p4==p8 && expectedSize==actualSize);
	}

	@Test
	public void addMoreThanFourPlayers(){
		AbstractTile at = new FixedTile("T");
		Player p1 = new Player("Red");
		p1.setName("P1");
		Player p2 = new Player("Blue");
		p2.setName("P2");
		Player p3 = new Player("Tan");
		p3.setName("P3");
		Player p4 = new Player("White");
		p4.setName("P4");
		Player p5 = new Player("Red");
		p5.setName("P5");
		int sizeBefore = at.getPlayers().size();
		int expectedSize = sizeBefore + 4; 
		boolean a1 =  at.addPlayer(p1);
		boolean a2 = at.addPlayer(p2);
		boolean a3 = at.addPlayer(p3);
		boolean a4 = at.addPlayer(p4); 
		boolean a5 = at.addPlayer(p5); //expect false
		boolean e = true;
		boolean e2 = false;
		int actualSize = at.getPlayers().size();  //expect 4
		Player p6 = at.getPlayers().get(0); //p1 should be same player as p6
		Player p7 = at.getPlayers().get(1); //p2 should be same player as p7
		Player p8 = at.getPlayers().get(2); //p3 should be same player as p8
		Player p9 = at.getPlayers().get(3); //p4 should be same player as p9
		boolean a6 = at.getPlayers().contains(p5);  //expect false
		assertTrue("It was "+(a1 && a2 && a3 && a4)+" that the 1st 4 players were"
				+" added successfully but " + a5 + " that player 5 was added successfully."+
				" The expected size after trying to add 5 was " + expectedSize + " but it was "+
				actualSize+" We expected it to be "+e2+" that the player array would contain player"
				+ "5 and it was " +a6+" It was"+(p1==p6&&p2==p7&&p3==p8&&p4==p9)+ "that the "
				+ "identities of the players that were added  successfully"
				+ "were the same going in as after they were added",e==a1 && e==a2 && e==a3 && 
				e==a4 && e2==a5 && e2==a6 && actualSize==expectedSize
				&& p1==p6 && p2==p7 && p3==p8 && p4==p9);
	}


}
