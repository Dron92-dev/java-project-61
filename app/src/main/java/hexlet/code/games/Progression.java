package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.util.Constants;

import static hexlet.code.Engine.RANDOM;
import static hexlet.code.util.Constants.Engine.ROUND_COUNTS;
import static hexlet.code.util.Constants.General.ANSWER_INDEX;
import static hexlet.code.util.Constants.General.QUESTION_INDEX;
import static hexlet.code.util.Constants.General.ROUND_DATA_SIZE;
import static hexlet.code.util.Constants.Progression.DEFAULT_LENGTH;
import static hexlet.code.util.Constants.Progression.HIDDEN_ELEMENT;
import static hexlet.code.util.Constants.Progression.MIN_LENGTH;
import static hexlet.code.util.Constants.Progression.PROGRESSION_RULES;

public class Progression {
    public static void playProgression() {
        String[][] rounds = new String[ROUND_COUNTS][ROUND_DATA_SIZE];

        for (int i = 0; i < ROUND_COUNTS; i++) {
            int length = RANDOM.nextInt(DEFAULT_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = RANDOM.nextInt(Constants.Progression.MAX_NUMBER_START) + 1;
            int step = RANDOM.nextInt(Constants.Progression.MAX_NUMBER_STEP) + 1;
            int hiddenIndex = RANDOM.nextInt(length);

            rounds[i][QUESTION_INDEX] = generateProgression(start, step, length, hiddenIndex);
            rounds[i][ANSWER_INDEX] = String.valueOf(start + hiddenIndex * step);
        }
        Engine.run(PROGRESSION_RULES, rounds);
    }

    private static String generateProgression(int start, int step, int length, int hiddenIndex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i == hiddenIndex) {
                sb.append(HIDDEN_ELEMENT).append(" ");
            } else {
                sb.append(start + i * step).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
