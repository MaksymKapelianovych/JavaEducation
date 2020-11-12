package notebook.src.controller;

import notebook.src.model.Model;
import notebook.src.model.Note;
import notebook.src.view.View;

import java.util.Scanner;

public class Controller {
    View view;
    Model model;

    Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void process(){
        Scanner sc = new Scanner(System.in);
        InputNote input = new InputNote();
        Note note = input.inputNoteWithScanner(sc);
    }

}
