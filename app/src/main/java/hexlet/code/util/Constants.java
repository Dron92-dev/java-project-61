package hexlet.code.util;

public class Constants {
    public static class General {
        public static final String LINE_BREAKER = "\n";
        public static final int QUESTION_INDEX = 0;
        public static final int ANSWER_INDEX = 1;
        public static final int ROUND_DATA_SIZE = 2;
    }

    public static class GreetUtils {
        public static final String HELLO_MESSAGE = "Hello, ";
        public static final String WELCOME_MESSAGE = "Welcome to the Brain Games!\nMay I have your name? ";
    }

    public static class App {
        public static final String INPUT_GAME_NUMBER = "Please enter the game number and press Enter.";
        public static final String MENU_GREET = "1 - Greet";
        public static final String MENU_EVEN = "2 - Even";
        public static final String MENU_CALC = "3 - Calc";
        public static final String MENU_GCD = "4 - GCD";
        public static final String MENU_PROGRESSION = "5 - Progression";
        public static final String MENU_PRIME = "6 - Prime";
        public static final String MENU_EXIT = "0 - Exit";
        public static final String YOUR_CHOICE = "Your choice: ";
        public static final String EXIT_MESSAGE = "You have left the game!";
        public static final String INCORRECT_CHOICE_MESSAGE = "Incorrect information entered";
        public static final int GREET = 1;
        public static final int EVEN = 2;
        public static final int CALC = 3;
        public static final int GCD = 4;
        public static final int PROGRESSION = 5;
        public static final int PRIME = 6;
        public static final int EXIT = 0;
    }

    public static class Engine {
        public static final String QUESTION = "Question: ";
        public static final String ANSWER = "Your answer: ";
        public static final String WRONG_ANSWER_MESSAGE = " is wrong answer ;(. Correct answer was ";
        public static final String TRY_AGAIN_MESSAGE = "Let's try again, ";
        public static final String CORRECT_MESSAGE = "Correct!";
        public static final String CONGRATS_MESSAGE = "Congratulations, ";
        public static final int ROUND_COUNTS = 3;
    }

    public static class Even {
        public static final String EVEN_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        public static final String EVEN_YES = "yes";
        public static final String EVEN_NO = "no";
    }

    public static class Calc {
        public static final String ADDITION_OPERATOR = "+";
        public static final String SUBTRACTION_OPERATOR = "-";
        public static final String MULTIPLICATION_OPERATOR = "*";
    }

    public static class GCD {
        public static final String GCD_RULES = "Find the greatest common divisor of given numbers.";
    }

    public static class Progression {
        public static final String PROGRESSION_RULES = "What number is missing in the progression?";
        public static final String HIDDEN_ELEMENT = "..";
        public static final int MIN_LENGTH = 5;
        public static final int DEFAULT_LENGTH = 10;
    }

    public static class Prime {
        public static final String PRIME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        public static final String PRIME_YES = "Yes";
        public static final String PRIME_NO = "No";
    }
}
