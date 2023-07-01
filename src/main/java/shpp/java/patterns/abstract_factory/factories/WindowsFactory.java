package shpp.java.patterns.abstract_factory.factories;

import shpp.java.patterns.abstract_factory.buttons.Button;
import shpp.java.patterns.abstract_factory.buttons.WindowsButton;
import shpp.java.patterns.abstract_factory.checkboxes.Checkbox;
import shpp.java.patterns.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
