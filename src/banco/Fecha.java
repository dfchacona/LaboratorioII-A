/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Diego Chacon 
 */
public class Fecha {
    public int dia; 
    public int mes; 
    public int anio;
    /**
    * Constructor de la clase fecha
    * @param dia dia
    * @param mes mes
    * @param anio anio
    */ 
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
    * funcion que retorna el dia de la fecha
    */ 
    public int getDia() {
        return this.dia;
    }
    /**
    * funcion que retorna el mes de la fecha
    */
    public int getMes() {
        return this.mes;
    }
    /**
    * funcion que retorna el anio de la fecha
    */
    public int getAnio() {
        return this.anio;
    }
    
    public void diaSiguiente(){
        if (mes==1||mes==3||mes==5||mes==6||mes==8||mes==10||mes==12){
          if(dia<31){
              this.dia++;
          }else if (mes<12){
              
              this.dia=1;
              this.mes++;
          }else{
              this.dia=1; 
              this.mes=1; 
              this.anio++;
          }
        }else if (mes==2){
           
           if(dia<28){
              this.dia++;
          }else if (mes<12){
              
              this.dia=1;
              this.mes++;
          }else{
              this.dia=1; 
              this.mes=1; 
              this.anio++;
          } 
        }else if(dia<30){
              this.dia++;
          }else if (mes<12){
              
              this.dia=1;
              this.mes++;
          }else{
              this.dia=1; 
              this.mes=1; 
              this.anio++;
          }  
        }
    @Override
    public String toString() {
        return "Fecha de Vencimiento{" + "Día: " + dia + ", Mes: " + mes + ", Año:" + anio + '}';
    }
        
    }

    

