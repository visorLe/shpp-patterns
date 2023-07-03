package shpp.java.patterns.abstract_factory.factories;

import shpp.java.patterns.abstract_factory.components.buttons.Button;
import shpp.java.patterns.abstract_factory.components.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
