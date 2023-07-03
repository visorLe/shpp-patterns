package shpp.java.patterns.abstract_factory.factories;

import shpp.java.patterns.abstract_factory.components.buttons.Button;
import shpp.java.patterns.abstract_factory.components.buttons.WindowsButton;
import shpp.java.patterns.abstract_factory.components.checkboxes.Checkbox;
import shpp.java.patterns.abstract_factory.components.checkboxes.WindowsCheckbox;

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
