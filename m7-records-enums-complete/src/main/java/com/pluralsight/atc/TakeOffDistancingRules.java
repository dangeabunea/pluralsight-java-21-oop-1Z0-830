package com.pluralsight.atc;

import java.util.Map;

public class TakeOffDistancingRules {
    private Map<WakeTurbulence, Integer> rules;

    public TakeOffDistancingRules() {
        rules = Map.of(
                WakeTurbulence.LIGHT, 60,
                WakeTurbulence.MEDIUM, 90,
                WakeTurbulence.HEAVY, 110,
                WakeTurbulence.SUPER, 180
        );
    }

    public int calculateWaitTime(AircraftTakeOffModel a) {
        return rules.get(a.wakeTurbulence());
    }
}
