package battleship;

public class Grid {

	int[] a = { 0, 0, 0 };
	int[] b = { 0, 0, 0 };
	int[] c = { 0, 0, 0 };
	private int[][] grid = { a, b, c };

	Grid() {
		/*
		 * int[] a = {0,0,0}; int[] b = {0,0,0}; int[] c = {0,0,0}; int[][] = {a,b,c};
		 */
	}

	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		this.grid = grid;
	}

	public void addShip(Ship ship, int row, int col, boolean horiz) {
		if (horiz) {
			for(int i = col-1; i<col-1+ship.getLength(); i++) {
				grid[row-1][i] = 1;
			}	
		}
		else {
			for (int i = row-1; i<row-1+ship.getLength(); i++) {
				grid[i][col-1] = 1;
			}
		}
	}
	
	public void printGrid() {
		for(int[] i : grid) {
			for(int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
