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
    
    
}
