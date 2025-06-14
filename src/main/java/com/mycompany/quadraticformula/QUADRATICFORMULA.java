/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadraticformula;

/**
 *
 * @author polit
 */
import java.util.Scanner;

public class QUADRATICFORMULA {
    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);

        System.out.println("Enter the Coefficients a, b, and c:");
        double a = SCAN.nextDouble();
        double b = SCAN.nextDouble();
        double c = SCAN.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Discriminant (D) = " + discriminant);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real and distinct roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Two real and equal roots:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex roots:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

    }
}
