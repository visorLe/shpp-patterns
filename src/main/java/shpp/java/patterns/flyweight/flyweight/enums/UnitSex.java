package shpp.java.patterns.flyweight.flyweight.enums;

public enum UnitSex {
    MALE("Male"), FEMALE("Female");

    private String name;

    private UnitSex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
