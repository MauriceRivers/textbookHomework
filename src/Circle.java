/**
 * @Class: Circle
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 28 January 2023
 *
 * Description - display the area and perimeter of a circle with a radius of 9.5
 */






public class Circle {
    public static void main(String[]args){
        double x = 9.5;
        double area = x * x * Math.PI;
        double perimeter = 2 * x * Math.PI;
        System.out.println("Area of a circle with the radius of 9.5 = " + area);
        System.out.println("Perimeter of a circle with the radius of 9.5 = " + perimeter);
    }
}
