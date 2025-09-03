package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.util.Constants;

import static hexlet.code.Engine.random;

public class Calc {
    public static void playCalc() {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[Constants.Engine.ROUND_COUNTS][Constants.General.ROUND_DATA_SIZE];

        for (int i = 0; i < Constants.Engine.ROUND_COUNTS; i++) {
            int numberOne = random.nextInt(11);
            int numberTwo = random.nextInt(11);
            String[] operators = {Constants.Calc.ADDITION_OPERATOR, Constants.Calc.SUBTRACTION_OPERATOR, Constants.Calc.MULTIPLICATION_OPERATOR};
            String op = operators[random.nextInt(operators.length)];

            int correctAnswer = 0;
            switch (op) {
                case "+":
                    correctAnswer = numberOne + numberTwo;
                    break;
                case "-":
                    correctAnswer = numberOne - numberTwo;
                    break;
                case "*":
                    correctAnswer = numberOne * numberTwo;
                    break;
            }
            rounds[i][Constants.General.QUESTION_INDEX] = numberOne + op + numberTwo;
            rounds[i][Constants.General.ANSWER_INDEX] = Integer.toString(correctAnswer);
        }
        Engine.run(rules, rounds);
    }
}
