package com.mybank.domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jdmr
 */
public class BankTest {
    
    public BankTest() {
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String nombre = "David";
        String apellido = "Mendoza";
        Bank banco = new Bank();
        banco.addCustomer(nombre, apellido);
        assertEquals("Esperabamos otro numero de clientes", 1, banco.getNumberOfCustomers());
    }

    /**
     * Test of getNumberOfCustomers method, of class Bank.
     */
    @Test
    public void testGetNumberOfCustomers() {
        System.out.println("getNumberOfCustomers");
        Bank instance = new Bank();
        int expResult = 0;
        int result = instance.getNumberOfCustomers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int index = 0;
        String nombre = "David";
        String apellido = "Mendoza";
        Bank banco = new Bank();
        banco.addCustomer(nombre, apellido);
        String expResult = "David";
        Customer result = banco.getCustomer(index);
        assertEquals(expResult, result.getNombre());
    }
}
