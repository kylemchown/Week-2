package com.qa.Battletest.Battletest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Tests {

	Grid grid = new Grid();
	Ship ship = new Ship(2);

	@Test
	@Ignore
	public void test1() {
		int[][] a = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		// int [][] b = grid.getGrid();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[1].length; j++) {
				assertSame(a[i][j], grid.getGrid()[i][j]);
			}
		}
	}

	@Test //Adding a ship changes appropriate spaces to 1
	public void test2() {
		grid.addShip(ship, 2, 2, true);
		int[][] a = { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 0 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[1].length; j++) {
				assertSame(a[i][j], grid.getGrid()[i][j]);
			}
		}
	}

	@Test //Placing ship off edge of grid means no spaces are changed
	public void test3() {
		int[][] a = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		grid.addShip(ship, 2, 3, true);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[1].length; j++) {
				assertSame(a[i][j], grid.getGrid()[i][j]);
			}
		}
	}
	
	@Test //Placing a ship on another ship fails
	public void test4() {
		int[][] a = { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 0 } };
		grid.addShip(ship, 2, 2, true);
		grid.addShip(ship, 1, 2, false);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[1].length; j++) {
				assertSame(a[i][j], grid.getGrid()[i][j]);
			}
		}
	}
}
