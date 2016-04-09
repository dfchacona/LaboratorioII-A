/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import exception.SaldoInsuficiente;
import exception.SaldoNegativoException;
import java.util.InputMismatchException;

/**
 *
 * @author dieguischa
 */
public class Main {
    
    public static void main(String[] args) throws SaldoNegativoException, SaldoInsuficiente {
    java.util.Scanner lectura= new java.util.Scanner (System.in);
    boolean error=false; 
    Banco banco= new Banco();  
    Fecha fechaHoy= new Fecha(9, 4, 2016);
    int eleccion=1; 
     do{  
    System.out.println("Fecha de hoy: "+fechaHoy.getDia()+"/"+fechaHoy.getMes()+"/"+fechaHoy.getAnio()
                            + "\nSeleccione"
                            +"\n1. Para registrar una cuenta de ahorros"
                            +"\n2. Para registrar una cuenta de cheques"
                            +"\n3. Para depositar dinero"
                            +"\n4. Obtener informacion de una cuenta"
                            +"\n5. Retirar dinero"
                            +"\n6. Dia siguiente"
                            +"\n0. Para finalizar el programa"
                                );
   
    
       
    eleccion= lectura.nextInt(); 
    
   
        switch (eleccion){
            case 1:{
                try{
            banco.anadirCuentaAhorros(5, fechaHoy.getDia(), fechaHoy.getMes(), fechaHoy.getAnio()+1);
                }catch(SaldoNegativoException ex){
                    System.out.println("El saldo no puede ser negativo");
                    }
            break;
            }
            case 2:{
            try{
            banco.anadirCuentaCheques(5, 3000);
                }catch(SaldoNegativoException ex){
                    System.out.println("El saldo no puede ser negativo");
                    }
            break;
            }
            case 6:{
            fechaHoy.diaSiguiente();   
            break;
            }
            case 4:{
                System.out.println("Ingrese numero de cuenta");
                int numCuenta=lectura.nextInt();
                try {
                System.out.println(banco.cuentas.get(numCuenta).toString());
                 } catch (NullPointerException ex) {
                    System.out.println("La cuenta no se encuentra registrada");
                 }
                break;
                }
            case 3:{
                
                System.out.println("Ingrese numero de cuenta");
                int numCuenta=lectura.nextInt();
               
                 Cuenta c1 = banco.cuentas.get(numCuenta);
                 if(c1==null){
                    System.out.println("La cuenta no se encuentra registrada");
                    break; 
                 }
                System.out.println("Ingrese cantidad que desea depositar");
                double cantidad=lectura.nextDouble();
                c1=banco.cuentas.get(numCuenta);
                try {
                 c1.depositar(cantidad);
                 } catch (NullPointerException ex) {
                    System.out.println("La cuenta no se encuentra registrada");
                    break; 
                 }
                break;
                }
            
            case 5:{
             System.out.println("Ingrese numero de cuenta");
                int numCuenta=lectura.nextInt();
                 
                 Cuenta c1 = banco.cuentas.get(numCuenta);
                 if(c1==null){
                    System.out.println("La cuenta no se encuentra registrada");
                    break; 
                 }
                System.out.println("Ingrese cantidad que desea retirar");
                double cantidad=lectura.nextDouble();
                try{
                c1.retirar(cantidad);
                }catch(SaldoInsuficiente ex){
                    System.out.println("Saldo Insuficiente");
                break;
                 }
                
           }
            
        }   
        } while(eleccion!=0);
    
}}
 

