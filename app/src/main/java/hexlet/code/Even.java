package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void gameIsEven(Scanner scanner, String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int answerCount = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Question: ");
            Random random = new Random();
            int randomInt = random.nextInt(101);
            System.out.println(randomInt);

            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();

            boolean isEven = randomInt % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                answerCount++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        if (answerCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}