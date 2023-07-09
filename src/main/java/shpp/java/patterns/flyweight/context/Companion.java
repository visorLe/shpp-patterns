package shpp.java.patterns.flyweight.context;

import shpp.java.patterns.flyweight.flyweight.CompanionFactory;
import shpp.java.patterns.flyweight.flyweight.CompanionType;
import shpp.java.patterns.flyweight.flyweight.enums.UnitClass;
import shpp.java.patterns.flyweight.flyweight.enums.UnitSex;

public class Companion implements CanFollow {
    private final CompanionType companionType;
    private boolean isFollowing;

    public Companion(UnitClass unitClass, UnitSex unitSex, boolean followingState) {
        this.companionType = CompanionFactory.getCompanionOfType(unitClass, unitSex);
        this.isFollowing = followingState;
    }

    public CompanionType getCompanionType() {
        return companionType;
    }

    public void changeFollowing() {
        companionType.changeFollowing(!isFollowing);
    }
}