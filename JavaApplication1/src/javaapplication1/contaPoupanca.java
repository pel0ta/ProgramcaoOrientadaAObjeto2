/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author marcu
 */
public class contaPoupanca extends contaBancaria {
    public double taxajuros;

    public contaPoupanca(int numero, int senha, double saldo, cliente cli,double taxajuros) {
        super(numero, senha, saldo, cli);
        this.taxajuros=taxajuros;
    }
    public void sacar(double valor){
        this.saldo=saldo-valor;
    }
    @Override
    public void depositar(double valor){
        this.saldo=saldo+valor;
    }
    
    @Override
    public void impprimirSaldo(){
       this.saldo=taxajuros*saldo;
        System.out.println(""+saldo);
    }
    
}
