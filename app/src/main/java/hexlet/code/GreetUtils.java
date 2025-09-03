package hexlet.code;

import hexlet.code.util.Constants;

import java.util.Scanner;

public class GreetUtils {
    private static String userName;

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Constants.General.LINE_BREAKER + Constants.GreetUtils.WELCOME_MESSAGE);

        setUserName(scanner.nextLine());
        System.out.println(Constants.GreetUtils.HELLO_MESSAGE + getUserName() + "!");
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String name) {
        userName = name;
    }
}
