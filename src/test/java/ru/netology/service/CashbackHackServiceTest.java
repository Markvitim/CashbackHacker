package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;



public class CashbackHackServiceTest {

    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
                Assert.assertEquals(0, service.remain(1000));
    }
}