package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void start(Scanner scanner, String userName) {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = prepareRoundData();
        Engine.run(rules, scanner, userName, roundsData);
    }

    private static String[][] prepareRoundData() {
        String[][] rounds = new String[Engine.ROUND_COUNTS][2];

        for (int i = 0; i < Engine.ROUND_COUNTS; i++) {

            Random random = new Random();
            int number1 = random.nextInt(11);
            int number2 = random.nextInt(11);
            int correctAnswer = gcd(number1, number2);

            rounds[i][0] = number1 + " " + number2;
            rounds[i][1] = Integer.toString(correctAnswer);
        }
        return rounds;
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

