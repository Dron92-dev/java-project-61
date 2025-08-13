package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.util.Constants;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Constants.App.INPUT_GAME_NUMBER);
        System.out.println(Constants.App.MENU_GREET);
        System.out.println(Constants.App.MENU_EVEN);
        System.out.println(Constants.App.MENU_CALC);
        System.out.println(Constants.App.MENU_GCD);
        System.out.println(Constants.App.MENU_PROGRESSION);
        System.out.println(Constants.App.MENU_PRIME);
        System.out.println(Constants.App.MENU_EXIT);
        System.out.print(Constants.App.YOUR_CHOICE);

        int choice = scanner.nextInt();
        scanner.nextLine();


        switch (choice) {
            case Constants.App.GREET:
                Cli.greetUser();
                break;
            case Constants.App.EVEN:
                Cli.greetUser();
                Even.playEven();
                break;
            case Constants.App.CALC:
                Cli.greetUser();
                Calc.playCalc();
                break;
            case Constants.App.GCD:
                Cli.greetUser();
                GCD.playGCD();
                break;
            case Constants.App.PROGRESSION:
                Cli.greetUser();
                Progression.playProgression();
                break;
            case Constants.App.PRIME:
                Cli.greetUser();
                Prime.playPrime();
                break;
            case Constants.App.EXIT:
                System.out.println("You have left the game!");
                break;
            default:
                System.out.println("Incorrect information entered");
                break;
        }
        scanner.close();
    }
}
