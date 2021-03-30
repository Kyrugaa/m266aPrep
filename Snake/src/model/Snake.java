package model;


public class Snake {
	
	public int xPos;
	public int yPos;
	public int laenge = 1;
	
	
	public Snake(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;

	}
	
	
	public void moveUp(int yPos) {
		if (yPos > 0) {
			this.yPos = this.yPos - yPos;
		}
	}
	
	public void moveDown(int yPos) {
		if (yPos > 0) {
			this.yPos = this.yPos + yPos;
		}
	}
	
	public void moveRight(int xPos) {
		if (xPos > 0) {
			this.xPos = this.xPos + xPos;
		}
	}
	
	public void moveLeft(int xPos) {
		if (xPos > 0) {
			this.xPos = this.xPos - xPos;
		}
	}
}


