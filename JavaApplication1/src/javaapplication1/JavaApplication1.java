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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int senhaa,numero;
        double saldo,valor;
        String nomeTitular;
        clientePF cli=new clientePF();
        cli.nome="marcus";
        cli.sobrenome="antonio";
        cli.endereco="terra";
        contaBancaria c = new contaBancaria(0,0,0,cli);  
        contaCorrente cc= new contaCorrente(123,321,1000,cli,100);
        contaPoupanca cp= new contaPoupanca(135,123,500,cli,1.2);
        
        cc.sacar(5,321);
        System.out.println("saldo conta corrente"+cc.saldo);
        
        cc.depositar(390);
        System.out.println("saldo da conta corrente:"+cc.saldo);
        
        cp.depositar(900);
        System.out.println("saldo conta poupanca"+cp.saldo);
        
        
        cc.sacar(400, 321);
        System.out.println("saldo da conta corrente"+cc.saldo);

        cp.sacar(50);
        System.out.println("saldo da conta poupança"+cp.saldo);
        System.out.println("saldo da conta poupança com os juros rendidos :");
        cp.impprimirSaldo();
        

        System.out.println("valor do imposto "+cc.getvalorImposto());
        
        System.out.println("minimo entre 10 e 20 e :"+Math.min(10,20));
    }
    
}