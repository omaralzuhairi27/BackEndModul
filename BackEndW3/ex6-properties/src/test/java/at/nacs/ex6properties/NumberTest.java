package at.nacs.ex6properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class NumberTest {
    @Autowired
    Number number;

    @Test
    void getNumber() {
        assertEquals(369,number.getNumber());
    }
}