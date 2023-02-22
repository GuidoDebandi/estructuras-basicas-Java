package coverage.loteria;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.*;

import coverage.loteria.model.CartonGenerator;

public class LoteriaTest {

    @Spy
    CartonGenerator cartonMock;

    @InjectMocks
    Loteria loteria = new Loteria(32500.25f, 300, cartonMock);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    void ganadorUnicoTrueTest() {
        when(cartonMock.isGanador()).thenReturn(true).thenCallRealMethod();
        loteria.jugada();

        assertTrue(loteria.hayGanadorUnico());
    }

    @Test
    void ganadorUnicoFalseTest() {
        when(cartonMock.isGanador()).thenCallRealMethod();
        loteria.jugada();

        assertFalse(loteria.hayGanadorUnico());
    }

    @Test
    void ganadorCuadrupleTrueTest() {
        when(cartonMock.isGanador()).thenReturn(true)
                                    .thenReturn(true)
                                    .thenReturn(true)
                                    .thenReturn(true) // Los primeros cuatro son ganadores
                .thenCallRealMethod();
        loteria.jugada();
        assertTrue(loteria.hayCuadrupleGanador());
    }

    @Test
    void ganadorCuadrupleFalseTest() {

        when(cartonMock.isGanador()).thenCallRealMethod();
        loteria.jugada();

        assertFalse(loteria.hayCuadrupleGanador());
    }

}
