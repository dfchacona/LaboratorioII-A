
package banco;
import exception.*;
/**
 *
 * @author Diego Chacon 
 */
public class CuentaAhorros extends Cuenta {

    private double porcentajeIntMensual; 
    //n porcentaje de interes mensual que va a ser depositado en la cuenta al inicio de cada mes
    private Fecha fechaVencimiento; 
    //n fecha de vencimiento de la cuenta, unico dia en el que se puede retirar dinero 
    /**
    * Constructor de la clase cuenta de ahorros
    * @param numeroCuenta numero de cuenta
    * @param nombreCliente nombre del cliente 
    * @param saldo saldo en pesos de la cuenta
    * @param porcentajeIntMensual porcentaje de interes mensual de la cuenta
    * @param diaVencimiento dia de vencimiento de la cuenta
    * @param mesVencimiento mes de vencimiento de la cuenta
    * @param anioVencimiento anio de vencimiento de la cuenta
    */ 
    public CuentaAhorros(double porcentajeIntMensual, int numeroCuenta, String nombreCliente, double saldo, int diaVencimiento, int mesVencimiento, int anioVencimiento) throws SaldoNegativoException {
        super(numeroCuenta, nombreCliente, saldo);
        this.porcentajeIntMensual = porcentajeIntMensual;
        Fecha f1= new Fecha(diaVencimiento,mesVencimiento,anioVencimiento);
        this.fechaVencimiento=f1;
    }
    /**
    * Funcion que permite consultar los datos de la cuenta 
    */ 
    @Override
     public void ConsultarDatos(){
        System.out.println("Numero de Cuenta: "+ this.numeroCuenta);
        System.out.println("Nombre Cliente: "+this.nombreCliente);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Porcentaje interes mensual: "+this.porcentajeIntMensual);
        System.out.println("Fecha de Vencimiento: "+this.fechaVencimiento.getDia()+"/"+this.fechaVencimiento.getMes()+"/"+this.fechaVencimiento.getAnio());
     }
    public void depositarInteres(){
       this.saldo=this.saldo+this.porcentajeIntMensual*this.saldo/100;
    }
     
    /**
    * Funcion que permite retirar dinero de la cuenta
    * @param cantidad cantidad de dinero que se va a retirar
    */ 
    public void retirar(double cantidad) throws SaldoInsuficiente{
    if(cantidad>=this.saldo){
        throw new SaldoInsuficiente ("Saldo Insuficiente");
    }else{
        this.saldo=this.saldo-cantidad; 
    }
    }
    @Override
    public void setTipo(){
        this.tipo="Ahorros";
    }
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
        return "Cuenta de Ahorros{"+ super.toString() + " Porcentaje de interes mensual:" + porcentajeIntMensual + "% , " + fechaVencimiento.toString() + '}';
    }
    @Override
    public Fecha getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    
}
