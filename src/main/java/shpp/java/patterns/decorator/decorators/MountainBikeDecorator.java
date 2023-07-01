package shpp.java.patterns.decorator.decorators;

import shpp.java.patterns.decorator.bicycles.Bicycle;

public class MountainBikeDecorator extends BicycleDecorator {

    public MountainBikeDecorator(Bicycle b) {
        super(b);
    }

    @Override
    public boolean assemble() {
        super.assemble();
        System.out.println(" + mountain bike features");
        return true;
    }
}
