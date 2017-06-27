import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;

        System.out.println("Enter a number between 1 and 100: ");
        userNum = scan.nextInt();

        if (userNum % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
