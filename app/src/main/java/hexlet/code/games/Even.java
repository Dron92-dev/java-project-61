package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void start(Scanner scanner, String userName) {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = prepareRoundData();
        Engine.run(rules, scanner, userName, roundsData);
    }

    private static String[][] prepareRoundData() {
        String[][] rounds = new String[Engine.ROUND_COUNTS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUND_COUNTS; i++) {
            int number = random.nextInt(101);
            rounds[i][0] = Integer.toString(number);
            rounds[i][1] = (number % 2 == 0) ? "yes" : "no";
        }
        return rounds;
    }
}
