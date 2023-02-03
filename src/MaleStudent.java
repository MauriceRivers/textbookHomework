import java.util.Scanner;

/**
 * @Class: MaleStudent
 * @Author: Maurice Rivers
 * @Version: 1.1
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 28 January 2023
 *
 * Description - Calculate the amount of male students in the middle school
 */






public class MaleStudent {
    public static void main(String[]args){
        java.util.Scanner TotalStudent = new java.util.Scanner(System.in);
        System.out.print("How many total students are there: ");
        int Students = TotalStudent.nextInt();

        System.out.print(" How many Female Students are there: ");
        int FemaleStudents = TotalStudent.nextInt();

        int MaleStudent = Students - FemaleStudents;
        System.out.println("There are " + MaleStudent + " Male students in the Middle School");


    }
}
