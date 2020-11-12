package notebook.src.model;

/**
 * This class created for store all notes. It contains methods for add notes.
 *
 */
public class Model {
    Notebook notebook = new Notebook();

    public void addNote(Note note){
        notebook.addNote(note);
    }

}
