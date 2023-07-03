package shpp.java.patterns.memento.memento;

import shpp.java.patterns.memento.originator.EditorField;

public class EditorState implements Memento {
    EditorField editor;
    String editorText;

    public EditorState(EditorField editor, StringBuilder editorText) {
        this.editor = editor;
        this.editorText = editorText.toString();
    }

    @Override
    public void restore() {
        editor.setText(editorText);
    }
}
