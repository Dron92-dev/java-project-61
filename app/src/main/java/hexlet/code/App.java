package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.println();
                Cli.greetUser();
            }
            case 2 -> {
                System.out.println();
                String userName = Cli.greetUser();
                Even.start(scanner, userName);
            }
            case 3 -> {
                System.out.println();
                String userName = Cli.greetUser();
                Calc.start(scanner, userName);
            }
        }
        scanner.close();
    }
}
