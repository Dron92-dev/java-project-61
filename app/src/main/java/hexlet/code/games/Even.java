package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.util.Constants;

import static hexlet.code.Engine.RANDOM;

public class Even {
    public static void playEven() {
        String rules = Constants.Even.EVEN_RULES;
        String[][] rounds = new String[Constants.Engine.ROUND_COUNTS][Constants.General.ROUND_DATA_SIZE];

        for (int i = 0; i < Constants.Engine.ROUND_COUNTS; i++) {
            int number = RANDOM.nextInt(Constants.Even.MAX_NUMBER);
            String answer = (number % 2 == 0) ? Constants.Even.EVEN_YES : Constants.Even.EVEN_NO;
            rounds[i][Constants.General.QUESTION_INDEX] = Integer.toString(number);
            rounds[i][Constants.General.ANSWER_INDEX] = answer;
        }
        Engine.run(rules, rounds);
    }
}
