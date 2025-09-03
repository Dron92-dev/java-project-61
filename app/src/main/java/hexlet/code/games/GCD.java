package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.util.Constants;

import static hexlet.code.Engine.RANDOM;

public class GCD {
    public static void playGCD() {
        String rules = Constants.GCD.GCD_RULES;
        String[][] rounds = new String[Constants.Engine.ROUND_COUNTS][Constants.General.ROUND_DATA_SIZE];

        for (int i = 0; i < Constants.Engine.ROUND_COUNTS; i++) {

            int numberOne = RANDOM.nextInt(11);
            int numberTwo = RANDOM.nextInt(11);

            rounds[i][Constants.General.QUESTION_INDEX] = numberOne + " " + numberTwo;
            rounds[i][Constants.General.ANSWER_INDEX] = Integer.toString(gcd(numberOne, numberTwo));
        }
        Engine.run(rules, rounds);
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

