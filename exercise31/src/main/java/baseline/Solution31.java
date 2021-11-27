package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Take user input of:
        age = in.newInt();
        restingPulse = in.newInt()

        intensity = 55 (loop) (55 + 5) until intensity = 95
        obtain targetHeartRate:
        targetHeartRate = (((220 - age) - restingHeartRate) * intensity) + restingHeartRate;
         */
        generateKarvonenHeartRate();
    }

    public static void generateKarvonenHeartRate() {
        System.out.print("Resting Pulse: ");
        int rp = in.nextInt();
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.print("--------------------\n");
        int intensity = 55;
        while (intensity < 100) {
            double intensityPercentage = intensity * .01;
            double targetHeartRate = (((220 - age) - rp) * intensityPercentage) + rp;
            double targetHeartRateRounded = targetHeartRate * 100/100;
            System.out.print(intensity + "%\t\t|\t" + Math.round(targetHeartRateRounded) + " bpm\n");
            intensity = intensity + 5;
        }

    }
}
