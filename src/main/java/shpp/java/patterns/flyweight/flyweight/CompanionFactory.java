package shpp.java.patterns.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

import shpp.java.patterns.flyweight.flyweight.enums.UnitClass;
import shpp.java.patterns.flyweight.flyweight.enums.UnitSex;

public class CompanionFactory {
    private static Map<String, CompanionType> types = new HashMap<>(1);

    private CompanionFactory() {
    }

    public static CompanionType getCompanionOfType(UnitClass unitClass, UnitSex sex) {
        String key = unitClass + "-" + sex;
        // CompanionType type = types.get(key);
        // if (type == null) {
        // type = new CompanionType(unitClass, sex);
        // types.put(key, type);
        // }
        // return type;
        return types.computeIfAbsent(key, k -> new CompanionType(unitClass, sex));
    }
}