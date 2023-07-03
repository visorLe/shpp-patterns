package shpp.java.patterns.abstract_factory.components.buttons;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("WindowsButton created");
    }
}
