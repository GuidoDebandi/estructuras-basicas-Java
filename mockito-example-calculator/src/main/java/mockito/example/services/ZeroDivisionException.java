package mockito.example.services;

public class ZeroDivisionException extends Exception{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ZeroDivisionException() {
        super();
        System.out.println("No es posible dividir por 0");
    }
    
}
