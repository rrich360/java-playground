package com.galvanize;

import java.util.Scanner;

public class Application {

    public static boolean isActive(String status) {
        // Implement your solution

        if (status.equals("active")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        String status;

        do
        {
            System.out.println("Please enter a status that literally says,'active':");
            Scanner in = new Scanner(System.in);
            status = in.next();
        } while ( !isActive(status) );
        System.out.println("Thank you.");

    }
}