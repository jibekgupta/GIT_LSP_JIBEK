package org.howard.edu.lsp.oopfinal.question3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeFactoryTest {
    @Test
    public void testCreateCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }
}
