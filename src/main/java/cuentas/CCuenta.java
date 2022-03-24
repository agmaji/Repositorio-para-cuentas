
package cuentas;

/**
 * <h1>Clase cuenta</h1>
 * 
 * Contiene información de cada cuenta corriente
 * 
 * @author Agustín
 * @version 1.0
 * @since 24/03/2022
 */


public class CCuenta {

//Atributos
    
    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    
    /**
     * Número de la cuenta corriente
     */
    private String cuenta;
    
    /**
     * Saldo que arroja la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés que se aplica
     */
    private double tipoInterés;

    
    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con 4 parámetros
     * @param nom String nombre del titular de la cuenta
     * @param cue String número de la cuenta corriente
     * @param sal double saldo que arroja la cuenta
     * @param tipo double tipo de interés que se aplica
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    
    /**
     * @return getSaldo
     * @see getSaldo
     */    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Metodo que lee 
     * @param cantidad
     * Si se cumple la condición
     * @throws Exception
     * Si no se cumple la condición
     * incrementa saldo
     * @see setSaldo
     * @see getSaldo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Metodo que lee
     * @param cantidad
     * Si se cumple alguna condición
     * @throws Exception
     * Si no se cumple ninguna
     * reduce saldo
     * @see setSaldo
     * @see getSaldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
