package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int DEFAULT_LENGTH = 10;
    private static final Random random = new Random();

    public static void start(Scanner scanner, String userName) {
        String rules = "What number is missing in the progression?";
        String[][] roundsData = prepareRoundData();
        Engine.run(rules, scanner, userName, roundsData);
    }

    private static String[][] prepareRoundData() {
        String[][] rounds = new String[Engine.ROUND_COUNTS][2];

        for (int i = 0; i < Engine.ROUND_COUNTS; i++) {
            int length = random.nextInt(DEFAULT_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(10) + 1;
            int hiddenIndex = random.nextInt(length);

            rounds[i][0] = generateProgression (start, step, length, hiddenIndex);
            rounds[i][1] = String.valueOf(start + hiddenIndex * step);
        }
        return rounds;
    }

    private static String generateProgression(int start, int step, int length, int hiddenIndex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i == hiddenIndex) {
                sb.append(".. ");
            } else {
                sb.append(start + i * step).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
