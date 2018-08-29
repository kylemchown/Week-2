package com.qa.Battletest.Battletest;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid grid = new Grid();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(grid.getGrid()[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		int [][] a = {{0,0,0},{0,0,0},{0,0,0}};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
