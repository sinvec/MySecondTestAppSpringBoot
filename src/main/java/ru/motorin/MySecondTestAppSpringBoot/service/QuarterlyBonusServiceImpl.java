package ru.motorin.MySecondTestAppSpringBoot.service;

import ru.motorin.MySecondTestAppSpringBoot.model.Positions;
public class QuarterlyBonusServiceImpl implements QuarterlyBonusService {
    @Override
    public double calculate(Positions positions, double salary, double bonus) {
        if (positions.isManager()) {
            return salary * bonus;
        } else {
            return 0.0;
        }
    }
}
