package mockito.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.*;

import mockito.example.model.Vehicle;


class VehicleCrashTest {
    @Mock
    Vehicle vehicleMock;

    VehicleCrash crashTest = new VehicleCrash();
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void WhenNoCrashNoValueThenOk() {

        assertEquals(0, crashTest.getTotalEnergy());
        assertEquals(0, crashTest.getTotalVehicles());
        assertEquals("No crashes measured", crashTest.toString());
    }

    @Test
    void WhenCrashAndCorrectValueThenOk() {
        when(vehicleMock.getMass()).thenReturn(10.0);
        when(vehicleMock.getMaxSpeed()).thenReturn(5.0);
        crashTest.crash(vehicleMock);
        assertEquals(1,crashTest.getTotalVehicles());

    }

}
