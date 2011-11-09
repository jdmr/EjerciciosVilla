package com.mybank.domain;

/**
 *
 * @author jdmr
 */
public class Bank {
    private Customer[] customers = new Customer[5];
    private int numberOfCustomers = 0;
    
    public void addCustomer(String nombre, String apellido) {
        Customer customer = new Customer();
        customer.setNombre(nombre);
        customer.setApellido(apellido);
        Account account = new Account();
        account.setNombre(apellido + nombre);
        customer.setAccount(account);
        
        customers[numberOfCustomers++] = customer;
    }
    
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    
    public Customer getCustomer(int index) {
        return customers[index];
    }
}
