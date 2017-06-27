import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.lang.String;

public class Main {

    /*
    Created by Steve Suzio on 6/27/2017
    This program will take a user integer input and
    display an output based on the value of the number
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        String doAgain;
        String userName;

        // Has the user enter their name to be used throughout the program.
        System.out.println("Hello, what is your name?");
        userName = scan.nextLine();

        System.out.println("Nice to meet you, " + userName);

        do {
            System.out.println("Enter a whole number between 1 and 100: ");

            //checks if the input is a valid integer
            while (!scan.hasNextInt()) {
                String input = scan.next();
                System.out.println(input + " is not a valid input, " + userName + ". Enter a whole number between 1 and 100: ");
            }

            //assigns the entered value from user to userNum
            userNum = scan.nextInt();

            //Loops if the userNum is between 1 and 100
            if (userNum >= 1 && userNum <= 100) {

                    // Checks if the userNum is an even number and prints based on value
                    if (userNum % 2 == 0) {
                        if (userNum >= 2 && userNum <= 24) {
                            System.out.println("You entered " + userNum + ", " + userName + ". It is even and less than 25.");
                        } else if (userNum >= 26 && userNum <= 60) {
                            System.out.println("Even.");
                        } else {
                            System.out.println(userNum + " Even.");
                        }
                    }

                    // Checks if the userNum is odd and greater than 60
                    else if (userNum % 2 != 0 && userNum > 60) {
                        System.out.println("You entered " + userNum + ", " + userName + ". It is odd and over 60.");
                    }

                    // Prints if only other option for userNum was an odd number < 60
                    else {
                        System.out.println("Odd.");
                    }

            }
            else {
                // If the user
                System.out.println("Clearly you need help with your numbers, " + userName +
                        ". The number you entered is not between 1 and 100. ");
            }

            // Gets user input for whether they would like to continue or not
            System.out.println("Would you like to enter another number, " + userName + "? (type y/n): ");
            doAgain = scan.next();

            // Loop keeps iterating if user enters "y" otherwise, it quits.
        } while (doAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you for playing with me, " + userName + ". Have a nice day!");
    }
}
