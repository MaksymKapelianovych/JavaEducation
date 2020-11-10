package game;

import java.util.Scanner;

public class Controller {
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 100;
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void workMethod(){
        Scanner in = new Scanner(System.in);

        model.setRange(MIN_VALUE, MAX_VALUE);
        model.setSecretNumber();

        view.printMessage(View.START_WORDS);

        while(model.checkNumber(inputIntValueWithScanner(in)));

        view.printMessage(View.OUTPUT_RESULT_NUMBER + model.getSecretNumber());
        view.printMessage(View.OUTPUT_ATTEMPTS_AMOUNT + model.getAttempts().size());
        view.printMessage(View.OUTPUT_ATTEMPTS + model.getAttempts().toString());
    }

    private int inputIntValueWithScanner(Scanner in) {
        int number;
        view.printRange(model.getMinValue(), model.getMaxValue());
        while(true){
            // check int-value
            while (!in.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_NUMBER);
                view.printRange(model.getMinValue(), model.getMaxValue());
                in.next();
            }
            if ((number = in.nextInt()) <= model.getMinValue() ||
                    number >= model.getMaxValue()) {
                view.printMessage(View.WRONG_INPUT_NUMBER);
                view.printRange(model.getMinValue(), model.getMaxValue());
                continue;
            }
            break;
        }
        return number;
    }

}
