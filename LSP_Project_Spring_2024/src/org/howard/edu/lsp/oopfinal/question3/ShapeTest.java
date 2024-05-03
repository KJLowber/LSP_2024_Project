package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeTest {
	@Test
	@DisplayName("Test case for circle")
	public void testCreateCircle() {
		Shape circle = ShapeFactory.createCircle();
		assertEquals("I'm a Circle!!!", circle.draw());
	}
	@Test
	@DisplayName("Test case for rectangle")
	public void testCreateRectangle() {
		Shape rectangle = ShapeFactory.createRectangle();
		assertEquals("I'm a Circle!!!", rectangle.draw());
	}
}
