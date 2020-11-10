package game;

public class View {
    public static final String START_WORDS = "Hi! Let's play. Try to guess the number";
    public static final String WRONG_INPUT_NUMBER = "The input is not correct! ";
    public static final String OUTPUT_RESULT_NUMBER = "Congratulations! You guessed it right! The secret number is ";
    public static final String OUTPUT_ATTEMPTS_AMOUNT = "Amount of attempts: ";
    public static final String OUTPUT_ATTEMPTS = "List of yours attempts: ";
    public static final String INPUT_NUMBER = "Input INT number ";
    public static final String FROM = "from ";
    public static final String TO = " to ";
    public static final String COLON = ":";

    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printRange(int min, int max) {
        System.out.println(INPUT_NUMBER + FROM + min + TO + max + COLON);

    }
}
