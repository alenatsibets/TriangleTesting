package org.example;

import java.util.Scanner;

/**
 * Program to validate whether three numbers can be sides of a triangle
 * and to indicate the type of that triangle.
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextInt();
        System.out.print("Enter side b: ");
        double b = scanner.nextInt();
        System.out.print("Enter side c: ");
        double c = scanner.nextInt();

        String result = triangleValidation(a, b, c);
        System.out.println(result);
    }

    public static String triangleValidation(double sideA, double sideB, double sideC) {
        String state = "REGULAR";
        boolean isValid = sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            isValid = false;
        }


        if ((sideA == sideB || sideB == sideC
                || sideA == sideC) && isValid) {
            state = "ISOSCELES";
        }

        if (sideA == sideB && sideB == sideC && isValid) {
            state = "EQUILATERAL";
        }

        if ((sideA * sideA + sideB * sideB == sideC * sideC
                || sideB * sideB + sideC * sideC == sideA * sideA
                || sideA * sideA + sideC * sideC == sideB * sideB)
                && isValid) {
            state = "RIGHT";
        }

        if (!isValid) {
            state = "INVALID";
        }

        return state;
    }
}
