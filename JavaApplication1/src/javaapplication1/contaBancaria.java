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
public class contaBancaria {
    public int numero;
    protected int senha;
    protected double saldo;
    public cliente cli;
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public contaBancaria(int numero,int senha,double saldo,cliente cli){
        this.numero=numero;
        this.senha=senha;
        this.saldo=saldo;      
    }
    
    public void sacar(double valor,int senhaa){
        
    }
    
    public void depositar(double valor){
        saldo=saldo+valor;
    }
    public void impprimirSaldo(){
    }
    
    
    
}
