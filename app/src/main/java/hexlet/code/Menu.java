package hexlet.code;

import java.util.Scanner;

public class Menu {
    public static void choiceMenu() {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println();
            Cli.greetUser();
        }
        scanner.close();
    }
}
