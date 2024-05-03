package org.howard.edu.lsp.oopfinal.question3;

public class ShapeFactory {
    public static Shape createCircle() {
        return new Circle();
    }

    public static Shape createRectangle() {
        return new Rectangle();
    }
}
