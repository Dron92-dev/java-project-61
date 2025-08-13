package hexlet.code;

import hexlet.code.util.Constants;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.util.Constants.Engine.ROUND_COUNTS;

public class Engine {
    public final static Random random = new Random();
    public static void run(String rules, String[][] questionsAndAnswers) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(rules);

        for (int i = 0; i < ROUND_COUNTS; i++) {
            String question = questionsAndAnswers[i][Constants.General.QUESTION_INDEX];
            String correctAnswer = questionsAndAnswers[i][Constants.General.ANSWER_INDEX];

            System.out.println(Constants.Engine.QUESTION + question);
            System.out.print(Constants.Engine.ANSWER);
            String Answer = scanner1.nextLine();

            if (Answer.toLowerCase().equals(correctAnswer)) {
                System.out.println(Constants.Engine.CORRECT_MESSAGE);
            } else {
                System.out.println("'" + Answer + "'" + Constants.Engine.WRONG_ANSWER_MESSAGE + "'" + correctAnswer + "'");
                System.out.println(Constants.Engine.TRY_AGAIN_MESSAGE + Cli.userName + "!");
                return;
            }
        }
        System.out.println(Constants.Engine.CONGRATS_MESSAGE + Cli.userName + "!");
    }
}
