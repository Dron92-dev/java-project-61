package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        String userName;

        switch (choice) {
            case 1:
                System.out.println();
                Cli.greetUser();
                break;
            case 2:
                System.out.println();
                userName = Cli.greetUser();
                Even.start(scanner, userName);
                break;
            case 3:
                System.out.println();
                userName = Cli.greetUser();
                Calc.start(scanner, userName);
                break;
            case 4:
                System.out.println();
                userName = Cli.greetUser();
                GCD.start(scanner, userName);
                break;
            case 5:
                System.out.println();
                userName = Cli.greetUser();
                Progression.start(scanner, userName);
                break;
            case 6:
                System.out.println();
                userName = Cli.greetUser();
                Prime.start(scanner, userName);
                break;
        }
        scanner.close();
    }
}
