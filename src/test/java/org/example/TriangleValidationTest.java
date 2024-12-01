package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for program that validates whether three numbers can be sides of a triangle
 *  * and indicates the type of that triangle.
 */
class TriangleValidationTest {

    @ParameterizedTest
    @CsvSource({
            "-3, -5, -4, INVALID",
            "-3, 5, 4, INVALID",
            "0, 0, 0, INVALID",
            "0, 4, 5, INVALID",
            "1, 2, 3, INVALID",
            "1, 10, 2, INVALID",
            "1, 1, 1, EQUILATERAL",
            "2, 2, 3, ISOSCELES",
            "3, 4, 5, RIGHT"
    })
    void testCheckTriangle(double a, double b, double c, String expected) {
        assertEquals(expected, Main.triangleValidation(a, b, c));
    }
}
