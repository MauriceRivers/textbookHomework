/**
 * @Class: Circle
 * @Author: Maurice Rivers
 * @Version: 1.1
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 28 January 2023
 *
 * Description - Program to Calculate the area and perimeter of a circle
 */





import java.util.Scanner;
public class Circle {
    public static void main(String[]args){

        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.print("Enter the radius of your circle: ");

        double radius = Input.nextDouble();
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area of a circle with the radius of " + radius + " = " + area);
        System.out.println("Perimeter of a circle with the radius of " + radius + " = " + perimeter);
    }
}
