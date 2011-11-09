package com.mybank.domain;

/**
 *
 * @author jdmr
 */
public class PruebaBanco {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Simms");
        bank.addCustomer("Owen", "Bryant");
        bank.addCustomer("Tim", "Soley");
        bank.addCustomer("Maria", "Soley");
        
        int numeroDeClientes = bank.getNumberOfCustomers();
        if (numeroDeClientes == 4) {
            System.out.println("Wooho!!! Tenemos todos los clientes!!!");
        } else {
            System.out.println("Ups!!! Hubo un error...");
        }
        
        for(int i = 0; i < numeroDeClientes; i++) {
            Customer cliente = bank.getCustomer(i);
            System.out.println("Cliente ["+ i + "] es "
                    + cliente.getApellido()  + "," + cliente.getNombre());
        }
    }
}
