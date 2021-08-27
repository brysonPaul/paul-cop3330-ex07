/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        final double FT_TO_METERS_CONVERSION = 0.09290304;
        Boolean controller = true;
        double roomLengthFt = 0,roomWidthFt = 0;
        while(controller){
            try{
                roomLengthFt = Double.parseDouble(strIO("What is the length of the room in feet? " ,sc));
                roomWidthFt = Double.parseDouble(strIO("What is the width of the room in feet? " ,sc));
            } catch (Exception ex ){
                System.out.println("Please enter ONLY numeric values. Try again");
                continue;
            }
            controller = false;
        }
        System.out.println("You entered dimensions of " + roomLengthFt + " feet by " + roomWidthFt + " feet.");
        double areaFt = roomLengthFt * roomWidthFt;
        double areaMeters = areaFt * FT_TO_METERS_CONVERSION;
        System.out.println("The area is \n" + areaFt + " square feet\n" + areaMeters + " square meters" );
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}

