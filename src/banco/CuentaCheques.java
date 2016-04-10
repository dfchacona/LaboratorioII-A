
package banco;

import exception.SaldoNegativoException;

/**
 *
 * @author Diego Chacon 
 */
public class CuentaCheques extends Cuenta{
    private double comisionUso;
    //n comision retirada de la cuenta cada vez que se emite un cheque
    private double comisionSaldoInsuficiente;
    //n penalizacion monetaria asumida por el cliente cada vez que escribe un cheque devuelto por saldo insuficiente 
    /**
    * Constructor de la clase cuenta de cheques
    * @param numeroCuenta numero de cuenta
    * @param nombreCliente nombre del cliente 
    * @param saldo saldo en pesos de la cuenta
    * @param comisionUso comision de uso de la cuenta
    * @param comisionSaldoInsuficiente comision por saldo insuficiente de la cuenta
    */ 
    public CuentaCheques(double comisionUso, double comisionSaldoInsuficiente, int numeroCuenta, String nombreCliente, double saldo) throws SaldoNegativoException {
        super(numeroCuenta, nombreCliente, saldo);
        this.comisionUso = comisionUso;
        this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
    }
    /**
    * Funcion que permite consultar los datos de la cuenta
    */ 
    @Override
     public void ConsultarDatos(){
        System.out.println("Numero de Cuenta: "+ this.numeroCuenta);
        System.out.println("Nombre Cliente: "+this.nombreCliente);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Comision de uso "+this.comisionUso);
        System.out.println("Penalizacion por cheque sin fondos: "+this.comisionSaldoInsuficiente);
     }
    /**
    * Funcion que permite retirar dinero de la cuenta
    * @param cantidad cantidad de dinero que se va a retirar
    */ 
    @Override
    public void retirar(double cantidad){
        if(cantidad<=this.saldo){
        
            this.saldo=this.saldo-cantidad-this.comisionUso;
        
    }else{
        System.out.println("Saldo insuficiente, se retirara la comision por saldo insuficiente");
        this.saldo=this.saldo-this.comisionSaldoInsuficiente;
    }    
    }
    @Override
    public void setTipo(){
        this.tipo="Cheques";
    }

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
        return "Cuenta de Cheques{ " + super.toString()+ ", Comision por uso: $" + comisionUso + ", Comision por uso con saldo insuficiente: $" + comisionSaldoInsuficiente + '}';
    }
    
}
