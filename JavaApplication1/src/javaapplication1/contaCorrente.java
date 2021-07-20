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
public class contaCorrente extends contaBancaria implements tributavel{ 
    public double limiteEspecial;

    public contaCorrente(int numero, int senha, double saldo,cliente cli,double limiteEspecial) {
        super(numero, senha, saldo, cli);
        this.limiteEspecial=limiteEspecial;
        
    }
    
    @Override
    public void sacar(double valor,int senhaa){
        if(this.senha==senhaa){  
        this.saldo=saldo;
            if(saldo+limiteEspecial>valor){
                saldo=saldo-valor;
            }
            else{
                System.out.println("erro no saque: saldo insuficiente ");
            }
        }
        else
            System.out.println("as senhas nao confere");
    }

    @Override
    public double getvalorImposto() {
        return saldo*0.01;
        
    }
    
}
