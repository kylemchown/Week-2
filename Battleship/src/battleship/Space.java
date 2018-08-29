package battleship;

public class Space {
	private boolean hasShip = false;
	private int status = 0;
    private int lengthOfShip;
    private int directionOfShip;
	
    public boolean isHasShip() {
		return hasShip;
	}
	public void setHasShip(boolean hasShip) {
		this.hasShip = hasShip;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getLengthOfShip() {
		return lengthOfShip;
	}
	public void setLengthOfShip(int lengthOfShip) {
		this.lengthOfShip = lengthOfShip;
	}
	public int getDirectionOfShip() {
		return directionOfShip;
	}
	public void setDirectionOfShip(int directionOfShip) {
		this.directionOfShip = directionOfShip;
	}
    
    
	
	
}
