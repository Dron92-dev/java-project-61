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
                Even.playEven();
                break;
            case Constants.App.CALC:
                Calc.playCalc();
                break;
            case Constants.App.GCD:
                GCD.playGCD();
                break;
            case Constants.App.PROGRESSION:
                Progression.playProgression();
                break;
            case Constants.App.PRIME:
                Prime.playPrime();
                break;
            case Constants.App.EXIT:
                System.out.println(Constants.App.EXIT_MESSAGE);
                break;
            default:
                System.out.println(Constants.App.INCORRECT_CHOICE_MESSAGE);
                break;
        }
        scanner.close();
    }
}
