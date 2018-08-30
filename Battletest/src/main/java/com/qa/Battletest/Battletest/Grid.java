package com.qa.Battletest.Battletest;

public class Grid {

	private Space[][] grid = new Space[3][3];

	Grid() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = new Space();
			}
		}
	}

	public Space[][] getGrid() {
		return grid;
	}

	public void setGrid(Space[][] grid) {
		this.grid = grid;
	}

	public void printGridHits() {
		for (Space[] i : grid) {
			for (Space j : i) {
				System.out.print(j.getHitResult());
			}
			System.out.println();
		}
		System.out.println();
	}

	public void printGridShips() {
		for (Space[] i : grid) {
			for (Space j : i) {
				if (j.isHasShip()) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
