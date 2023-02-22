package com.globallogic.talentengine.junitTest;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void test11() {
        assertEquals("Test","Test");
        System.out.println("Test 1.1 ok");
    }
    
    
    @Test
    void test13() {
        assertTrue(25>12);
        assertFalse(25>27);
        System.out.println("Test 1.3 ok");
    }
    
    @Test
    void test14() {
        try {
            Long miLong=null;
            assertEquals(null,miLong);
            miLong=(long) 0001;
            assertEquals("El valor no era null: ",null,miLong);
            
        }catch(Error e) {
            System.out.println(e.getMessage());
            System.out.println("Test 1.4 error");
            throw e;
        }
    }
    
    
    public int sumar(int num1, int num2) {
        return num1+num2;
    }
    
    @Test
    void test16() {
        try {
            assertEquals("El resultado de la suma esta mal: ",12,sumar(7,5));
            assertEquals("El resultado de la suma esta mal: ",13,sumar(7,5));
        }catch(Error e) {
            System.out.println(e.getMessage());
            System.out.println("Test 1.6 ERROR");
        }
    }
    
    public boolean validarMaximo(int maxIndex) {
        for(int i=0;i<maxIndex;i++) {
            if (i == 3) {
                return true;
            }
        }
        return false;
    }
    
    
    @Test
    void test17() {
        try{
           assertTrue("No se puedo comprobar validarMaximo()",validarMaximo(5)); 
           assertFalse("No se puedo comprobar validarMaximo()",validarMaximo(2));
           System.out.println("Test 1.7 OK");
        }catch(Error e) {
            System.out.println(e.getMessage());
            System.out.println("Test 1.7 ERROR");
        }
    }
    
    @Test
    void test12() {
        try {
            assertTrue("compararString() no se comprueba",compararString("Miguel","Juancho","Pablo"));
        } catch (Error e) {
           System.out.println(e.getMessage());
        }
    }
    
    public boolean compararString(String cadena1, String cadena2, String cadena3) {
        
        boolean condicionDistintos= cadena1!=cadena2 && cadena1!=cadena3 && cadena2!=cadena3;
        boolean condicionIguales= cadena1==cadena2  && cadena1==cadena3;
        
        cadena1= "Pablo";
        cadena2= "Pablo";
        cadena3= "Miguel";
        
        if(condicionDistintos || condicionIguales ) {
            return false;
        }else{
            return true;
        }
        
    }
}
