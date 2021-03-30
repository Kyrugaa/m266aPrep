package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Snake;

public class TestSnake {

	@Test
	public void testKonstruktor() {
		Snake schlange = new Snake(100, 100);
		
		assertEquals(100, schlange.xPos);
		assertEquals(100, schlange.yPos);
		
	}
	
	@Test
	public void testUp() {
		Snake schlange = new Snake(100, 100);
		
		schlange.moveUp(50);
		
		assertEquals(50, schlange.yPos);
	}
	
	
	@Test
	public void testDown() {
		Snake schlange = new Snake(100, 100);
		
		schlange.moveDown(50);
		
		assertEquals(150, schlange.yPos);
	}
	
	@Test
	public void testRight() {
		Snake schlange = new Snake(100, 100);
		
		schlange.moveRight(50);
		
		assertEquals(150, schlange.xPos);
	}
	
	@Test
	public void testLeft() {
		Snake schlange = new Snake(100, 100);
		
		schlange.moveLeft(50);
		
		assertEquals(50, schlange.xPos);
	}
	
	@Test
	public void testUpNegative() {
		Snake schlange = new Snake(0,0);
		
		schlange.moveUp(-50);
		
		assertEquals(0, schlange.yPos);
	}
	
	@Test
	public void testDownNegative() {
		Snake schlange = new Snake(0,100);
		
		schlange.moveDown(-50);
		
		assertEquals(100, schlange.yPos);
	}
	
	@Test
	public void testRightNegative() {
		Snake schlange = new Snake(0,100);
		
		schlange.moveRight(-50);
		
		assertEquals(0, schlange.xPos);
	}
	
	@Test
	public void testLeftNegative() {
		Snake schlange = new Snake(0,100);
		
		schlange.moveLeft(-50);
		
		assertEquals(0, schlange.xPos);
	}
}
