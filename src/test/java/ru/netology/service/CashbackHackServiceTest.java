package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CashbackHackServiceTest {

    @Test
    public void shouldRemainUseJunitJupiter() {
        CashbackHackService service = new CashbackHackService();
                Assert.assertEquals(120, service.remain(2880));
    }
    @org.junit.Test
    public void shouldRemainUseJunit4() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(120, service.remain(2880));
    }
}