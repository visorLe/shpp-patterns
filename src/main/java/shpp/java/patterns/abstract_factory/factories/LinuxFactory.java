package shpp.java.patterns.abstract_factory.factories;

import shpp.java.patterns.abstract_factory.buttons.Button;
import shpp.java.patterns.abstract_factory.buttons.LinuxButton;
import shpp.java.patterns.abstract_factory.checkboxes.Checkbox;
import shpp.java.patterns.abstract_factory.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
