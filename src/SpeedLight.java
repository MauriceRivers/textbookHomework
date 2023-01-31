/**
 * @Class Name: SpeedLight
 * @Author: Maurice Rivers
 * @Version: 1.1
 * @Date: 26 January 2023
 * Description: A program designed to calculate the speed of light
 */




import java.util.Scanner;
public class SpeedLight {
    public static void main(String[]args){
        int SpeedOfSound = 340;//this value will never change

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter time elapsed: ");

        int timeElapsed = Input.nextInt();
        int distance = SpeedOfSound * timeElapsed;
        System.out.println("Speed of sound: " + SpeedOfSound);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance : " + distance);


//edited

    }
}
