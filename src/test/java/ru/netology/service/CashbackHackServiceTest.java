package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
                assertEquals(120, service.remain(2880));
    }
}