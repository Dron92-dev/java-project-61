package hexlet.code;

import hexlet.code.util.Constants;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.util.Constants.Engine.ROUND_COUNTS;

public class Engine {
    public static final Random RANDOM = new Random();

    public static void run(String rules, String[][] questionsAndAnswers) {
        GreetUtils.greetUser();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(rules);

        for (int i = 0; i < ROUND_COUNTS; i++) {
            String question = questionsAndAnswers[i][Constants.General.QUESTION_INDEX];
            String correctAnswer = questionsAndAnswers[i][Constants.General.ANSWER_INDEX];

            System.out.println(Constants.Engine.QUESTION + question);
            System.out.print(Constants.Engine.ANSWER);
            String answer = scanner1.nextLine();

            if (answer.toLowerCase().equals(correctAnswer)) {
                System.out.println(Constants.Engine.CORRECT_MESSAGE);
            } else {
                System.out.print("'" + answer + "'" + Constants.Engine.WRONG_ANSWER_MESSAGE);
                System.out.println("'" + correctAnswer + "'");
                System.out.println(Constants.Engine.TRY_AGAIN_MESSAGE + GreetUtils.getUserName() + "!");
                return;
            }
        }
        System.out.println(Constants.Engine.CONGRATS_MESSAGE + GreetUtils.getUserName() + "!");
    }
}
