package shpp.java.patterns.flyweight;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import shpp.java.patterns.flyweight.context.Companion;
import shpp.java.patterns.flyweight.flyweight.enums.UnitClass;
import shpp.java.patterns.flyweight.flyweight.enums.UnitSex;

public class FlyweightTest {

    @Test
    void flyweightTest() {
        Companion firstCompanion = new Companion(UnitClass.CLERIC, UnitSex.MALE, false);
        Companion secondCompanion = new Companion(UnitClass.CLERIC, UnitSex.MALE, true);
        Companion thirdCompanion = new Companion(UnitClass.CLERIC, UnitSex.FEMALE, true);

        assertNotSame(firstCompanion, secondCompanion);

        assertSame(firstCompanion.getCompanionType(), secondCompanion.getCompanionType(), "First = Second");
        assertNotSame(secondCompanion.getCompanionType(), thirdCompanion.getCompanionType(), "Second != Third");

        ArrayList<Companion> companions = new ArrayList<>(List.of(firstCompanion, secondCompanion, thirdCompanion));
        for (Companion c : companions) {
            c.changeFollowing();
        }
    }
}
