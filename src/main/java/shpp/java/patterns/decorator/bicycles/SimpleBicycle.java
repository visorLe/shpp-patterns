package shpp.java.patterns.decorator.bicycles;

public class SimpleBicycle implements Bicycle {

    @Override
    public boolean assemble() {
        System.out.println("Simple Bicycle");
        return true;
    }
}
