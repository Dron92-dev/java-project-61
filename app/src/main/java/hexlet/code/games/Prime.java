package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.util.Constants;

import static hexlet.code.Engine.RANDOM;

public class Prime {
    public static void playPrime() {
        String[][] rounds = new String[Constants.Engine.ROUND_COUNTS][Constants.General.ROUND_DATA_SIZE];

        for (int i = 0; i < Constants.Engine.ROUND_COUNTS; i++) {

            int number = RANDOM.nextInt(11);
            String correctAnswer = isPrime(number) ? Constants.Prime.PRIME_YES : Constants.Prime.PRIME_NO;

            rounds[i][Constants.General.QUESTION_INDEX] = Integer.toString(number);
            rounds[i][Constants.General.ANSWER_INDEX] = correctAnswer.toLowerCase();
        }
        Engine.run(Constants.Prime.PRIME_RULES, rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
