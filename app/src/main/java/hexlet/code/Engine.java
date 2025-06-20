package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNTS = 3;
    public static void run(String rules, Scanner scanner, String userName, String[][] roundsData) {
        System.out.println(rules);

        for (int i = 0; i < ROUND_COUNTS; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
