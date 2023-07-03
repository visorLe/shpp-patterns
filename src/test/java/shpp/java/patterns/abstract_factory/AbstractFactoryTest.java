package shpp.java.patterns.abstract_factory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import shpp.java.patterns.abstract_factory.application.Application;
import shpp.java.patterns.abstract_factory.factories.GUIFactory;
import shpp.java.patterns.abstract_factory.factories.LinuxFactory;
import shpp.java.patterns.abstract_factory.factories.WindowsFactory;

public class AbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        Application app = AbstractFactoryTest.configureApplication();
        assertTrue(app.render());
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name");
        switch (osName) {
            case "Linux":
                factory = new LinuxFactory();
                app = new Application(factory);
                break;
            case "Windows":
                factory = new WindowsFactory();
                app = new Application(factory);
                break;
            default:
                throw new IllegalArgumentException("No such OS type available: " + osName);
        }
        return app;
    }
}
