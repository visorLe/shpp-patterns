package shpp.java.patterns.memento.originator;

import shpp.java.patterns.memento.caretaker.History;
import shpp.java.patterns.memento.memento.EditorState;

public class EditorField implements Originator {
    private StringBuilder currentText = new StringBuilder();
    private History history = new History();

    @Override
    public void save() {
        this.history.save(new EditorState(this, this.currentText));
    }

    public void undo() {
        this.history.undo();
    }

    public void write(String text) {
        this.currentText.append(text);
    }

    public void setText(String text) {
        this.currentText = new StringBuilder(text);
    }

    public String getText() {
        return this.currentText.toString();
    }
}
