package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * This class will include the user interface which will keep the information
 * entered through the command line and later publish the results of the water control. It will save the provided info to file (Scanner, FileWriter)
 * and in the end read that information and publish the results (File reader)
 */
public class ControlOrder {

    public static void displayMenu() {
            System.out.println("Request a control");
            System.out.println("\n");
            System.out.println(" Enter the relavant information ");
            System.out.println("1. Provide location");
            System.out.println("2. Choose laboratory");
            System.out.println("3. Choose type of control");

    }
}
