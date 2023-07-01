package shpp.java.patterns.decorator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import shpp.java.patterns.decorator.bicycles.Bicycle;
import shpp.java.patterns.decorator.bicycles.SimpleBicycle;
import shpp.java.patterns.decorator.decorators.ElectricBikeDecorator;
import shpp.java.patterns.decorator.decorators.MountainBikeDecorator;

public class DecoratorTest {

    @Test
    void testDecorator() {
        Bicycle mountainBike = new MountainBikeDecorator(new SimpleBicycle());
        assertTrue(mountainBike.assemble());

        System.out.println();

        Bicycle mountainElectricBike = new ElectricBikeDecorator(mountainBike);
        assertTrue(mountainElectricBike.assemble());
    }
}
