
package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
    
    @Spy
    DataService dataService=new DataService() {
         public int[] getListOfNumbers() {
            int[] numeros= {1,2,5,3};
            return numeros;
        };
    };
    @Spy
    BasicOperationsService BasicOperationMock= new BasicOperationsService() {
        public double add(double input1, double input2) {
            return input1+input2;
        };
        public double subtract(double input1, double input2) {
            return input1-input2;
        };
        public double multiply(double input1, double input2) {
            return input1*input2;
        };
        public double divide(double input1, double input2) {
            return input1/input2;
        };
    };
    @Mock
    DataService dataServiceMock;

    @InjectMocks
    CalculatorServiceImpl calculator = new CalculatorServiceImpl();

    @BeforeEach
    void setUp() {
        lenient().when(dataServiceMock.getListOfNumbers()).thenReturn(new int[] { 1, 2, 3, 4, 5 });
    }

    @Test
    void calculateSumTest() {

        when(BasicOperationMock.add(5, 5)).thenReturn((double) 10);
        assertEquals((double) 10, calculator.calculateSum(5, 5));
        verify(BasicOperationMock).add(5, 5);
    }

    @Test
    void calculateSubstractionTest() {
        when(BasicOperationMock.subtract(5, 5)).thenReturn((double) 0);
        assertEquals((double) 0, calculator.calculateSubstraction(5, 5));
        verify(BasicOperationMock).subtract(5, 5);
    }

    @Test
    void calculateDivisionTest() {

        when(BasicOperationMock.divide(5, 5)).thenReturn((double) 1);
        try{
            assertEquals((double) 1, calculator.calculateDivision(5, 5));
        }catch(ZeroDivisionException e) {
            System.out.println(e.getMessage());
        }
        verify(BasicOperationMock).divide(5, 5);
    }

    @Test
    void calculateMultiplicationTest() {
        when(BasicOperationMock.multiply(5, 5)).thenReturn((double) 25);
        assertEquals((double) 25, calculator.calculateMultiplication(5, 5));
        verify(BasicOperationMock).multiply(5, 5);
    }

    @Test
    void calculateAverageOkTest() {
        assertEquals(3, calculator.calculateAverage());
    }

    @Test
    void calculateAverageNullTest() {
        when(dataServiceMock.getListOfNumbers()).thenThrow(NullPointerException.class);
        assertThrows(NullPointerException.class, () -> calculator.calculateAverage());
    }
    
    @Test
    void calculateZeroDivisionTest() {
        assertThrows(ZeroDivisionException.class, () -> calculator.calculateDivision(5,0));
        verify(BasicOperationMock,never()).divide(5, 0);;
    }
    
    @Test
    void printResultOkTest() {
        when(BasicOperationMock.add(5, 0)).thenReturn((double) 5);
        assertEquals("El resultado es 5.0", calculator.printResult( calculator.calculateSum(5, 0)));
    }
    @ParameterizedTest
    @MethodSource("addEvenData")
    void isEvenParameterizedTest(int posibleimpar,boolean resultado) {
        assertEquals(resultado,calculator.isEven(posibleimpar));
    }
    
    private static Stream<Arguments> addEvenData(){
        return Stream.of(
                Arguments.of(2,true),
                Arguments.of(3,false),
                Arguments.of(4,true),
                Arguments.of(5,false),
                Arguments.of(6,true)            
                );
    }
    
    @Test
    void spyBasicOperationTest() {
        assertEquals(10.0,BasicOperationMock.add(5, 5));
    }
    
    @Test
    void checkVectorLenghtOk() {
        int[] numeros2= {5,8,6,7,2,4,6};
        assertEquals(4,dataService.getListOfNumbers().length);
        when(dataService.getListOfNumbers()).thenReturn(numeros2);
        assertEquals(7,dataService.getListOfNumbers().length);
    }
    
}
