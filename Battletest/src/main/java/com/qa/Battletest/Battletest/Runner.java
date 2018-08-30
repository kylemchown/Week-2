package com.qa.Battletest.Battletest;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		/*Ship ship = new Ship(2);
		Grid grid = new Grid();
		grid.printGridShips();
		grid.addShip(ship, 2, 2, true);
		grid.printGridShips();
		grid.addShip(ship, 1, 2, false);
		grid.printGridShips();*/
		
		Ship ship = new Ship(2);
		
		Game game = new Game();
		game.getPlayerGrid().printGridShips();
		game.addPlayerShip(ship, 2, 2, true);
		game.addPlayerShip(ship, 1, 1, false);		
		game.addComputerShip(ship, 2, 2, true);
		game.addComputerShip(ship, 1, 1, false);		
		game.printGrids();
		
	}

}
