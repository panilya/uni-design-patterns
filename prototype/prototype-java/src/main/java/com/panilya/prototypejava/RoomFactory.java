package com.panilya.prototypejava;

import java.util.HashMap;
import java.util.Map;

public class RoomFactory {
    private static final Map<String, RoomPrototype> prototypes = new HashMap<>();

    static {
        prototypes.put("single", new SingleRoom());
        prototypes.put("double", new DoubleRoom());
        prototypes.put("suite", new SuiteRoom());
    }

    public static RoomPrototype getPrototype(String type) {
        return prototypes.get(type).copy();
    }
}
