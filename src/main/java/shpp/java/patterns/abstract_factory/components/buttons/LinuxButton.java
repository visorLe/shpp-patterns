package shpp.java.patterns.abstract_factory.components.buttons;

public class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("LinuxButton created");
    }
}
