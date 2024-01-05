package ru.motorin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.motorin.MySecondTestAppSpringBoot.model.Positions;

import java.time.Year;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService{
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {

        int currentYear = Year.now().getValue();
        int currentYearDays = 366; // по дефолту считаем, что год високосный

        // если год не високосный
        if (currentYear % 4 != 0 || (currentYear % 100 == 0 && currentYear % 400 != 0))
            currentYearDays = 365;

        return salary * bonus * currentYearDays * positions.getPositionCoefficient() / workDays;
    }
}
