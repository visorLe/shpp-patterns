package shpp.java.patterns.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("WindowsCheckbox created");
    }
}
