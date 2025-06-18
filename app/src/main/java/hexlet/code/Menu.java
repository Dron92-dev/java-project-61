package hexlet.code;

import java.util.Scanner;

public class Menu {
    public static void choiceMenu(Scanner scanner) {


        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println();
            Cli.greetUser();
        } else if (choice == 2) {
            System.out.println();
            String userName = Cli.greetUser();
            Even.gameIsEven(scanner, userName);
        }
    }
}
