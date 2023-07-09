package shpp.java.patterns.flyweight.flyweight;

import shpp.java.patterns.flyweight.flyweight.enums.UnitClass;
import shpp.java.patterns.flyweight.flyweight.enums.UnitSex;

public class CompanionType {
    private final UnitClass unitClass;
    private final UnitSex unitSex;

    public CompanionType(UnitClass unitClass, UnitSex unitSex) {
        this.unitClass = unitClass;
        this.unitSex = unitSex;
    }

    public UnitClass getUnitClass() {
        return unitClass;
    }

    public UnitSex getUnitSex() {
        return unitSex;
    }

    public void changeFollowing(boolean state) {
        if (state)
            System.out.println("I am following");
        else
            System.out.println("I am not following");
    }
}
