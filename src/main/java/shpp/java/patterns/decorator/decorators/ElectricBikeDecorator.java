package shpp.java.patterns.decorator.decorators;

import shpp.java.patterns.decorator.bicycles.Bicycle;

public class ElectricBikeDecorator extends BicycleDecorator {

    public ElectricBikeDecorator(Bicycle b) {
        super(b);
    }

    @Override
    public boolean assemble() {
        super.assemble();
        System.out.println(" + electric bike features");
        return true;
    }
}
