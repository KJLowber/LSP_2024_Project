package org.howard.edu.lsp.oopfinal.question3;

public class Client {
	public static void main (String[] args) {
		Shape c = ShapeFactory.createCircle();
		c.draw();
		Shape rec = ShapeFactory.createRectangle();
		rec.draw();
	}
}
