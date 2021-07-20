/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.util.Scanner;

/**
 *
 * @author marcu
 */
public class FactoryMethod {

    
    public static void main(String[] args) {
        String tipo;
        bebida b;
        maquinaRefri mr=new maquinaRefri();
        maquinasuco ms=new maquinasuco();
        maquinaCafe mc=new maquinaCafe();
        /*b=mc.entregarBebida();
            System.out.println("a bebida foi"+b.tipoBebida());
        
        b=mr.entregarBebida();
        
          System.out.println("a bebida foi "+b.tipoBebida());
        
        b=ms.entregarBebida();
          System.out.println("a bebida foi "+b.tipoBebida());
       */
        Scanner ler = new Scanner(System.in); 
        System.out.println("digite a bebida que deseja:");
        
        
    }
    
}
