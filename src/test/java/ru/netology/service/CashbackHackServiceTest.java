package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
                Assert.assertEquals(120, service.remain(2880));
    }
}