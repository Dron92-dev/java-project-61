package hexlet.code;

import hexlet.code.util.Constants;

import java.util.Scanner;

public class GreetUtils {
    static String userName;

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Constants.General.LINE_BREAKER + Constants.GreetUtils.WELCOME_MESSAGE);

        userName = scanner.nextLine();
        System.out.println(Constants.GreetUtils.HELLO_MESSAGE + userName + "!");
    }
}
