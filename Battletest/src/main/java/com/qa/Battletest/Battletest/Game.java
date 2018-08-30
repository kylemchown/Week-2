package com.qa.Battletest.Battletest;

public class Game {
	private Grid playerGrid = new Grid();
	private Grid computerGrid = new Grid();

	Game() {

	}

	public void addPlayerShip(Ship ship, int row, int col, boolean horiz) {
		try {
			if (horiz) {
				if (this.checkPlayer(ship, row, col, horiz)) {
					for (int i = col - 1; i < col - 1 + ship.getLength(); i++) {
						playerGrid.getGrid()[row - 1][i].setHasShip(true);
					}

				} else {
					System.out.println("Invalid");
				}
			} else {
				if (this.checkPlayer(ship, row, col, horiz)) {
					for (int i = row - 1; i < row - 1 + ship.getLength(); i++) {
						playerGrid.getGrid()[i][col - 1].setHasShip(true);
					}

				} else {
					System.out.println("Invalid");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid Position");
		}
	}
	
	public void addComputerShip(Ship ship, int row, int col, boolean horiz) {
		try {
			if (horiz) {
				if (this.checkPlayer(ship, row, col, horiz)) {
					for (int i = col - 1; i < col - 1 + ship.getLength(); i++) {
						playerGrid.getGrid()[row - 1][i].setHasShip(true);
					}

				} else {
					System.out.println("Invalid");
				}
			} else {
				if (this.checkPlayer(ship, row, col, horiz)) {
					for (int i = row - 1; i < row - 1 + ship.getLength(); i++) {
						playerGrid.getGrid()[i][col - 1].setHasShip(true);
					}

				} else {
					System.out.println("Invalid");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Invalid Position");
		}
	}

	public boolean checkPlayer(Ship ship, int row, int col, boolean horiz) {
		if (horiz) {
			for (int i = col - 1; i < col - 1 + ship.getLength(); i++) {
				if (playerGrid.getGrid()[row - 1][i].isHasShip()) {
					return false;
				}
			}
		} else {
			for (int i = row - 1; i < row - 1 + ship.getLength(); i++) {
				if (playerGrid.getGrid()[i][col - 1].isHasShip()) {
					return false;
				}
			}
		}
		return true;
	}

	public Grid getPlayerGrid() {
		return playerGrid;
	}

	public Grid getComputerGrid() {
		return computerGrid;
	}

	public void printGrids() {
		System.out.println("Player Grid:");
		for (Space[] i : playerGrid.getGrid()) {
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
		
		System.out.println("Computer Grid:");
		for (Space[] i : computerGrid.getGrid()) {
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
