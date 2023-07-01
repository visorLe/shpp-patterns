package shpp.java.patterns.abstract_factory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import shpp.java.patterns.abstract_factory.application.Application;
import shpp.java.patterns.abstract_factory.factories.GUIFactory;
import shpp.java.patterns.abstract_factory.factories.LinuxFactory;
import shpp.java.patterns.abstract_factory.factories.WindowsFactory;

public class AbstractFactoryTest {
    @BeforeAll
    static void setUp() {
        System.setProperty("os.name", "lin");
    }

    @Test
    void testAbstractFactory() {
        Application app = AbstractFactoryTest.configureApplication();
        assertTrue(app.render());
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        switch (osName) {
            case "lin":
                factory = new LinuxFactory();
                app = new Application(factory);
                break;
            case "win":
                factory = new WindowsFactory();
                app = new Application(factory);
                break;
            default:
                throw new IllegalArgumentException("No such OS type available: " + osName);
        }
        return app;
    }
}
