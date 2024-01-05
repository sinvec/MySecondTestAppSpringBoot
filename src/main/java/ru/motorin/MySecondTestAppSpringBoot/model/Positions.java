package ru.motorin.MySecondTestAppSpringBoot.model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV(2.2, false),
    HR(1.2, false),
    TL(2.6, true),
    PO(2.5, true),
    CPO(3.2, true),
    CTO(3.4, true);
    private final double positionCoefficient;
    private final boolean isManager;
    Positions(double positionCoefficient, boolean isManager) {
        this.positionCoefficient = positionCoefficient;
        this.isManager = isManager;
    }
}
