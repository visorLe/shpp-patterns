package shpp.java.patterns.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import shpp.java.patterns.memento.originator.EditorField;

public class MementoTest {

    @Test
    void testMemento() {
        EditorField e = new EditorField();
        e.write("String 1 ");
        e.write("+ String 2 ");
        e.save();

        assertEquals("String 1 + String 2 ", e.getText());

        e.write("+ String 3 ");
        e.save();

        assertEquals("String 1 + String 2 + String 3 ", e.getText());

        e.undo();

        assertEquals("String 1 + String 2 ", e.getText());
    }
}
