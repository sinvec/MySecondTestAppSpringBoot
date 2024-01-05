package ru.motorin.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.motorin.MySecondTestAppSpringBoot.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class QuarterlyBonusServiceImplTest {

    @Test
    void calculate() {

        Positions position = Positions.CPO;
        double bonus = .1;
        double salary = 400000.00;

        double result = new QuarterlyBonusServiceImpl().calculate(position, salary, bonus);

        double expected = 40000.00;
        assertThat(result).isEqualTo(expected);
    }
}