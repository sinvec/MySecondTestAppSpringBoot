package ru.motorin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.motorin.MySecondTestAppSpringBoot.model.Positions;

@Service
public interface QuarterlyBonusService {
    double calculate(Positions positions, double salary, double bonus);
}
