package notebook.src.model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notes = new ArrayList<>();

    public List<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note){
        if(note == null){
            return;
        }

        notes.add(note);
    }
}
