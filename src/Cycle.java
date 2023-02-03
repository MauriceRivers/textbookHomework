/**
 * @Class: Cycle
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 28 January 2023
 *
 * Description - Calculator for how many tricycles are in the shop
 */






public class Cycle {
    public static void main(String[]args){
        java.util.Scanner Bike = new java.util.Scanner(System.in);
        System.out.print("How many total wheels are in the shop: ");
        int wheels = Bike.nextInt();

        System.out.print("How many Bicycles are in the shop: ");
        int Bicycles = Bike.nextInt();

        int BicycleWheels = 2;
        int TotalBicycleWheels = BicycleWheels * Bicycles;
        System.out.println("There are " + TotalBicycleWheels + " bicycle wheels in the shop");

        int TotalWheels = wheels - TotalBicycleWheels;
        System.out.println("There are " + TotalWheels + " tricycle wheels in the shop");
        double WheelsPerTricycle = 3;

        double TricycleWheels = TotalWheels / WheelsPerTricycle;


        System.out.println("There are " + TricycleWheels + " tricycles in the shop");


    }
}
