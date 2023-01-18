package org.example.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    @Test
    void isScalene() {

        var t = new Triangle(new Point(0, 0), new Point(25, 24), new Point(10, 10));

        assertTrue(t.isScalene());
    }

    @Test
    void isScaleneFalse() {

        var t = new Triangle(new Point(0, 0), new Point(0, 0), new Point(10, 10));

        assertFalse(t.isScalene());
    }


    @Test
    void isEquilateral() {
        var t = new Triangle(5, 5, 5);

        assertTrue(t.isEquilateral());
    }

    @Test
    void isEquilateralFalse() {
        var t = new Triangle(5, 4, 5);

        assertFalse(t.isEquilateral());
    }

    @Test
    void isEquilateralFromPointArray() {

        Point[] p = new Point[]{new Point(5, 5), new Point(5, 5), new Point(5, 5)};
        var t = new Triangle(p);

        assertTrue(t.isEquilateral());
    }

    @Test
    void isIsosceles() {
        double[] d = new double[]{4, 4, 5};
        var t = new Triangle(d);

        assertTrue(t.isIsosceles());
    }

    @Test
    void isIsoscelesFalse() {
        double[] d = new double[]{4, 4, 4};
        var t = new Triangle(d);

        assertFalse(t.isIsosceles());
    }


}