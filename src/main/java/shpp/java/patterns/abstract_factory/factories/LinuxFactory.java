package shpp.java.patterns.abstract_factory.factories;

import shpp.java.patterns.abstract_factory.components.buttons.Button;
import shpp.java.patterns.abstract_factory.components.buttons.LinuxButton;
import shpp.java.patterns.abstract_factory.components.checkboxes.Checkbox;
import shpp.java.patterns.abstract_factory.components.checkboxes.LinuxCheckbox;

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
