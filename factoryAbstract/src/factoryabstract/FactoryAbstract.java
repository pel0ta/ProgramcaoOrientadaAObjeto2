/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryabstract;

/**
 *
 * @author marcu
 */
public class FactoryAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maquinacocacolacompany c= new Maquinacocacolacompany();
        maquinaambev a= new maquinaambev();
        quiosque q= new quiosque(c);
        
        System.out.println(""+q.getrefri());
        System.out.println(""+q.getsuco());
        
        q.maquina=a;
        
        System.out.println(""+q.getrefri());
        System.out.println(""+q.getsuco());
        
        
        
        
    }
}
