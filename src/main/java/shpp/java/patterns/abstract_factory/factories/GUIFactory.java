package shpp.java.patterns.abstract_factory.factories;

import shpp.java.patterns.abstract_factory.buttons.Button;
import shpp.java.patterns.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
