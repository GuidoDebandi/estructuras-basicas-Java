package patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import singleton.Currency;

public class CurrencyTest {

    @Test
    void singletonTest() {
        assertEquals("ARS",Currency.getInstance().getName()); 
    }
}
