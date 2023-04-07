package cuentas;

/**
 * Clase que genera los objetos cuenta
 * @author Juan Luis Garcia-Nieto Solis
 * @version 2.0
 */
public class CCuenta {
    
    //Atributos

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    //Constructores

    /**
     *  Constructor vacio
     */

    public CCuenta() {
    }

    /**
     * Constructor por parametros
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    //Metodos

    /**
     * Metodo para retornar saldo
     * @return Saldo
     */

    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo ingresar
     * @param cantidad cantidad
     * @throws Exception
     * Mensaje excepcion
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo retirar
     * @param cantidad cantidad
     * @throws Exception
     * mensaje excepcion
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Getter para obtener nombre
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Setter para establecer nombre
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter para establecer cuenta
     * @param cuenta cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter para obtener saldo
     * @return saldo cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter para establecer saldo
     * @param saldo saldo cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter para obtener tipo de interés
     * @return tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter para establecer tipo de interes
     * @param tipoInterés tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
