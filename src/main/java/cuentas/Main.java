package cuentas;


import cuentas.CCuenta;

/**
 * Main class
 * @author Juan Luis Garcia-Nieto Solis
 * @version 2.0
 * 
 */



public class Main {

    /**
     * Metodo main
     * @param args args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
    }

    /**
     * Metodo que engloba las acciones sobre cuenta1
     * @param cantidad cantidad
     */
    public void operativa_cuenta(java.lang.Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
