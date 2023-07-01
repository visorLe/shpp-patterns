package shpp.java.patterns.abstract_factory.checkboxes;

public class LinuxCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("LinuxCheckbox created");
    }
}
