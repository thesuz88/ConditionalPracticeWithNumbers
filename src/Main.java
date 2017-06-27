import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;

        System.out.println("Enter a number between 1 and 100: ");
        userNum = scan.nextInt();

        if (userNum % 2 == 0) {
            if (userNum >= 2 && userNum <= 24) {
                System.out.println("Even and less than 25.");
            }
            else if (userNum >= 26 && userNum <= 60) {
                System.out.println("Even.");
            }
            else {
                System.out.println(userNum + " Even.");
            }
        }
        else if (userNum % 2 != 0 && userNum > 60){
            System.out.println("Odd and over 60.");
        }
        else {
            System.out.println("Odd.");
        }
    }
}
