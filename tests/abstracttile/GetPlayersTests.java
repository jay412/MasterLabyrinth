package tests.abstracttile;

import code.model.AbstractTile;
import code.model.MoveableTile;
import code.model.Player;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class GetPlayersTests {

	@Test
	public void getPlayersWithNoPlayersOnTile() {
		AbstractTile at = new MoveableTile();
		ArrayList<Player> actual = at.getPlayers();
		ArrayList<Player> expected = new ArrayList<Player>();
		String expectedString = "";
		for(Player p: actual){
			expectedString = expectedString + p.getColor() + " ";
		}
		String actualString = "";
		for(Player p: actual){
			actualString = actualString + p.getColor() + " ";
		}
		assertTrue("We expected the following players " + expectedString + " but got " +
				actualString, expectedString.equals(actualString) && expected.equals(actual));
	}
	
	@Test
	public void getPlayersWithOnePlayerOnTile() {
		AbstractTile at = new MoveableTile("T");
		Player p1 = new Player("Red");
		at.addPlayer(p1);
		ArrayList<Player> expected = new ArrayList<Player>();
		expected.add(p1);
		ArrayList<Player> actual = at.getPlayers();
		String exp = "";
		for(Player p: expected){
			exp+= p.getColor() + " ";
		}
		String act = "";
		for(Player p: actual){
			act += p.getColor() + " ";
		}
		assertTrue("We expected the following players " + exp + " but got " + act, 
				exp.equals(act) && expected.equals(actual));
	}
	
	@Test
	public void getPlayersWithTwoPlayersOnTile() {
		AbstractTile at = new MoveableTile("T");
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		at.addPlayer(p1);
		at.addPlayer(p2);
		ArrayList<Player> expected = new ArrayList<Player>();
		expected.add(p1);
		expected.add(p2);
		ArrayList<Player> actual = at.getPlayers();
		String exp = "";
		for(Player p: expected){
			exp+= p.getColor() + " ";
		}
		String act = "";
		for(Player p: actual){
			act += p.getColor() + " ";
		}
		assertTrue("We expected the following players " + exp + " but got " + act, 
				exp.equals(act) && expected.equals(actual));
	}
	
	@Test
	public void getPlayersWithThreePlayersOnTile() {
		AbstractTile at = new MoveableTile("T");
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		Player p3 = new Player("Tan");
		at.addPlayer(p1);
		at.addPlayer(p2);
		at.addPlayer(p3);
		ArrayList<Player> expected = new ArrayList<Player>();
		expected.add(p1);
		expected.add(p2);
		expected.add(p3);
		ArrayList<Player> actual = at.getPlayers();
		String exp = "";
		for(Player p: expected){
			exp+= p.getColor() + " ";
		}
		String act = "";
		for(Player p: actual){
			act += p.getColor() + " ";
		}
		assertTrue("We expected the following players " + exp + " but got " + act, 
				exp.equals(act) && expected.equals(actual));
	}
	
	@Test
	public void getPlayersWithFourPlayersOnTile() {
		AbstractTile at = new MoveableTile("T");
		Player p1 = new Player("Red");
		Player p2 = new Player("Blue");
		Player p3 = new Player("Tan");
		Player p4 = new Player("White");
		at.addPlayer(p1);
		at.addPlayer(p2);
		at.addPlayer(p3);
		at.addPlayer(p4);
		ArrayList<Player> expected = new ArrayList<Player>();
		expected.add(p1);
		expected.add(p2);
		expected.add(p3);
		expected.add(p4);
		ArrayList<Player> actual = at.getPlayers();
		String exp = "";
		for(Player p: expected){
			exp+= p.getColor() + " ";
		}
		String act = "";
		for(Player p: actual){
			act += p.getColor() + " ";
		}
		assertTrue("We expected the following players " + exp + " but got " + act, 
				exp.equals(act) && expected.equals(actual));
	}
}
