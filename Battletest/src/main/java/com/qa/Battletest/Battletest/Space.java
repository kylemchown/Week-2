package com.qa.Battletest.Battletest;

public class Space {
	private boolean hasShip = false;
	private int hitResult = 0; //0 - not chosen, 1- hit, 2- miss
	
	public boolean isHasShip() {
		return hasShip;
	}
	public void setHasShip(boolean hasShip) {
		this.hasShip = hasShip;
	}
	public int getHitResult() {
		return hitResult;
	}
	public void setHitResult(int hitResult) {
		this.hitResult = hitResult;
	}
	
	
}
