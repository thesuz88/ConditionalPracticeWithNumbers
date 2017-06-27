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
        do {
            System.out.println("Enter a whole number between 1 and 100: ");

            //checks if the input is a valid integer
            while (!scan.hasNextInt()) {
                String input = scan.next();
                System.out.println(input + " is not a valid input. Enter a whole number between 1 and 100: ");
            }

            //assigns the entered value from user to userNum
            userNum = scan.nextInt();

            //Loops if the userNum is between 1 and 100
            if (userNum >= 1 && userNum <= 100) {

                    // Checks if the userNum is an even number and prints based on value
                    if (userNum % 2 == 0) {
                        if (userNum >= 2 && userNum <= 24) {
                            System.out.println("Even and less than 25.");
                        } else if (userNum >= 26 && userNum <= 60) {
                            System.out.println("Even.");
                        } else {
                            System.out.println(userNum + " Even.");
                        }
                    }

                    // Checks if the userNum is odd and greater than 60
                    else if (userNum % 2 != 0 && userNum > 60) {
                        System.out.println("Odd and over 60.");
                    }

                    // Prints if only other option for userNum was an odd number < 60
                    else {
                        System.out.println("Odd.");
                    }

            }
            else {
                System.out.println("Number entered is not between 1 and 100. ");
            }


            System.out.println("Would you like to enter another number (type y/n)?");
            doAgain = scan.next();

            // Loop keeps iterating...need to figure out how to quit loop with command.
        } while (doAgain.equalsIgnoreCase("y"));
    }
}
