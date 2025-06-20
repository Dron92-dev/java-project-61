package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start(Scanner scanner, String userName) {
        String rules = "What is the result of the expression?";
        String[][] roundsData = prepareRoundData();
        Engine.run(rules, scanner, userName, roundsData);
    }

    private static String[][] prepareRoundData() {
        String[][] rounds = new String[Engine.ROUND_COUNTS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUND_COUNTS; i++) {
            int number1 = random.nextInt(11);
            int number2 = random.nextInt(11);
            String[] operators = {"+", "-", "*"};
            String op = operators[random.nextInt(operators.length)];

            int correctAnswer = 0;
            switch(op) {
                case "+" -> correctAnswer = number1 + number2;
                case "-" -> correctAnswer = number1 - number2;
                case "*" -> correctAnswer = number1 * number2;
            }
            rounds[i][0] = number1 + op + number2;
            rounds[i][1] = Integer.toString(correctAnswer);
        }
        return rounds;
    }
}
