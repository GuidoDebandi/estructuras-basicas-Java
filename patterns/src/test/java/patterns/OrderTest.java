package patterns;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import singleton.Currency;
import singleton.Order;
import singleton.Product;

public class OrderTest {
    
    Order orden1=new Order(Currency.getInstance(),32,"Descripcion 1");
    Order orden2=new Order(Currency.getInstance(),34,"Descripcion 2");
    Order orden3=new Order(Currency.getInstance(),32,"Descripcion 1",Product.getInstance());
    
    @Test
    void sameCurrencyTest() {

        assertSame(orden1.getDivisa(),orden2.getDivisa());
    }
    
    @Test
    void productTest() {
        assertEquals("Clavos",orden3.getProducto().getName());
        
    }
    
    
}
