package ru.gb.seminars.seminar_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountStaticTest {

    @Test
    void testCounter() {
        long currentState = Account.getCounter();

        new Account();
        new CreditAccount();
        new DepositAccount();

        assertEquals(currentState + 3, Account.getCounter());
    }

}
