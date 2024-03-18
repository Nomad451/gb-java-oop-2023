package ru.gb.seminars.seminar_01;

import java.math.BigDecimal;

public class FixedAmountAccount extends Account {

    public FixedAmountAccount() {
        super(BigDecimal.valueOf(10_000_000));
    }

}
