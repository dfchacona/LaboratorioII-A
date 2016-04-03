/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author dieguischa
 */
public abstract class Cuenta {
    protected int numeroCuenta;
    protected String nombreCliente; 
    protected double saldo; 
    /**
    * Constructor de la clase cuenta 
    * @param numeroCuenta numero de cuenta
    * @param nombreCliente nombre del cliente 
    * @param saldo saldo en pesos de la cuenta
    */ 
    public Cuenta(int numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    /**
    * Funcion que permite consultar los datos de la cuenta 
    */ 
    public void ConsultarDatos(){
        System.out.println("Numero de Cuenta: "+ this.numeroCuenta);
        System.out.println("Nombre Cliente: "+this.nombreCliente);
        System.out.println("Saldo: "+this.saldo);
    /**
    * Funcion que deposita dinero en la cuenta
    * @param cantidad Cantidad de dinero a ser depositado en la cuenta 
    */             
    }
    public void depositar(int cantidad){
        this.saldo=saldo+cantidad; 
    }
    
  
}
