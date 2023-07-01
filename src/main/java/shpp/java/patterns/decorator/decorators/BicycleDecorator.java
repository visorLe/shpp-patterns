package shpp.java.patterns.decorator.decorators;

import shpp.java.patterns.decorator.bicycles.Bicycle;

abstract class BicycleDecorator implements Bicycle {
    protected Bicycle bicycle;

    protected BicycleDecorator(Bicycle b) {
        this.bicycle = b;
    }

    @Override
    public boolean assemble() {
        this.bicycle.assemble();
        return true;
    }
}
