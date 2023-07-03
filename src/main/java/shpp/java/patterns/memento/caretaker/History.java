package shpp.java.patterns.memento.caretaker;

import java.util.LinkedList;

import shpp.java.patterns.memento.memento.Memento;

public class History {
    private LinkedList<Memento> textHistory = new LinkedList<>();

    public void save(Memento m) {
        textHistory.push(m);
    }

    public void undo() {
        if (!textHistory.isEmpty()) {
            textHistory.pop();
            textHistory.peek().restore();
        }
    }
}
