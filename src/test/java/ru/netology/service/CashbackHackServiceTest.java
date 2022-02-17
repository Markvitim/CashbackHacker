package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashbackHackServiceTest {

    @Test
    void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2880);
        int expected = 120;
                Assert.assertEquals(actual, expected);
    }
}