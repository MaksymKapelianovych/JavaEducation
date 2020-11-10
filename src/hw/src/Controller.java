package hw.src;

import java.util.Scanner;


public class Controller {


    private Model model;
    private View view;

    //constructor
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void workMethod(){
        Scanner sc = new Scanner(System.in);

        model.setFirstWord(inputWordWithScanner(sc, View.INPUT_FIRST_WORD, Model.HELLO));
        model.setSecondWord(inputWordWithScanner(sc, View.INPUT_SECOND_WORD, Model.WORLD));

        view.printMessage(View.OUTPUT_RESULT + model.getFirstWord() + " " + model.getSecondWord());
    }

    private String inputWordWithScanner(Scanner sc, String whatWord, String requiredWord) {
        String input = "";
        view.printMessage(whatWord + requiredWord);

        if (sc.hasNext()) {
            input = sc.nextLine();
        }

        while (!input.equals(requiredWord)) {
            view.printMessage(View.WRONG_INPUT_WORD);
            input = sc.nextLine();
        }
        return input;
    }
}
