package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void start(Scanner scanner, String userName) {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = prepareRoundData();
        Engine.run(rules, scanner, userName, roundsData);
    }

    private static String[][] prepareRoundData() {
        String[][] rounds = new String[Engine.ROUND_COUNTS][2];

        for (int i = 0; i < Engine.ROUND_COUNTS; i++) {

            Random random = new Random();
            int number = random.nextInt(11);
            String correctAnswer = prime(number);

            rounds[i][0] = Integer.toString(number);
            rounds[i][1] = correctAnswer.toLowerCase();
        }
        return rounds;
    }

    private static String prime(int n) {
        String result = "Yes";
        if (n < 2) {
            result = "No";
        } else if (n == 2) {
            result = "Yes";
        } else if (n % 2 == 0) {
            result = "No";
        } else {
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    result = "No";
                    break;
                }
            }
        }
        return result;
    }
}
