package shpp.java.patterns.abstract_factory.application;

import shpp.java.patterns.abstract_factory.buttons.Button;
import shpp.java.patterns.abstract_factory.checkboxes.Checkbox;
import shpp.java.patterns.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public boolean render() {
        button.render();
        checkbox.render();
        return true;
    }
}
