package battleship;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid grid = new Grid();
		grid.printGrid();
		
		System.out.println();
		
		Ship a = new Ship(2);
		grid.addShip(a, 2, 3, false);
		
		grid.printGrid();
		grid.addShip(a, 2, 1, true);
		grid.printGrid();
	}

}
