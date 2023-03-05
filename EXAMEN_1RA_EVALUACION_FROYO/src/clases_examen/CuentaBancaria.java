/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreCliente;
    private int saldo;
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public int getSaldo() {
        return saldo;
    }
 
    public void setNumeroCuenta(String val1) {
        numeroCuenta = val1;
    } 
     public void setNombreCliente(String val1) {
        nombreCliente = val1;
    } 
     
    public CuentaBancaria(){
    numeroCuenta = "";
    nombreCliente = "";
    saldo = 0;
    }
    
    public CuentaBancaria(String numC, String nomC,int sal){
    numeroCuenta=numC;
    nombreCliente=nomC;
    saldo = sal;
    }
    
    public int depositarEnCuenta(int monto){
        return saldo = monto+saldo;   
    }
    public int retirarDeCuenta(int monto){
        
        if(saldo<monto){
            System.out.println("Saldo insuficiente");}
        else{
            saldo = saldo-monto;
        }
        return saldo;
    }
    public void imprimirDatos(){
        
        System.out.println("Número de cuenta: "+ numeroCuenta);
        System.out.println("Nombre del cliente: "+nombreCliente);
        System.out.println("Su saldo es: "+saldo);
    
    }
}
