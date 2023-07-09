package shpp.java.patterns.flyweight.flyweight.enums;

public enum UnitClass {
    WARRIOR("Warrior"), WIZARD("Wizard"), CLERIC("Cleric");

    private String name;

    private UnitClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
