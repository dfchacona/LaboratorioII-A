/**
	 * <h1> Banco </h1>
	 * @since  03/04/2016
	 * @author Diego Chacon 
	 */
package banco;

import java.util.ArrayList;
import java.util.HashMap;
import exception.*;
/**
 *
 * @author dieguischa
 */
public class Banco {
   public HashMap <Integer,Cuenta> cuentas;
    java.util.Scanner lectura= new java.util.Scanner (System.in);
   public Banco(){
      this.cuentas=new HashMap<Integer, Cuenta>();
   }
   
   public void anadirCuentaAhorros(double porcentajeInteresMensual, int diaVencimiento, int mesVencimiento, int anioVencimiento) throws SaldoNegativoException{
       System.out.println("Ingrese nombre del cliente");
       String nombreCliente=lectura.next();
       System.out.println("Ingrese numero cuenta");
       int numeroCuenta=lectura.nextInt();
       System.out.println("Ingrese saldo inicial");
      
       double saldo=lectura.nextDouble();
       CuentaAhorros c1= new CuentaAhorros(porcentajeInteresMensual, numeroCuenta, nombreCliente, saldo, diaVencimiento, mesVencimiento, anioVencimiento);
       c1.setTipo();
       cuentas.put(numeroCuenta,c1);
   }
   
   public void anadirCuentaCheques(double comisionUso, double comisionSaldoInsuficiente) throws SaldoNegativoException{
       System.out.println("Ingrese nombre del cliente");
       String nombreCliente=lectura.next();
       System.out.println("Ingrese numero cuenta");
       int numeroCuenta=lectura.nextInt();
       System.out.println("Ingrese saldo inicial");
       double saldo=lectura.nextDouble();
       CuentaCheques c1= new CuentaCheques(comisionUso, comisionSaldoInsuficiente, numeroCuenta, nombreCliente, saldo);
       c1.setTipo();
       cuentas.put(numeroCuenta, c1);
   }
   
}
